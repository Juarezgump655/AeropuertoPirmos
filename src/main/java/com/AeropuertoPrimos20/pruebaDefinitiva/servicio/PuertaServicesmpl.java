package com.AeropuertoPrimos20.pruebaDefinitiva.servicio;

import com.AeropuertoPrimos20.pruebaDefinitiva.excepciones.ResourceNotFoundException;
import com.AeropuertoPrimos20.pruebaDefinitiva.modelo.Puerta;
import com.AeropuertoPrimos20.pruebaDefinitiva.projection.puertaProjection;
import com.AeropuertoPrimos20.pruebaDefinitiva.ropositorio.PuerrtaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class PuertaServicesmpl implements PuertaServices{

    @Autowired
    private PuerrtaRepo repositorio;

    @Override
    @Transactional
    public Puerta save(Puerta puerta) {
        repositorio.save(puerta);
        return puerta;
    }

    @Override
    public Puerta findById(Long id) {
        return repositorio.findById(id)
                .orElseThrow(()-> new ResourceNotFoundException("No existe el Asiento con el ID: "+ id));
    }


    @Override
    public void saveAll(List<Puerta> listaPuerta) {
        repositorio.saveAll(listaPuerta);
    }

    @Override
    @Transactional(readOnly = true)
    public List<puertaProjection> buscarPuertas(Long id) {
        return repositorio.buscarAeropuerto(id);
    }
}
