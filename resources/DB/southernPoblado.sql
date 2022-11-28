-- datos de usuario froste
insert into usuarios(nombre_usuario,pass_usuario,email_usuario) values('froste','froste123','73338az@gmail.com');
insert into roles_tipos_usuario(nombre_rol) values('administrador'),('alumno'),('paciente');
insert into roles_usuarios(id_usuario,id_rol) values(1,2);

-- datos de usuario Eli0
insert into usuarios(nombre_usuario,pass_usuario,email_usuario) values('Eli0','elio123','elio@gmail.com');
insert into roles_usuarios(id_usuario,id_rol) values(2,1);
