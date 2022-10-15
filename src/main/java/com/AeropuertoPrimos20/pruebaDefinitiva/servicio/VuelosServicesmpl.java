package com.AeropuertoPrimos20.pruebaDefinitiva.servicio;

import com.AeropuertoPrimos20.pruebaDefinitiva.excepciones.ResourceNotFoundException;
import com.AeropuertoPrimos20.pruebaDefinitiva.modelo.Vuelos;
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
    public Vuelos findById(Long id) {
        return repositorio.findById(id)
                .orElseThrow(()-> new ResourceNotFoundException("No existe el Vuelo con el ID: "+ id));
    }
}
