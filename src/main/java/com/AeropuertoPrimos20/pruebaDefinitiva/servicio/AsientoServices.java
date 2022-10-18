package com.AeropuertoPrimos20.pruebaDefinitiva.servicio;

import com.AeropuertoPrimos20.pruebaDefinitiva.modelo.Asiento;
import com.AeropuertoPrimos20.pruebaDefinitiva.projection.AsientosProjection;

import java.util.List;

public interface AsientoServices {


    public Asiento save(Asiento asiento);


    public Asiento findById(Long id);

    public void saveAll(List<Asiento> listaasiento);
     public List<AsientosProjection> findAllLibres(Long id);

     public void reservarAsientos(Long id);
}
