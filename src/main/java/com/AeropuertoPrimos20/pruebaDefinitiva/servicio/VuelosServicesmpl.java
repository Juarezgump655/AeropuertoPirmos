package com.AeropuertoPrimos20.pruebaDefinitiva.servicio;

import com.AeropuertoPrimos20.pruebaDefinitiva.modelo.Vuelos;
import com.AeropuertoPrimos20.pruebaDefinitiva.projection.PsajerrosProjection;
import com.AeropuertoPrimos20.pruebaDefinitiva.projection.VuelotableProjection;
import com.AeropuertoPrimos20.pruebaDefinitiva.ropositorio.VueloRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class VuelosServicesmpl implements  VueloServices {


    @Autowired
    private VueloRepo repositorio;

    @Override
    @Transactional(readOnly = true)
    public List<Vuelos> findAll() {
        return(List<Vuelos>) repositorio.findAll();
    }

    @Override
    @Transactional
    public Vuelos save(Vuelos vuelos) {
         repositorio.save(vuelos);
        return vuelos;
    }


    @Override
    @Transactional(readOnly = true)
    public List<VuelotableProjection> traertabla(String fecha, Long id) {
        return repositorio.traertabla(fecha, id);
    }


    @Override
    @Transactional(readOnly = true)
    public VuelotableProjection findById(Long id) {
        return repositorio.findByID(id);
    }

    @Override
    public List<VuelotableProjection> buscartodos() {
        return repositorio.buscartodos();
    }

    @Override
    public List<PsajerrosProjection> traerPasajeros(Long id) {
        return(List<PsajerrosProjection>) repositorio.traerlista(id);
    }


}
