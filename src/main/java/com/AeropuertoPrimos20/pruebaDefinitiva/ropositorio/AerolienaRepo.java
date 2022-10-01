package com.AeropuertoPrimos20.pruebaDefinitiva.ropositorio;

import com.AeropuertoPrimos20.pruebaDefinitiva.modelo.Aerolineas;
import com.AeropuertoPrimos20.pruebaDefinitiva.projection.AerolineaNameProjection;
import com.AeropuertoPrimos20.pruebaDefinitiva.projection.TableAreolineaProjection;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AerolienaRepo extends CrudRepository<Aerolineas, Long> {

    @Query(value="SELECT e.idaerolineas, e.nombreaerolinea, e.numerotelefono, e.correo, b.nombreaeropuerto, e.vuelos\n" +
            "    FROM  aeropuertos b, aerolineas e\n" +
            "    WHERE e.idaeropuerto = b.idaeropuerto;", nativeQuery= true)
    List<TableAreolineaProjection> findAllActivos();

    @Query(value = "SELECT e.idaerolineas, e.nombreaerolinea, e.numerotelefono, e.correo, b.nombreaeropuerto, e.vuelos\n" +
            "              FROM  aeropuertos b, aerolineas e\n" +
            "              WHERE e.idaeropuerto = b.idaeropuerto\n" +
            "              AND e.nombreaerolinea LIKE %:nombre%\n" +
            "              AND e.idaeropuerto = :id\n" +
            "              AND e.idestado = 1;", nativeQuery= true)
    List<TableAreolineaProjection> findBynombreandIda(String nombre, Long id);

    @Query(value = "Select idaerolineas, nombreaerolinea from aerolineas", nativeQuery = true)
    List<AerolineaNameProjection> traerAerolineas();
}
