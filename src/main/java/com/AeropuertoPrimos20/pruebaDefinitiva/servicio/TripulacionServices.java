package com.AeropuertoPrimos20.pruebaDefinitiva.servicio;

import com.AeropuertoPrimos20.pruebaDefinitiva.modelo.Tripulacion;

import java.util.List;

public interface TripulacionServices {

    public List<Tripulacion> findAllActivos();

    public Tripulacion save(Tripulacion tripulacion);

    //buscar el usuario
    public Tripulacion findOne(Long id);

    //Eliminar el usuario
    public void delete(Long id);

    public Tripulacion findById(Long id);

}
