package com.AeropuertoPrimos20.pruebaDefinitiva.servicio;


import com.AeropuertoPrimos20.pruebaDefinitiva.excepciones.ResourceNotFoundException;
import com.AeropuertoPrimos20.pruebaDefinitiva.modelo.Asiento;
import com.AeropuertoPrimos20.pruebaDefinitiva.projection.AsientosProjection;
import com.AeropuertoPrimos20.pruebaDefinitiva.ropositorio.AsientoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class AsinetosServicesmpl  implements  AsientoServices{

    @Autowired
    private AsientoRepo repositorio;


    @Override
    @Transactional
    public Asiento save(Asiento asiento) {
        repositorio.save(asiento);
       return asiento;
    }

    @Override
    @Transactional(readOnly = true)
    public List<AsientosProjection> findAllLibres(Long id) {
        return(List<AsientosProjection>) repositorio.findAllLibres(id);
    }

    @Override
    public void reservarAsientos(Long iduser, Long id) {
        try {
            repositorio.reservarAsientos(iduser, id);
        }catch (Exception e){
            System.out.println(e);
        }

    }


    @Override
    @Transactional(readOnly = true)
    public Asiento findById(Long id) {
        return repositorio.findById(id)
                .orElseThrow(()-> new ResourceNotFoundException("No existe el Asiento con el ID: "+ id));
    }

    @Override
    public void saveAll(List<Asiento> listaasiento) {
        repositorio.saveAll(listaasiento);
    }

}
