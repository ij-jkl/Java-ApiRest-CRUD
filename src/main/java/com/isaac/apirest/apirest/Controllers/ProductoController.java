package com.isaac.apirest.apirest.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.isaac.apirest.apirest.Entities.Producto;
import com.isaac.apirest.apirest.Repositories.ProductoRepository;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
@RequestMapping("/Productos")
public class ProductoController {
    
    //Hacemos refenrecia al repositorio de productos y lo instanciamos
    @Autowired
    private ProductoRepository productoRepository; 

    //Get All
    @GetMapping
    public List<Producto> getAllProductos(){
        return productoRepository.findAll();            
    }

    //Get byId
    @GetMapping("/{id}")
    public Producto getByID(@PathVariable Long id){
        return productoRepository.findById(id)
        .orElseThrow(() -> new RuntimeException("No se encontro el procucto con la ID : " + id));
    }

    //Post
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    //Realizamos un request body para recibir todas las cosas especificadas en la entidad de Producto
    public Producto createProducto(@RequestBody Producto producto){
        return productoRepository.save(producto);   
    }

    //Put
    @PutMapping("/{id}")
    public Producto updateProducto(@PathVariable Long id, @RequestBody Producto detallesProducto) {
        Producto producto = productoRepository.findById(id)
        .orElseThrow(() -> new RuntimeException("No se encontro el procucto con la ID : " + id));

        producto.setNombre(detallesProducto.getNombre());
        producto.setPrecio(detallesProducto.getPrecio());

        return productoRepository.save(producto);
    }

    //Delete
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{id}")
    public String deleteProduct(@PathVariable Long id){
        Producto producto = productoRepository.findById(id)
        .orElseThrow(() -> new RuntimeException("No se encontro el producto con la ID : " + id));

        productoRepository.delete(producto);

        return "El producto con la ID : " + id + " fue eliminado correctamente de la Base de Datos";
    }

}
