package com.AeropuertoPrimos20.pruebaDefinitiva.servicio;

import com.AeropuertoPrimos20.pruebaDefinitiva.excepciones.ResourceNotFoundException;
import com.AeropuertoPrimos20.pruebaDefinitiva.modelo.Boleto;
import com.AeropuertoPrimos20.pruebaDefinitiva.projection.BoletoProjection;
import com.AeropuertoPrimos20.pruebaDefinitiva.ropositorio.BoletoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class BoletoServicempl implements BoletoService{

    @Autowired
    private BoletoRepo repositorio;


    @Override
    public Boleto save(Boleto boleto) {
        repositorio.save(boleto);
        return  boleto;
    }

    @Override
    public List<Boleto> findAll() {
        return(List<Boleto>) repositorio.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Boleto findById(Long id) {
        return repositorio.findById(id).orElseThrow(()-> new ResourceNotFoundException("No existe el boleto con el ID: "+ id));
    }

    @Override
    public BoletoProjection traerBoleto(Long id) {
        return repositorio.traerBoleto(id);
    }
}
