package com.AeropuertoPrimos20.pruebaDefinitiva.servicio;

import com.AeropuertoPrimos20.pruebaDefinitiva.excepciones.ResourceNotFoundException;
import com.AeropuertoPrimos20.pruebaDefinitiva.modelo.Aeropuertos;
import com.AeropuertoPrimos20.pruebaDefinitiva.projection.AeropuertoDireccionProjection;
import com.AeropuertoPrimos20.pruebaDefinitiva.projection.AeropuertoNameProjection;
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
    public List<Aeropuertos> findAllActivos() {
        return(List<Aeropuertos>) repositorio.findAllActivos();
    }

    @Override
    public List<AeropuertoNameProjection> traerAeropuertos() {
        return repositorio.traerAeropuertos();
    }

    @Override
    public List<Aeropuertos> findbynombreAnddireccion(String nombreaeropuerto, String direccion) {
        return(List<Aeropuertos>) repositorio.findbynombreAnddireccion(nombreaeropuerto, direccion);
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

    @Override
    public List<AeropuertoDireccionProjection> traerDireccino(Long id) {
        return repositorio.traerDireccino(id);
    }

    @Override
    public List<Aeropuertos> traerAeroConsultas(Long id) {
        return repositorio.traerAeroConsu(id);
    }


}
