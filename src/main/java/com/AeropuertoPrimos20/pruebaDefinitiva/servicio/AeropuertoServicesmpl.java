package com.AeropuertoPrimos20.pruebaDefinitiva.servicio;

import com.AeropuertoPrimos20.pruebaDefinitiva.excepciones.ResourceNotFoundException;
import com.AeropuertoPrimos20.pruebaDefinitiva.modelo.Aeropuertos;
import com.AeropuertoPrimos20.pruebaDefinitiva.ropositorio.AeropuertoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class AeropuertoServicesmpl implements  AeropuertoServices{

    @Autowired
    private AeropuertoRepo repositorio;
    @Override
    @Transactional(readOnly = true)
    public List<Aeropuertos> findAll() {
    return(List<Aeropuertos>) repositorio.findAll();

    }

    @Override
    @Transactional
    public Aeropuertos save(Aeropuertos aeropuertos) {
        repositorio.save(aeropuertos);
        return  aeropuertos;
    }

    @Override
    @Transactional(readOnly = true)
    public Aeropuertos findOne(Long id) {
      return repositorio.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public void delete(Long id) {
        Optional<Aeropuertos> aeropuertos = repositorio.findById(id);
        if(aeropuertos.isPresent()){
            repositorio.deleteById(aeropuertos.get().getIdaeropuerto());
        }
    }

    @Override
    public Aeropuertos findById(Long id) {
        return repositorio.findById(id).orElseThrow(()-> new ResourceNotFoundException("No existe usuario con el ID: "+ id));
    }
}
