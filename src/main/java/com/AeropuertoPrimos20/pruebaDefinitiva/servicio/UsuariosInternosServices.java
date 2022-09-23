package com.AeropuertoPrimos20.pruebaDefinitiva.servicio;

import com.AeropuertoPrimos20.pruebaDefinitiva.modelo.UsuariosInternos;
import com.AeropuertoPrimos20.pruebaDefinitiva.projection.RoleNameProjection;

import java.util.List;

public interface UsuariosInternosServices {

    //metodo para buscar todos los empleados
    public List<UsuariosInternos> findAll();

    public List<RoleNameProjection> traerNombre();
    // paginacion

    //Guardar usuario
    public UsuariosInternos save(UsuariosInternos UsuarioInterno);

    //buscar el usuario
    public UsuariosInternos findOne(Long id);

    //Eliminar el usuario
    public void delete(Long id);

    public UsuariosInternos findById(Long id);

}
