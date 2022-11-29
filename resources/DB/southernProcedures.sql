delimiter $$
  create procedure validarUsuario(in nombreBuscar varchar(20), rolBuscar varchar(50),passBuscar VARCHAR (15))
begin
with consulta as (select nombre_usuario,email_usuario,nombre_rol,pass_usuario from usuarios inner join roles_tipos_usuario right join roles_usuarios on usuarios.id_usuario = roles_usuarios.id_usuario and roles_tipos_usuario.id_rol=roles_usuarios.id_rol) 
    select * from consulta where nombre_usuario=nombreBuscar and nombre_rol=rolBuscar and pass_usuario=passBuscar;
end $$ 
    
    
  delimiter $$
  create procedure obtenerRoles()
begin
select nombre_rol from roles_tipos_usuario;
end $$   