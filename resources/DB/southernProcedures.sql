delimiter $$
  create procedure validarUsuario(in nombreBuscar varchar(20), rolBuscar varchar(50))
begin
with consulta as (select nombre_usuario,email_usuario,nombre_rol from usuarios inner join roles_tipos_usuario right join roles_usuarios on usuarios.id_usuario = roles_usuarios.id_usuario and roles_tipos_usuario.id_rol=roles_usuarios.id_rol) 
    select * from consulta where nombre_usuario=nombreBuscar and nombre_rol=rolBuscar;
end $$ 
    