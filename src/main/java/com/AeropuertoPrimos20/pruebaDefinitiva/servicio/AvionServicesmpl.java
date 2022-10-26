package com.AeropuertoPrimos20.pruebaDefinitiva.servicio;

import com.AeropuertoPrimos20.pruebaDefinitiva.excepciones.ResourceNotFoundException;
import com.AeropuertoPrimos20.pruebaDefinitiva.modelo.Avion;
import com.AeropuertoPrimos20.pruebaDefinitiva.ropositorio.AvionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

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

    @Override
    @Transactional(readOnly = true)
    public List<Avion> findByAerolinea(Long id) {
        return repositorio.findByAerolinea(id);
    }

    @Override
    @Transactional
    public void delete(Long id) {
        Optional<Avion> avion = repositorio.findById(id);
        if(avion.isPresent()){
            repositorio.deleteById(avion.get().getIdavion());
        }
    }

    @Override
    @Transactional(readOnly = true)
    public List<Avion> findByAerolineaT(Long id) {
        return repositorio.findByAerolineaT(id);
    }

    @Override
    @Transactional
    public void cambiarEstado(Long iduser,Long id) {
                try {
            repositorio.cambiarEstado(iduser,id);
        }catch (Exception e){
            System.out.println(e);
        }
    }

    @Override
    @Transactional
    public void eliminadologico(Long iduser,Long id) {
        System.out.println(iduser +"xd " + id);
        try {
            repositorio.eliminadologico(iduser,id);
        }catch (Exception e){
            System.out.println(e);
        }

    }

}
