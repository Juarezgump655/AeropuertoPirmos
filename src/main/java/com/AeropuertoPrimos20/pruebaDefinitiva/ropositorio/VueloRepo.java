package com.AeropuertoPrimos20.pruebaDefinitiva.ropositorio;

import com.AeropuertoPrimos20.pruebaDefinitiva.modelo.Vuelos;
import com.AeropuertoPrimos20.pruebaDefinitiva.projection.VuelotableProjection;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VueloRepo extends CrudRepository<Vuelos, Long> {

     @Query(value = "SELECT e.nombreaerolinea,  b.direccion, u.fechasalida, u.horasalida, u.fechallegada, u.horallegada\n" +
             "                          FROM vuelos u, aeropuertos b, aerolineas e\n" +
             "                          WHERE  u.idaeropuerto= b.idaeropuerto\n" +
             "                            AND u.idaerolinea = e.idaerolineas\n" +
             "                            AND u.idestado = 1\n" +
             "  ", nativeQuery = true)
    List<VuelotableProjection>  traertabla();

}
