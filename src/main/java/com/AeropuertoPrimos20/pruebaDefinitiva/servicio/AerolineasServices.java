package com.AeropuertoPrimos20.pruebaDefinitiva.servicio;


import com.AeropuertoPrimos20.pruebaDefinitiva.modelo.Aerolineas;

import java.util.List;

public interface AerolineasServices {

    public List<Aerolineas> findAll();
    // paginacion

    //Guardar usuario
    public Aerolineas save(Aerolineas aerolineas);

    //buscar el usuario
    public Aerolineas findOne(Long id);

    //Eliminar el usuario
    public void delete(Long id);


    public Aerolineas findById(Long id);


}
