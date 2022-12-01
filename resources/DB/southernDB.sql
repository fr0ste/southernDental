-- Creación de la base de datos
CREATE DATABASE southern_dental;

USE southern_dental;

-- Tabla usuario
CREATE TABLE usuarios
(id_usuario INT auto_increment PRIMARY KEY,
nombre_usuario VARCHAR (20) NOT NULL,
pass_usuario VARCHAR (15) NOT NULL,
email_usuario varchar (100) not NULL
);

-- Tabla tipos de roles
CREATE TABLE roles_tipos_usuario
(
id_rol INT auto_increment PRIMARY KEY,
nombre_rol VARCHAR (50) NOT NULL
);

-- Tabla intermedia ( Tabla usuarios y tabla roles_tipos_usuarios
create table roles_usuarios
(
id_roles_usuarios INT auto_increment PRIMARY KEY,
id_usuario INT NOT NULL, 
FOREIGN KEY(id_usuario) REFERENCES usuarios(id_usuario),
id_rol int NOT NULL,
foreign key (id_rol) references roles_tipos_usuario(id_rol)
);