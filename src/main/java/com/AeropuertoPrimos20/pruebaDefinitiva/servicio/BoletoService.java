package com.AeropuertoPrimos20.pruebaDefinitiva.servicio;

import com.AeropuertoPrimos20.pruebaDefinitiva.modelo.Boleto;
import com.AeropuertoPrimos20.pruebaDefinitiva.projection.BoletoProjection;

import java.util.List;

public interface BoletoService {

  public Boleto save(Boleto boleto);

  public List<Boleto> findAll();

  public Boleto findById(Long id);

  public BoletoProjection traerBoleto( Long id);

}
