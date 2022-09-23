package com.AeropuertoPrimos20.pruebaDefinitiva.servicio;

import com.AeropuertoPrimos20.pruebaDefinitiva.modelo.Aeropuertos;

import java.util.List;

public interface AeropuertoServices {

    public List<Aeropuertos> findAll();
    // paginacion

    //Guardar usuario
    public Aeropuertos save(Aeropuertos aeropuertos);

    //buscar el usuario
    public Aeropuertos findOne(Long id);

    //Eliminar el usuario
    public void delete(Long id);

    public Aeropuertos findById(Long id);
}
