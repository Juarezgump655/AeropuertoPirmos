package com.AeropuertoPrimos20.pruebaDefinitiva.ropositorio;

import com.AeropuertoPrimos20.pruebaDefinitiva.modelo.Puerta;
import com.AeropuertoPrimos20.pruebaDefinitiva.projection.puertaProjection;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PuerrtaRepo  extends CrudRepository<Puerta, Long> {


    @Query(value = "select id_puerta, puertanu, id_estado from puerta \n" +
            "where id_aeropuerto =:id\n" +
            "and id_estado =2" , nativeQuery = true)
    List<puertaProjection> buscarAeropuerto(@Param("id")  Long id);




}
