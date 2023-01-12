drop database if exists southern_dental;
create database southern_dental;
use southern_dental;

-- ******************************************** ESQUEMAS PARA LOS USUARIOS (LOGUEO) *******************************


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



-- ******************************************** ESQUEMAS DE USUARIOS DE LA APLICACION (usuarios finales)*******************************

-- tablas administradores de clinica
create table administradores(
id_paciente int not null auto_increment primary key,
nombre1 varchar(50),
nombre2 varchar(50),
apellido1 varchar(50),
apellido2 varchar(50),
numero_trabajador varchar(15),
fecha_nacimiento date,
sexo char, -- utilizar un check para validar si es f, m u otro
fk_usuario int,
foreign key (fk_usuario) references usuarios(id_usuario)
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

create table alumnos(
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

-- *********************************esquemas para los pacientes**************************************
-- tablas de pacientes
create table tutor( -- se necesitará de un tutor si se es menor de edad
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
fk_id_tutor int,
FOREIGN KEY(fk_id_tutor) references tutor(id_tutor)
);



-- INTERROGATORIO NECESARIO PARA LOS PACIENTES


CREATE TABLE antecedentes_heredofamiliares (
    id_antecedentes_heredofamiliares INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    Neoplacia BOOLEAN,
    Neoplacia_rAmplia TEXT,
    diabetes BOOLEAN,
    diabetes_amplio TEXT,
    hipertencion BOOLEAN,
    hipertencion_amplio TEXT,
    padecimientos_mentales_neurologicos BOOLEAN,
    padecimientos_mentales_neurologicos_amplio TEXT,
    obecidad BOOLEAN,
    obecidad_amplio TEXT,
    padecimientos_hematologicos BOOLEAN,
    padecimientos_hematologicos_amplio TEXT,
    malformaciones_congenitas BOOLEAN,
    malformaciones_congenitas_amplio TEXT,
    problemas_cardiacos BOOLEAN,
    problemas_cardiacos_amplio TEXT,
fk_id_paciente int,
FOREIGN KEY(fk_id_paciente) references paciente(id_paciente)
);



create table antecedentes_personales_no_patologicos(
id_antecedentes_personales_no_patologicos int not null primary key, 
come_frutas_verduras boolean,
come_carne boolean,
come_cereales boolean,
come_alimentos_chatarra boolean,
toma_dos_litros_de_agua_x_dia boolean,
uno_mas_refrescos_dia boolean,
horas_duerme_dia int,
baño_veces_x_semana int,
cepillado_x_dia int,
su_vivienda_tiene_piso int,
material_de_vivienda varchar(30),
fk_id_paciente int,
FOREIGN KEY(fk_id_paciente) references paciente(id_paciente)
);


create table antecedentes_personales_patologicos(
id_antecedentes_personales_patologicos int not null primary key,
tabaquismo boolean,
alcoholismo boolean,
otras_sustancias_psicoactivas_recreativas boolean,
perforaciones boolean, 
tatuajes boolean,
neoplastia boolean,
diabetes boolean,
hipertension_arterial boolean,
pedecimientos_mentales boolean,
obesidad_diagnosticada boolean,
padecimientos_hematologicos boolean,
malformaciones_congenitas_sindromes boolean,
problemas_cardiacos boolean,
radioterapia_quimioterapia boolean,
padecimientos_reumatologicos boolean,
enfermedades_del_rinion boolean,
ets boolean,
hipertiroidismo_hipotiroidismo boolean,
enfermedades_de_vias_aereas boolean,
probleamas_oculares boolean,
enfermedades_digestivas boolean,
tuberculosis boolean,
enfermedades_de_la_piel boolean,
trasplantes_de_organos boolean,
ha_sido_hospitalizado text,
ha_tomado_un_medicamento_recientemente text,
ha_tenido_algun_problema_con_anestesia text,
alergia_medicamento_sustancia text,
embarazo text,
observaciones text,
fk_id_paciente int,
FOREIGN KEY(fk_id_paciente) references paciente(id_paciente)
);


create table examen_facial(
id_examen_facial int not null primary key,
perfil text,
frente text,
senias_particulares text,
fk_id_paciente int,
FOREIGN KEY(fk_id_paciente) references paciente(id_paciente)
);


create table analisis_funcional(
id_analisis_funcional int not null auto_increment primary key,
Deglución text,
Fonación_masticación text,
Respiración text,
Observaciones text,
fk_id_paciente int,
FOREIGN KEY(fk_id_paciente) references paciente(id_paciente)
);


create table postura_del_paciente(
id_postura_del_paciente int not null auto_increment primary key,
atm_palpacion text,
fk_id_paciente int,
FOREIGN KEY(fk_id_paciente) references paciente(id_paciente)
);

create table examen_bucal(
id_examen_bucal int not null auto_increment primary key,
Relación_molar_Derecha text,
Relación_molar_Izquierda text,
Relación_canina_Derecha text,
Relación_canina_Izquierda text,
fk_id_paciente int,
FOREIGN KEY(fk_id_paciente) references paciente(id_paciente)
);


create table analisis_radiografico(
id_analisis_radiografico int not null auto_increment primary key,
Periapical text,
cefalica_lateral text,
Panoramica text,
fk_id_paciente int,
FOREIGN KEY(fk_id_paciente) references paciente(id_paciente)
);

create table modelos_de_estudio_fotografias(
id_modelos_de_estudio_fotografias int not null auto_increment primary key,
Modelos_de_estudio text,
Tipo_de_arcada text,
Fotografias text,
fk_id_paciente int,
FOREIGN KEY(fk_id_paciente) references paciente(id_paciente)
);


create table estudio_de_laboratorio_biopsia(
id_estudio_de_laboratorio_biopsia int not null auto_increment primary key,
tipo_de_estudio text,
tipo_de_biopsia text,
region_de_biopsia text,
región_donde_se_realizó_biopsia text,
laboratorio_donde_se_envia_el_estudio text,
fk_id_paciente int,
FOREIGN KEY(fk_id_paciente) references paciente(id_paciente)
);


create table interconsulta_medica(
id_interconsulta_medica int not null auto_increment primary key,
nombre_medico text,
razon text,
motivo_de_diagnostico_presuntivo text,
Motivo_de_envio text,
servicio_al_que_se_envia text,
fk_id_paciente int,
FOREIGN KEY(fk_id_paciente) references paciente(id_paciente)
);

create table examen_clinico(
id_examen_clinico int not null auto_increment primary key,
Paladar text,
Istmo_fauces text,
Mucosa_yugal text,
Nódulos_linfáticos text,
Lengua text,
Piso_boca text,
Labios text,
Glándulas_salivales text,
Encía text,
Frenillos text,
Saliva text,
Otras_señas_particulares text,
fk_id_paciente int,
FOREIGN KEY(fk_id_paciente) references paciente(id_paciente)
);


-- ******************************************ESQUEMAS DE LAS CONSULTAS **********************************

-- signos vitales tomados en cada consulta 
create table signos_vitales(
id_signos_vitales int not null auto_increment primary key,
peso double,
estatura double,
temperatura double,
frecuencia_cardiaca double,
frecuencia_respiratoria double,
pesion_arterial double,
saturacion_oxigeno double,
glucosa double,
pulso double
);


create table consulta(
id_consulta int not null auto_increment primary key,
diagnostico text,
pronostico text,
tratamiento text,
manejo_integral text,
motivo_de_la_consulta text,
fecha_de_consulta date,
fk_id_signos_vitales int not null,
fk_id_paciente int not null,
fk_id_clinica int not null,
fk_id_alumno int not null,
fk_id_procedimiento_realizado int not null,
FOREIGN KEY(fk_id_paciente) references paciente(id_paciente),
FOREIGN KEY(fk_id_clinica) references clinica(id_clinica),
FOREIGN KEY(fk_id_alumno) references usuarios(id_usuario),
FOREIGN KEY(fk_id_signos_vitales) references signos_vitales(id_signos_vitales)
-- FOREIGN KEY(fk_id_procedimiento_realizado) references procedimiento_tipo(id_procedimiento_tipo)
);




-- ********************************** PROCEDIMIENTOS **********************************************************



