package com.AeropuertoPrimos20.pruebaDefinitiva.servicio;

import com.AeropuertoPrimos20.pruebaDefinitiva.modelo.Puerta;
import com.AeropuertoPrimos20.pruebaDefinitiva.projection.puertaProjection;

import java.util.List;

public interface PuertaServices {

    public Puerta save(Puerta puerta);

    public Puerta findById(Long id);

    public void saveAll(List<Puerta> listaPuerta);

    public List<puertaProjection> buscarPuertas( Long id);

}
