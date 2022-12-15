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
e_mail varchar(100)
);