AdminClientesAPI
Descripción
Esta es una API desarrollada en Spring Boot para la administración de clientes. Incluye funcionalidades de gestión de usuarios, auditoría de acciones y consumo de un servicio externo para obtener datos climáticos.

Requisitos Previos
Antes de ejecutar la aplicación, asegúrate de tener instalado:

Java 17 o superior.
Maven (para gestión de dependencias).
MySQL (como motor de base de datos).
Postman o cualquier cliente HTTP para probar los endpoints (opcional).
Instalación
Clona el repositorio:

git clone https://github.com/mleon98/AdminClientesAPI.git
cd AdminClientesAPI
Configura la base de datos:

Crea una base de datos en MySQL llamada admin_clientes.
Ejecuta el script Script_BD_Mega.sql ubicado en el repositorio para crear y poblar las tablas.
Configura el archivo application.properties: Modifica las credenciales de tu base de datos en src/main/resources/application.properties:

spring.datasource.url=jdbc:mysql://localhost:3306/admin_clientes
spring.datasource.username=TU_USUARIO
spring.datasource.password=TU_CONTRASEÑA
Compila y ejecuta la aplicación:

mvn clean install
mvn spring-boot:run
La API estará disponible en http://localhost:8080.

Endpoints Documentados
Usuarios
Método	Endpoint	Descripción
GET	/api/usuarios	Obtiene todos los usuarios
GET	/api/usuarios/{id}	Obtiene un usuario por ID
POST	/api/usuarios	Crea un nuevo usuario
PUT	/api/usuarios/{id}	Actualiza un usuario existente
DELETE	/api/usuarios/{id}	Elimina un usuario por ID

Clientes
Método	Endpoint	Descripción
GET	/api/clientes	Obtiene todos los clientes
GET	/api/clientes/{id}	Obtiene un cliente por ID
POST	/api/clientes	Crea un nuevo cliente
PUT	/api/clientes/{id}	Actualiza un cliente existente
DELETE	/api/clientes/{id}	Elimina un cliente por ID

Auditoría
Método	Endpoint	Descripción
GET	/api/auditoria	Obtiene todos los registros
POST	/api/auditoria	Crea un registro de auditoría

Servicio Clima
Método	Endpoint	Descripción
GET	/api/clima/{ciudad}	Obtiene datos del clima por ciudad
Swagger (Documentación Interactiva)

La documentación de la API está disponible en http://localhost:8080/swagger-ui.html cuando se ejecuta la aplicación.

Licencia
Este proyecto está bajo la licencia MIT.

Contacto
Desarrollado por Miguel León.
Correo: mleon98@gmail.com
Repositorio en GitHub
