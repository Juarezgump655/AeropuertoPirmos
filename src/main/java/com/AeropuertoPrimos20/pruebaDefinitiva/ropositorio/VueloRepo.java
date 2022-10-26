package com.AeropuertoPrimos20.pruebaDefinitiva.ropositorio;

import com.AeropuertoPrimos20.pruebaDefinitiva.modelo.Vuelos;
import com.AeropuertoPrimos20.pruebaDefinitiva.projection.PsajerrosProjection;
import com.AeropuertoPrimos20.pruebaDefinitiva.projection.VuelotableProjection;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VueloRepo extends CrudRepository<Vuelos, Long> {

     @Query(value = "SELECT  u.idvuelo, b.direccion  as salida , b2.direccion as destino , u.idavion, u.fechasalida, u.horasalida, u.fechallegada, u.horallegada, u.precioeconomico , u.precioejecutivo \n" +
             "                                     FROM vuelos u\n" +
             "                                  \t inner join public.aeropuertos b2 on  b2.idaeropuerto  = u.idestino \n" +
             "                                     inner join public.aeropuertos b on  b.idaeropuerto  = u.idaeropuerto \n" +
             "                                     WHERE  u.idaeropuerto= b.idaeropuerto\n" +
             "                                     AND u.idestado = 1\n" +
             "                                     and u.fechasalida =  TO_DATE( :fecha,'yyyy/MM/dd')\n" +
             "                                     and u.idestino = :id           " +
             "  ", nativeQuery = true)
    List<VuelotableProjection>  traertabla(@Param("fecha") String fecha , @Param("id") Long id);


    @Query(value = "SELECT  u.idvuelo, b.direccion  as salida , b2.direccion as destino , u.idavion, u.fechasalida, u.horasalida, u.fechallegada, u.horallegada, u.precioeconomico , u.precioejecutivo \n" +
            "                                     FROM vuelos u\n" +
            "                                  \t inner join public.aeropuertos b2 on  b2.idaeropuerto  = u.idestino \n" +
            "                                     inner join public.aeropuertos b on  b.idaeropuerto  = u.idaeropuerto \n" +
            "                                     WHERE  u.idaeropuerto= b.idaeropuerto\n" +
            "                                     AND u.idestado = 1 ", nativeQuery = true)
    List<VuelotableProjection>  buscartodos();

    @Query(value = "SELECT  u.idvuelo, b.direccion  as salida , b2.direccion as destino , u.idavion, u.fechasalida, u.horasalida, u.fechallegada, u.horallegada, u.precioeconomico , u.precioejecutivo \n" +
            "                                     FROM vuelos u\n" +
            "                                  \t inner join public.aeropuertos b2 on  b2.idaeropuerto  = u.idestino \n" +
            "                                     inner join public.aeropuertos b on  b.idaeropuerto  = u.idaeropuerto \n" +
            "                                     WHERE  u.idaeropuerto= b.idaeropuerto\n" +
            "                                     AND u.idestado = 1\n" +
            "                                     and u.idvuelo = :id           " +
            "  ", nativeQuery = true)
    VuelotableProjection  findByID(@Param("id") Long id);


    @Query(value = " select v.idvuelo, a.asiento ,u.numeropasaporte ,u.nombrecliente,  u.apellidocliente , u.nacionalidad, u.numerotelefoono , u.correo \n" +
            "            from public.vuelos v  \n" +
            "     \t    inner join public.asiento a   on  a.id_avion  = v.idavion\n" +
            "     \t    inner join public.usuarios u  on  u.idusuario  = a.usuariomodifico   \n" +
            "            where v.idvuelo = :id\n" +
            "            and a.id_estado =1\n" +
            "     \t    ORDER BY asiento ASC", nativeQuery = true)
    List<PsajerrosProjection> traerlista(@Param("id")  Long id);

}
