package com.AeropuertoPrimos20.pruebaDefinitiva.servicio;

import com.AeropuertoPrimos20.pruebaDefinitiva.excepciones.ResourceNotFoundException;
import com.AeropuertoPrimos20.pruebaDefinitiva.modelo.Adminstrador;
import com.AeropuertoPrimos20.pruebaDefinitiva.ropositorio.AdminRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
@Service
public class AdminServicesmpl implements AdminServices{
    @Autowired
    private AdminRepo repositorio;


    @Override
    @Transactional(readOnly = true)
    public List<Adminstrador> findAll() {
        return (List<Adminstrador>) repositorio.findAll();
    }

    @Override
    public Adminstrador save(Adminstrador adminstrador) {
        repositorio.save(adminstrador);
        return adminstrador;
    }

    @Override
    @Transactional(readOnly = true)
    public Adminstrador findOne(Long id) {
        return repositorio.findById(id)
                .orElseThrow(()-> new ResourceNotFoundException("No existe Admninistrador con el ID: "+ id));
    }

    @Override
    public void delete(Long id) {
        Optional<Adminstrador> administrador = repositorio.findById(id);
        if(administrador.isPresent()){
            repositorio.deleteById(administrador.get().getIdadminstrador());
        }
    }

    @Override
    public Adminstrador findById(Long id) {
        return repositorio.findById(id)
                .orElseThrow(()-> new ResourceNotFoundException("No existe Admninistrador con el ID: "+ id));
    }
}
