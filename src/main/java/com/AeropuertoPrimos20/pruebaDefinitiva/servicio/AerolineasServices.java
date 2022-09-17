package com.AeropuertoPrimos20.pruebaDefinitiva.servicio;


import com.AeropuertoPrimos20.pruebaDefinitiva.modelo.Aerolineas;
import org.springframework.data.domain.Page;

import java.awt.print.Pageable;
import java.util.List;

public interface AerolineasServices {

    public List<Aerolineas> findAll();
    // paginacion

    public Page<Aerolineas> findAll(Pageable pageable);

    //Guardar usuario
    public void save(Aerolineas aerolineas);

    //buscar el usuario
    public Aerolineas findOne(Long id);

    //Eliminar el usuario
    public void delete(Long id);


}
