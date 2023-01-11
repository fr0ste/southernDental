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
f_id_rol int NOT NULL,
foreign key (f_id_rol) references roles_tipos_usuario(id_rol)
);



-- ******************************************** ESQUEMAS DE USUARIOS DE LA APLICACION *******************************

-- tablas administradores de clinica
create table administradores(
id_paciente int not null auto_increment primary key,
nombre1 varchar(50),
nombre2 varchar(50),
apellido1 varchar(50),
apellido2 varchar(50),
numero_trabajador varchar(15),
fecha_nacimiento date,
sexo char,
fk_usuario int,
foreign key (fk_usuario) references usuarios(id_usuario)
);


-- tablas de pacientes


create table tutor(
id_tutor int not null auto_increment primary key,
nombre1 varchar(50),
nombre2 varchar(50),
apellido1 varchar(50),
apellido2 varchar(50),
sexo char,
fecha_nacimiento date,
ocupacion varchar(100),
estado_civil varchar(50)
);


create table paciente(
id_paciente int not null auto_increment primary key,
nombre1 varchar(50),
nombre2 varchar(50),
apellido1 varchar(50),
apellido2 varchar(50),
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
f_id_usuario int not null,
FOREIGN KEY(f_id_usuario) references usuarios(id_usuario),
f_id_tutor int not null,
FOREIGN KEY(f_id_tutor) references tutor(id_tutor)
);


-- ************************datos de personal de salud***********************************
create table catedraticos(
id_catedratico int not null auto_increment primary key,
nombre varchar(100),
nombre2 varchar(100),
apellido varchar(100),
apellido2 varchar(100),
numero_trabajador varchar(15),
f_id_usuario int not null,
FOREIGN KEY(f_id_usuario) references usuarios(id_usuario)

);



create table alumno(
id_alumno int not null auto_increment primary key,
nombre varchar(100),
nombre2 varchar(100),
apellido varchar(100),
apellido2 varchar(100),
semestre int,
grupo int,
matricula varchar(10),
telefono varchar(10),
f_id_catedratico_responsable int not null,
f_id_usuario int not null,
foreign key(f_id_catedratico_responsable) references catedraticos(id_catedratico),
FOREIGN KEY(f_id_usuario) references usuarios(id_usuario)
);

-- ************************************* tablas para los datos de la clinica ************************
create table clinica(
id_clinica int not null auto_increment primary key,
nombre_clinica varchar(100),
direccion varchar(100)

);


-- ************************************* tablas para la cosulta *************************************
--
create table procedimiento_tipo(
id_procedimiento_tipo int not null auto_increment primary key,
nombre varchar(100),
descripcion text
);

-- datos de consulta

create table consulta(
id_consulta int not null auto_increment primary key,
-- id_interrogatorio int,
diagnostico text,
pronostico text,
tratamiento text,
manejo_integral text,
motivo_de_la_consulta text,
fecha_de_consulta date,
f_id_paciente int not null,
f_id_clinica int not null,
f_id_alumno int not null,
f_id_procedimiento_realizado int not null,
FOREIGN KEY(f_id_paciente) references paciente(id_paciente),
FOREIGN KEY(f_id_clinica) references clinica(id_clinica),
FOREIGN KEY(f_id_alumno) references usuarios(id_usuario),
FOREIGN KEY(f_id_procedimiento_realizado) references procedimiento_tipo(id_procedimiento_tipo)
);


