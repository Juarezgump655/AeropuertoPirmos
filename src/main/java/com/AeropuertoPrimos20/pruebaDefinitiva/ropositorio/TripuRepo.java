package com.AeropuertoPrimos20.pruebaDefinitiva.ropositorio;

import com.AeropuertoPrimos20.pruebaDefinitiva.modelo.Tripulacion;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TripuRepo extends CrudRepository<Tripulacion, Long> {

    @Query(value = "SELECT * FROM tripulacion \n" +
            "WHERE idestado=1", nativeQuery = true)
   List<Tripulacion> findAllActivos();



}
