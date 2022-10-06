package com.AeropuertoPrimos20.pruebaDefinitiva.servicio;

import com.AeropuertoPrimos20.pruebaDefinitiva.excepciones.ResourceNotFoundException;
import com.AeropuertoPrimos20.pruebaDefinitiva.modelo.Avion;
import com.AeropuertoPrimos20.pruebaDefinitiva.ropositorio.AvionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class AvionServicesmpl implements AvionServices{


    @Autowired
    private AvionRepo repositorio;

    @Override
    @Transactional(readOnly = true)
    public List<Avion> findAll() {
        return(List<Avion>) repositorio.findAll();
    }

    @Override
    @Transactional
    public Avion save(Avion avion) {
        repositorio.save(avion);
        return avion;
    }

    @Override
    @Transactional(readOnly = true)
    public Avion findById(Long id) {
        return repositorio.findById(id).orElseThrow(()-> new ResourceNotFoundException("No existe el Avion con el ID: "+ id));
    }

}
