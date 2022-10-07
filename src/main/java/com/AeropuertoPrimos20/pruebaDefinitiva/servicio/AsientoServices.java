package com.AeropuertoPrimos20.pruebaDefinitiva.servicio;

import com.AeropuertoPrimos20.pruebaDefinitiva.modelo.Asiento;

import java.util.List;

public interface AsientoServices {


    public Asiento save(Asiento asiento);

    public Asiento findById(Long id);

    public void saveAll(List<Asiento> listaasiento);
}
