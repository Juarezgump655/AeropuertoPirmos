package com.AeropuertoPrimos20.pruebaDefinitiva.servicio;

import com.AeropuertoPrimos20.pruebaDefinitiva.excepciones.ResourceNotFoundException;
import com.AeropuertoPrimos20.pruebaDefinitiva.modelo.Tripulacion;
import com.AeropuertoPrimos20.pruebaDefinitiva.projection.TripulacionProjection;
import com.AeropuertoPrimos20.pruebaDefinitiva.ropositorio.TripuRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class TripulacionServicesmpl implements TripulacionServices{
    @Autowired
    private TripuRepo repositorio;


    @Override
    @Transactional(readOnly = true)
    public List<Tripulacion> findAllActivos(Long id) {
        return(List<Tripulacion>) repositorio.findAllActivos(id);
    }

    @Override
    @Transactional
    public Tripulacion save(Tripulacion tripulacion) {
        return repositorio.save(tripulacion);
    }

    @Override
    @Transactional(readOnly = true)
    public Tripulacion findOne(Long id) {
        return repositorio.findById(id).orElseThrow(()-> new ResourceNotFoundException("No existe usuario con el ID: "+ id));
    }

    @Override
    @Transactional
    public void delete(Long id) {
        Optional<Tripulacion> tripulacion = repositorio.findById(id);
        if(tripulacion.isPresent()){
            repositorio.deleteById(tripulacion.get().getIdtripulacion());
        }
    }

    @Override
    public Tripulacion findById(Long id) {
        return repositorio.findById(id).orElseThrow(()-> new ResourceNotFoundException("No existe usuario con el ID: "+ id ));
    }

    @Override
    public List<TripulacionProjection> tableTripu(Long id) {
        return(List<TripulacionProjection>) repositorio.tableTripu(id);
    }
}
