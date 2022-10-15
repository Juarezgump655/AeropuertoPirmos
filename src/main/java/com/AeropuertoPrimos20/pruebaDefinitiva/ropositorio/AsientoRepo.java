package com.AeropuertoPrimos20.pruebaDefinitiva.ropositorio;

import com.AeropuertoPrimos20.pruebaDefinitiva.modelo.Asiento;
import com.AeropuertoPrimos20.pruebaDefinitiva.projection.AsientosProjection;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface AsientoRepo extends CrudRepository<Asiento, Long> {


    @Query(value = "SELECT id_asiento, asiento,id_estado FROM asiento\n" +
            "WHERE id_avion=:id", nativeQuery = true)
    List<AsientosProjection> findAllLibres(@Param("id")  Long id);

}
