package com.AeropuertoPrimos20.pruebaDefinitiva.servicio;


import com.AeropuertoPrimos20.pruebaDefinitiva.modelo.Aerolineas;
import com.AeropuertoPrimos20.pruebaDefinitiva.projection.AerolineaNameProjection;
import com.AeropuertoPrimos20.pruebaDefinitiva.projection.TableAreolineaProjection;

import java.util.List;

public interface AerolineasServices {

    public List<Aerolineas> findAll();
    // paginacion
    public     List<TableAreolineaProjection> findAllActivos();
    public List<TableAreolineaProjection> findbynombreAnddireccion(String nombre, Long id);
    public List<AerolineaNameProjection> traerAerolineas();
    //Guardar usuario
    public Aerolineas save(Aerolineas aerolineas);

    //buscar el usuario
    public Aerolineas findOne(Long id);

    //Eliminar el usuario
    public void delete(Long id);

    public Aerolineas findById(Long id);

    public List<Aerolineas> consultasAero(Long id);

}
