# API de AdminClientes 
AdminClientesAPI
Descripción
AdminClientesAPI es una API RESTful desarrollada en Java utilizando el framework Spring Boot. Su propósito es proporcionar servicios para la gestión de usuarios, clientes, auditorías y la integración con un servicio externo para obtener información del clima.

Características
Gestión de usuarios (CRUD).
Gestión de clientes (CRUD).
Registro de auditorías para todas las acciones realizadas en el sistema.
Integración con un servicio externo para consultar el clima.
Documentación con Swagger UI.
Acceso segmentado según los perfiles de usuario: ADMIN y USER.
Tecnologías utilizadas
Java (Spring Boot)
Maven (Gestión de dependencias)
MySQL (Base de datos)
Swagger UI (Documentación interactiva)
Lombok (Reducir código boilerplate)
Requisitos previos
Antes de iniciar el proyecto, asegúrate de tener instalados los siguientes componentes:

JDK 11 o superior
Apache Maven
MySQL (configuración incluida en application.properties)
Instalación
Paso 1: Clonar el repositorio
bash
Copiar código
git clone https://github.com/mleon98/AdminClientesAPI.git
cd AdminClientesAPI
Paso 2: Configurar la base de datos
Crear una base de datos MySQL:
sql
Copiar código
CREATE DATABASE admin_clientes;
Importar el script SQL proporcionado en el repositorio:
bash
Copiar código
mysql -u [usuario] -p admin_clientes < Script_BD_Mega.sql
Paso 3: Configurar propiedades de la aplicación
Editar el archivo src/main/resources/application.properties con las credenciales de tu base de datos:

properties
Copiar código
spring.datasource.url=jdbc:mysql://localhost:3306/admin_clientes
spring.datasource.username=tu_usuario
spring.datasource.password=tu_contraseña
spring.jpa.hibernate.ddl-auto=update
Paso 4: Compilar y ejecutar el proyecto
Compilar el proyecto con Maven:

bash
Copiar código
mvn clean install
Ejecutar la aplicación:

bash
Copiar código
mvn spring-boot:run
Endpoints disponibles
Usuarios
Método	Endpoint	Descripción
GET	/api/usuarios	Obtener todos los usuarios
GET	/api/usuarios/{id}	Obtener un usuario por ID
POST	/api/usuarios	Crear un nuevo usuario
PUT	/api/usuarios/{id}	Actualizar un usuario existente
DELETE	/api/usuarios/{id}	Eliminar un usuario
Clientes
Método	Endpoint	Descripción
GET	/api/clientes	Obtener todos los clientes
GET	/api/clientes/{id}	Obtener un cliente por ID
POST	/api/clientes	Crear un nuevo cliente
PUT	/api/clientes/{id}	Actualizar un cliente existente
DELETE	/api/clientes/{id}	Eliminar un cliente
Auditoría
Método	Endpoint	Descripción
GET	/api/auditoria	Obtener todos los registros
POST	/api/auditoria	Registrar una nueva auditoría
Clima
Método	Endpoint	Descripción
GET	/api/clima/{ciudad}	Obtener clima para una ciudad
Documentación Swagger
La documentación Swagger está disponible en:

bash
Copiar código
http://localhost:8080/swagger-ui/index.html
Estructura del proyecto
bash
Copiar código
AdminClientesAPI/
├── src/main/java/com/example/adminclientes/
│   ├── controller/   # Controladores REST
│   ├── model/        # Entidades JPA
│   ├── repository/   # Repositorios (Spring Data JPA)
│   ├── service/      # Lógica de negocio (opcional)
├── src/main/resources/
│   ├── application.properties  # Configuración de la aplicación
└── pom.xml           # Archivo Maven
Contribución
Haz un fork del proyecto.
Crea una rama con tu funcionalidad: git checkout -b feature/nueva-funcionalidad.
Haz commit de tus cambios: git commit -m 'Agregar nueva funcionalidad'.
Haz push a tu rama: git push origin feature/nueva-funcionalidad.
Abre un Pull Request.
Autor
Miguel León
Correo: mleon98@gmail.com

Licencia
Este proyecto está licenciado bajo los términos de la licencia MIT.

