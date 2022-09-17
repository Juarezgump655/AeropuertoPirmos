package com.AeropuertoPrimos20.pruebaDefinitiva.servicio;

import com.AeropuertoPrimos20.pruebaDefinitiva.modelo.Aeropuertos;
import org.springframework.data.domain.Page;

import java.awt.print.Pageable;
import java.util.List;

public interface AeropuertoServices {

    public List<Aeropuertos> findAll();
    // paginacion

    public Page<Aeropuertos> findAll(Pageable pageable);

    //Guardar usuario
    public void save(Aeropuertos aeropuertos);

    //buscar el usuario
    public Aeropuertos findOne(Long id);

    //Eliminar el usuario
    public void delete(Long id);

}
