package com.AeropuertoPrimos20.pruebaDefinitiva.servicio;

import com.AeropuertoPrimos20.pruebaDefinitiva.modelo.Aeropuertos;
import com.AeropuertoPrimos20.pruebaDefinitiva.projection.AeropuertoDireccionProjection;
import com.AeropuertoPrimos20.pruebaDefinitiva.projection.AeropuertoNameProjection;

import java.util.List;

public interface AeropuertoServices {

    public List<Aeropuertos> findAll();
    // paginacion
    public List<Aeropuertos> findAllActivos();
    public List<AeropuertoNameProjection> traerAeropuertos();

    public List<Aeropuertos> findbynombreAnddireccion(String nombreaeropuerto, String direccion);

    //Guardar usuario
    public Aeropuertos save(Aeropuertos aeropuertos);

    //buscar el usuario
    public Aeropuertos findOne(Long id);

    //Eliminar el usuario
    public void delete(Long id);

    public Aeropuertos findById(Long id);

    public List<AeropuertoDireccionProjection> traerDireccino(Long id);

    public List<Aeropuertos> traerAeroConsultas(Long id);
}
