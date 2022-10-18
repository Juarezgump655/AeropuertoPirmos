package com.AeropuertoPrimos20.pruebaDefinitiva.servicio;

import com.AeropuertoPrimos20.pruebaDefinitiva.modelo.Tripulacion;
import com.AeropuertoPrimos20.pruebaDefinitiva.projection.TripulacionProjection;

import java.util.List;

public interface TripulacionServices {

    public    List<Tripulacion> findAllActivos( Long id);

    public Tripulacion save(Tripulacion tripulacion);

    //buscar el usuario
    public Tripulacion findOne(Long id);

    //Eliminar el usuario
    public void delete(Long id);

    public Tripulacion findById(Long id);

    public  List<TripulacionProjection> tableTripu(Long id);

}
