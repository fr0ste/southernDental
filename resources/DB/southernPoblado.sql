use southern_dental;

-- insertamos los roles de los usuarios del sistema
insert into roles_tipos_usuario(nombre_rol) values ('administrador'),('profesor'),('alumnos');

-- agregamos usuarios a la base de datos
insert into usuarios(nombre_usuario,pass_usuario,email_usuario,f_id_rol) 
values ('Carlos','carlos123','carlos@mail.com','1'), ('juan','juan123','juan@mail.com','2'),
('ana','ana123','ana@mail.com','3'),('agus','a123','a@mail.com','2');


-- agregamos a los administradores de la aplicacion
insert into administradores(nombre1,nombre2,apellido1,apellido2,fecha_nacimiento,sexo,fk_usuario) 
values('Carlos','Aurelio','Alcantara','Perez',"2001-01-23",'M',1),
('Getzemani','Alejandro','Martinez','Rodriguez',"2000-06-12",'M',2);

-- agregamos datos de los profesores
insert into catedraticos(nombre,nombre2,apellido,apellido2,numero_trabajador,f_id_usuario)
values('Agustin','','Perez','','9212532667',4);

-- agregamos datos de alumnos
insert into alumnos(nombre,nombre2,apellido,apellido2,semestre,grupo,matricula,telefono,f_id_catedratico_responsable,f_id_usuario)
values('ana','','Aguilar','',7,'717','125452311','9515476231',1,3); 