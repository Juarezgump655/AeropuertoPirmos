package com.AeropuertoPrimos20.pruebaDefinitiva.ropositorio;

import com.AeropuertoPrimos20.pruebaDefinitiva.modelo.Aerolineas;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AerolienaRepo extends CrudRepository<Aerolineas, Long> {

}
