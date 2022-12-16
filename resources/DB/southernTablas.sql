use souther_dental;

create table roles_personal_de_salud(
id_roles_personal_de_salud int auto_increment not null primary key,
rol_tipo varchar(80)
);

create table clinica(
id_clinica int auto_increment not null primary key,
nombre_clinica varchar(80)
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
e_mail varchar(100)
);


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

create table signos_vitales(
id_signos_vitales int not null auto_increment primary key,
peso double,
estatura double,
temperatura double,
freacuencia_cardiaca double,
frecuencia_respiratoria double,
pesion_arterial double,
saturacion_oxigeno double
);

create table antecedentes_heredofamiliares(
id_antecedentes_heredofamiliares int not null auto_increment primary key,
Neoplacia boolean,
Neoplacia_rAmplia text,
diabetes boolean,
diabetes text,
hipertencion boolean,
hipertencion text,
padecimientos_mentales_neurologicos boolean,
padecimientos_mentales_neurologicos text,
obecidad boolean,
obecidad text,
padecimientos_hematologicos boolean,
padecimientos_hematologicos text,
malformaciones_congenitas boolean,
malformaciones_congenitas text,
problemas_cardiacos boolean,
problemas_cardiacos text
);

create table antecedentes_personales_no_patologicos(
id_ntecedentes_personales_no_patologicos int not null primary key, 
come_frutas_verduras boolean,
come_carne boolean,
come_cereales boolean,
come_alimentos_chatarra boolean,
dos_litros_de_agua_dia boolean,
uno_mas_refrescos_dia boolean,
horas_duerme_dia int,
baño_veces_x_semana int,
cepillado_dia int,
su_vivienda_tiene_piso int,
material_de_vivienda varchar(30)
);