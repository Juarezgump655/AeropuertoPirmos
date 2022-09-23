package com.AeropuertoPrimos20.pruebaDefinitiva.ropositorio;

import com.AeropuertoPrimos20.pruebaDefinitiva.modelo.Adminstrador;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepo  extends CrudRepository<Adminstrador, Long> {

}
