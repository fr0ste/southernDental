drop database if exists southern_dental;
create database southern_dental;
use southern_dental;

-- ******************************************** ESQUEMAS PARA LOS USUARIOS DEL LOGUEO *******************************


-- Tabla tipos de roles
CREATE TABLE roles_tipos_usuario
(
id_rol INT auto_increment PRIMARY KEY,
nombre_rol VARCHAR (50) NOT NULL
);

-- Tabla usuario
CREATE TABLE usuarios
(id_usuario INT auto_increment PRIMARY KEY,
nombre_usuario VARCHAR (20) NOT NULL,
pass_usuario VARCHAR (15) NOT NULL,
email_usuario varchar (100) not NULL,
id_rol int NOT NULL,
foreign key (id_rol) references roles_tipos_usuario(id_rol)
);



-- ******************************************** ESQUEMAS DE USUARIOS DE LA APLICACION *******************************

-- tablas de pacientes


create table tutor(
id_tutor int not null auto_increment primary key,
nombre1 varchar(50),
nombre2 varchar(50),
apellido1 varchar(50),
apellido2 varchar(50),
sexo char,
ocupacion varchar(100),
estado_civil varchar(50)
);


create table paciente(
id_paciente int not null auto_increment primary key,
nombre1 varchar(50),
nombre2 varchar(50),
apellido1 varchar(50),
apellido2 varchar(50),
edad int,
sexo char,
grupo_etnico varchar(50),
ocupacion varchar(80),
fecha_nacimiento date,
domicilio varchar(100),
estado_civil varchar(50),
religion varchar(50),
fecha_ingreso date,
nacionalidad varchar(50),
localidad varchar(100),
e_mail varchar(100),
f_id_usuario int,
FOREIGN KEY(f_id_usuario) references usuarios(id_usuario),
f_id_tutor int,
FOREIGN KEY(f_id_tutor) references tutot(id_tutor)
);


-- ************************datos de personal de salud***********************************
create table catedraticos(
id_catedratico int not null auto_increment primary key,
nombre varchar(100),
nombre2 varchar(100),
apellido varchar(100),
apellido2 varchar(100)

);



create table alumno(
id_alumno int not null auto_increment primary key,
nombre varchar(100),
nombre2 varchar(100),
apellido varchar(100),
apellido2 varchar(100),
semestre int,
grupo int,
id_catedratico_responsable int not null,
foreign key(id_catedratico_responsable) references catedraticos(id_catedratico)
);
