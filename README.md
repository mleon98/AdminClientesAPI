# Introducción a AdminClientesAPI

Este proyecto es una API backend desarrollada con [Spring Boot](https://spring.io/projects/spring-boot).

## Endpoints Disponibles

### Usuarios

- **GET `/api/usuarios`**  
  Obtiene todos los usuarios de la base de datos.

- **GET `/api/usuarios/{id}`**  
  Obtiene un usuario por su ID.

- **POST `/api/usuarios`**  
  Crea un nuevo usuario. El cuerpo de la solicitud debe incluir `username`, `passwordHash` y `perfil`.

- **PUT `/api/usuarios/{id}`**  
  Actualiza un usuario existente. El cuerpo de la solicitud debe incluir los campos que se desean actualizar.

- **DELETE `/api/usuarios/{id}`**  
  Elimina un usuario por su ID.

### Clientes

- **GET `/api/clientes`**  
  Obtiene todos los clientes de la base de datos.

- **GET `/api/clientes/{id}`**  
  Obtiene un cliente por su ID.

- **POST `/api/clientes`**  
  Crea un nuevo cliente. El cuerpo de la solicitud debe incluir `nombre`, `email`, `telefono` y `direccion`.

- **PUT `/api/clientes/{id}`**  
  Actualiza un cliente existente. El cuerpo de la solicitud debe incluir los campos que se desean actualizar.

- **DELETE `/api/clientes/{id}`**  
  Elimina un cliente por su ID.

### Auditoría

- **GET `/api/auditoria`**  
  Obtiene todos los registros de auditoría de la base de datos.

- **POST `/api/auditoria`**  
  Crea un nuevo registro de auditoría. El cuerpo de la solicitud debe incluir `id_usuario`, `accion` y `fecha`.

### Clima

- **GET `/api/clima/{ciudad}`**  
  Obtiene información del clima para una ciudad específica utilizando un servicio externo.

## Requisitos

Antes de ejecutar la aplicación, asegúrate de tener instalados los siguientes requisitos:
- Java 17 o superior.
- Maven.
- MySQL.

## Instrucciones de Configuración

### Configuración de la Base de Datos

1. Crea una base de datos llamada `admin_clientes`.
2. Ejecuta el script SQL `Script_BD_Mega.sql` para crear y poblar las tablas de la base de datos.

### Configuración de la Aplicación

1. Modifica el archivo `application.properties` en `src/main/resources` con las credenciales de tu base de datos:
   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/admin_clientes
   spring.datasource.username=tu_usuario
   spring.datasource.password=tu_contraseña

### Ejecución de la Aplicación
En el directorio del proyecto, ejecuta los siguientes comandos:

Compila el proyecto:
mvn clean install

Ejecuta la aplicación:
mvn spring-boot:run

La API estará disponible en http://localhost:8080.

### Documentación Swagger
Este proyecto incluye Swagger para la documentación de la API. Una vez que la aplicación esté ejecutándose, abre http://localhost:8080/swagger-ui.html para ver la documentación interactiva de la API.

### Endpoints Disponibles
Usuarios
GET /api/usuarios
Obtener todos los usuarios.

GET /api/usuarios/{id}
Obtener un usuario por su ID.

POST /api/usuarios
Crear un nuevo usuario.

PUT /api/usuarios/{id}
Actualizar un usuario existente.

DELETE /api/usuarios/{id}
Eliminar un usuario existente.

Clientes
GET /api/clientes
Obtener todos los clientes.

GET /api/clientes/{id}
Obtener un cliente por su ID.

POST /api/clientes
Crear un nuevo cliente.

PUT /api/clientes/{id}
Actualizar un cliente existente.

DELETE /api/clientes/{id}
Eliminar un cliente existente.

Auditoría
GET /api/auditoria
Obtener todos los registros de auditoría.
Clima
GET /api/clima/{ciudad}
Obtener información del clima para una ciudad específica.

### Licencia
Este proyecto está licenciado bajo la Licencia MIT. Consulta el archivo LICENSE para más detalles.

### Contribuciones
¡Las contribuciones son bienvenidas! Por favor, abre un issue o envía un pull request.

### Contacto
Desarrollado por Miguel León.
Correo: mleon98@gmail.com
GitHub: AdminClientesAPI
