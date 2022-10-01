package com.AeropuertoPrimos20.pruebaDefinitiva.servicio;

import com.AeropuertoPrimos20.pruebaDefinitiva.excepciones.ResourceNotFoundException;
import com.AeropuertoPrimos20.pruebaDefinitiva.modelo.Aerolineas;
import com.AeropuertoPrimos20.pruebaDefinitiva.projection.AerolineaNameProjection;
import com.AeropuertoPrimos20.pruebaDefinitiva.projection.TableAreolineaProjection;
import com.AeropuertoPrimos20.pruebaDefinitiva.ropositorio.AerolienaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class AerolineasServicesmpl  implements AerolineasServices {

    @Autowired
    private AerolienaRepo repositorio;

    @Override
    @Transactional(readOnly = true)
    public List<Aerolineas> findAll() {
    return(List<Aerolineas>) repositorio.findAll();
    }

    @Override
    public     List<TableAreolineaProjection> findAllActivos() {
        return repositorio.findAllActivos();
    }

    @Override
    public List<TableAreolineaProjection> findbynombreAnddireccion(String nombre, Long id) {
        return(List<TableAreolineaProjection>) repositorio.findBynombreandIda(nombre, id);
    }

    @Override
    public List<AerolineaNameProjection> traerAerolineas() {
        return repositorio.traerAerolineas();
    }


    @Override
    @Transactional
    public Aerolineas save(Aerolineas aerolineas) {
      repositorio.save(aerolineas);
      return aerolineas;
    }

    @Override
    @Transactional(readOnly = true)
    public Aerolineas findOne(Long id) {
        return repositorio.findById(id)
                .orElseThrow(()-> new ResourceNotFoundException("No existe usuario con el ID: "+ id));
    }

    @Override
    public void delete(Long id) {
        Optional<Aerolineas> aerolineas = repositorio.findById(id);
        if(aerolineas.isPresent()){
            repositorio.deleteById(aerolineas.get().getIdaerolineas());
        }
    }

    @Override
    public Aerolineas findById(Long id) {
       return repositorio.findById(id).orElseThrow(()-> new ResourceNotFoundException("No existe usuario con el ID: "+ id));
    }

}

