package com.AeropuertoPrimos20.pruebaDefinitiva.ropositorio;

import com.AeropuertoPrimos20.pruebaDefinitiva.modelo.Aeropuertos;
import com.AeropuertoPrimos20.pruebaDefinitiva.projection.AeropuertoDireccionProjection;
import com.AeropuertoPrimos20.pruebaDefinitiva.projection.AeropuertoNameProjection;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AeropuertoRepo extends CrudRepository<Aeropuertos, Long> {

    @Query(value = "Select idaeropuerto, nombreaeropuerto from aeropuertos", nativeQuery = true)
    List<AeropuertoNameProjection> traerAeropuertos();

    /*
    @Query(value = "SELECT * \n" +
            "    FROM public.aeropuertos\n" +
            "    WHERE idaeropuerto=:idaeropuerto;\n", nativeQuery = true)
    List<Aeropuertos> filtroAeropuertos(@Param("idaeropuerto") Long idaeropuerto);
     */

    @Query(value = "SELECT * FROM aeropuertos\n" +
            "WHERE nombreaeropuerto LIKE :nombreaeropuerto%\n" +
            "AND direccion LIKE %:direccion%\n" +
            "AND idestado = 1;", nativeQuery= true)
    List<Aeropuertos> findbynombreAnddireccion(String nombreaeropuerto, String direccion);

    @Query(value="SELECT idaeropuerto, nombreaeropuerto, nopuertas, direccion, pais, notelefono, idestado, fechacreacion, fechamodicar, idusuariocreacion, usuariomodi\n" +
            "\tFROM public.aeropuertos WHERE idestado=1;", nativeQuery= true)
    List<Aeropuertos> findAllActivos();

    @Query(value = "UPDATE aeropuertos SET idestado=2 WHERE idaeropuerto=:id;", nativeQuery = true)
    void eliminalogico(Long id);

    @Query(value="SELECT pais FROM aeropuertos \n" +
            "WHERE idestado=1\n" +
            "AND idaeropuerto != :id\n", nativeQuery= true)
    List<AeropuertoDireccionProjection> traerDireccino(Long id);

@Query(value="SELECT * FROM aeropuertos\n" +
        "            WHERE idestado=1\n" +
        "            AND idaeropuerto != :id", nativeQuery = true)
    List<Aeropuertos> traerAeroConsu(Long id);
}
