use southern_dental;

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
observaciones text
);

create table perfil_facial(
id_perfil_facial int auto_increment,
tipo_perfil varchar(80)
);

create table frente_facial(
id_frente_facial int not null primary key,
tipo_frente varchar(80)
);

create table examen_facial(
id_examen_facial int not null primary key,
id_perfil int,
id_frente int,
senias_particulares text
);

create table examen_facial(
id_examen_facial int not null primary key,
id_perfil int,
id_frente int,
senias_particulares text
);

create table personal_de_salud(
id_personal_de_salud int not null auto_increment primary key,
nombre varchar(100)
);

create table consulta(
id_consulta int auto_increment not null primary key,
id_tipo_consulta_f int,
id_personal_de_salud_f int,
id_clinica int
);

create table procedimiento_tipo(
id_procedimiento_tipo int auto_increment not null primary key,
nombre varchar(100),
descripcion text
);

create table analisis_funcional(
id_analisis_funcional int not null auto_increment primary key,
Deglución text,
Fonación_masticación text,
Respiración text,
Observaciones text
);

create table postura_del_paciente(
id_postura_del_paciente int not null auto_increment primary key,
atm_palpacion text
);

create table examen_bucal(
id_examen_bucal int not null auto_increment primary key,
Relación_molar_Derecha text,
Relación_molar_Izquierda text,
Relación_canina_Derecha text,
Relación_canina_Izquierda text
);

create table analis_radiografico(
analis_radiografico int not null auto_increment primary key,
Periapical text,
cefalica_lateral text,
Panoramica text
);

create table modelos_de_estudio_fotografias(
modelos_de_estudio_fotografias int not null auto_increment primary key,
Modelos_de_estudio text,
Tipo_de_arcada text,
Fotografías text
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
Otras_señas_particulares text
);



-- procedimientos

