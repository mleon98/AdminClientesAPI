-- 1.1 Creación de la base de datos
CREATE DATABASE IF NOT EXISTS mlsistem_clientes;
USE mlsistem_clientes;

-- 1.2 Tablas
-- Tabla para usuarios
CREATE TABLE IF NOT EXISTS usuarios (
    id_usuario INT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(50) NOT NULL UNIQUE,
    password_hash VARCHAR(255) NOT NULL,
    perfil ENUM('ADMIN', 'USER') NOT NULL,
    fecha_creacion TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

-- Tabla para clientes
CREATE TABLE IF NOT EXISTS clientes (
    id_cliente INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    email VARCHAR(100) NOT NULL UNIQUE,
    telefono VARCHAR(15),
    direccion VARCHAR(255),
    fecha_registro TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

-- Tabla para auditoría
CREATE TABLE IF NOT EXISTS auditoria (
    id_auditoria INT AUTO_INCREMENT PRIMARY KEY,
    id_usuario INT NOT NULL,
    accion VARCHAR(255) NOT NULL,
    fecha TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (id_usuario) REFERENCES usuarios(id_usuario) ON DELETE CASCADE
);

-- 1.3 Índices
-- Índice para optimizar búsquedas en la tabla clientes
CREATE INDEX idx_email ON clientes(email);

-- Índice compuesto para auditoría
CREATE INDEX idx_usuario_accion ON auditoria(id_usuario, accion);

-- 1.4 Control de Integridad Referencial
-- Ya aplicado en la tabla de auditoría con la relación id_usuario

-- 1.5 Poblar la Base de Datos
-- Insertar perfiles de usuario
INSERT INTO usuarios (username, password_hash, perfil)
VALUES
('admin','admin', 'ADMIN'),
('usuario','usuario', 'USER');

-- Insertar clientes
INSERT INTO clientes (nombre, email, telefono, direccion)
VALUES
('Juan Pérez', 'juan.perez@example.com', '5551234567', 'Calle Falsa 123'),
('María Gómez', 'maria.gomez@example.com', '5557654321', 'Av. Principal 456');

-- Insertar auditoría de prueba
INSERT INTO auditoria (id_usuario, accion)
VALUES
(1, 'CREACION_USUARIO'),
(1, 'CREACION_CLIENTE');

-- 1.6 Documentación del Script
/*
  - Base de Datos: clientes_db
  - Tablas:
    1. usuarios: Almacena información de los usuarios del sistema.
    2. clientes: Registra datos de los clientes.
    3. auditoria: Lleva un control de las acciones realizadas por los usuarios.
  - Índices:
    - idx_email: Para búsquedas rápidas en el correo de clientes.
    - idx_usuario_accion: Para optimizar las consultas en la tabla auditoria.
  - Integridad Referencial:
    - auditoria.id_usuario referencia usuarios.id_usuario.
  - Poblado:
    - Se crean usuarios con roles ADMIN y USER.
    - Clientes de ejemplo.
    - Auditoría de prueba.
*/
