package com.AeropuertoPrimos20.pruebaDefinitiva.ropositorio;

import com.AeropuertoPrimos20.pruebaDefinitiva.modelo.Avion;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AvionRepo extends CrudRepository<Avion, Long> {

    @Query(value = "SELECT * FROM avion\n" +
        "   WHERE idestado=1", nativeQuery= true)
    List<Avion>  findAll();

}
