package com.AeropuertoPrimos20.pruebaDefinitiva.servicio;

import com.AeropuertoPrimos20.pruebaDefinitiva.modelo.UsuariosInternos;
import org.springframework.data.domain.Page;

import java.awt.print.Pageable;
import java.util.List;

public interface UsuariosInternosServices {

    //metodo para buscar todos los empleados
    public List<UsuariosInternos> findAll();
    // paginacion

    public Page<UsuariosInternos> findAll(Pageable pageable);

    //Guardar usuario
    public void save(UsuariosInternos UsuarioInterno);

    //buscar el usuario
    public UsuariosInternos findOne(Long id);

    //Eliminar el usuario
    public void delete(Long id);


}
