package com.AeropuertoPrimos20.pruebaDefinitiva.servicio;

import com.AeropuertoPrimos20.pruebaDefinitiva.modelo.Vuelos;

import java.util.List;

public interface VueloServices {

    public List<Vuelos> findAll();

    public Vuelos save(Vuelos vuelos);


    public Vuelos findById(Long id);

}
