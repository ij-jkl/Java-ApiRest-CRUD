# API Rest - JAVA (CRUD)
Este proyecto es una API REST usando Java Spring Boot. Las herramientas utilizadas fueron las siguientes : 

-Una Base de datos **PostgreSQL**.

-**Postman** para el uso de la API y CRUD.

-**Docker** para obtener la instancia de la BDD postgres.

-**pgAdmin4** para querys en la BDD.

-**Hibernate** para el Mapeo de los Objetos.

-**Maven** para la selección de Dependencias.

# Capturas sobre la funcionalidad de la API Rest
Acá observamos la imagen montada desde la Aplicación de Docker : 

![WhatsApp Image 2024-07-22 at 15 41 28](https://github.com/user-attachments/assets/a5eba004-ae47-42d2-8695-8f4d2be48c0d)


Aquí observamos el método findAll desde Postman (Devuelve todo lo que este almacenado en la Base de datos) : 

![WhatsApp Image 2024-07-22 at 15 42 10](https://github.com/user-attachments/assets/16c17122-7da6-46aa-8e23-7895b0d0c14b)


Aquí observamos el método findById (Buscamos un solo objeto mediante su ID) : 

![WhatsApp Image 2024-07-22 at 15 42 27](https://github.com/user-attachments/assets/df0a4653-dcef-45b4-bff5-779f2df2945f)


Aquí observamos el método POST para crear un nuevo Producto, de ser correcto retorna un código HTTP 201 : 

![WhatsApp Image 2024-07-22 at 15 42 45](https://github.com/user-attachments/assets/f79bf815-8839-4e28-8a72-7cb8bcfb4278)


Aquí observamos el método PUT para actualizar un Producto ya existente en la Base ( Debemos especificar el ID y enviarle información en el body a través de un JSON) : 

![WhatsApp Image 2024-07-22 at 15 43 03](https://github.com/user-attachments/assets/c3b557c6-0105-4a77-bb25-021f069dc372)


Ultimo metodo que nos permite eliminar un producto creado en la Base de datos (Hacemos referencia al producto mediante su ID, y se elimina retornando un código HTTP 204) : 

![WhatsApp Image 2024-07-22 at 15 43 23](https://github.com/user-attachments/assets/3dc1bf60-e473-4273-bf01-2d8ec83df114)


Aquí observamos la Base de Datos con Productos ya cargados (Visualización mediante pgAdmin4) : 

![WhatsApp Image 2024-07-22 at 15 38 44](https://github.com/user-attachments/assets/85c170b4-6788-4ca4-bb86-b560ddd74937)


# Para utilizar el proyecto

Tener en cuenta de remplazar las variables de entorno en los siguientes archivos : 

docker-compose.yml

applications.propeties

.env-template (Re llenar con sus datos para poder realizar la coneccion y que las variables de entorno aplicadas en los archivos previamente mencionados funcione)


