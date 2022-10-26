package com.AeropuertoPrimos20.pruebaDefinitiva.servicio;

import com.AeropuertoPrimos20.pruebaDefinitiva.modelo.Vuelos;
import com.AeropuertoPrimos20.pruebaDefinitiva.projection.PsajerrosProjection;
import com.AeropuertoPrimos20.pruebaDefinitiva.projection.VuelotableProjection;

import java.util.List;

public interface VueloServices {

    public List<Vuelos> findAll();

    public Vuelos save(Vuelos vuelos);


    public List<VuelotableProjection> traertabla(String fecha , Long id);

    public VuelotableProjection findById(Long id);

    public List<VuelotableProjection>  buscartodos();

    public  List<PsajerrosProjection> traerPasajeros(Long id);
}
