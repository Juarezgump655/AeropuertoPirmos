package com.AeropuertoPrimos20.pruebaDefinitiva.ropositorio;

import com.AeropuertoPrimos20.pruebaDefinitiva.modelo.Boleto;
import com.AeropuertoPrimos20.pruebaDefinitiva.projection.BoletoProjection;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface BoletoRepo  extends CrudRepository<Boleto, Long> {


    @Query(value = "select b.idboletos, u.nombrecliente, u.apellidocliente  ,   a.nombreaeropuerto ,   a2.nombreaeropuerto  as destino, p.puertanu , b.precio, b.cantidad,\n" +
            "\t\t\tv.fechasalida, v.horasalida \n" +
            "            from public.boletos b    \n" +
            "     \t    inner join public.usuarios u   on  u.idusuario  = b.idusuario    \n" +
            "            inner join public.vuelos v  on  v.idvuelo  = b.idvuelo \n" +
            "  \t\t    inner join public.puerta p   on  p.id_puerta  = v.puertabordaje  \n" +
            "            inner join public.aeropuertos a   on  a.idaeropuerto  = v.idaeropuerto  \n" +
            "            inner join public.aeropuertos a2   on  a2.idaeropuerto  = v.idestino  \n" +
            "            where b.idboletos = :id", nativeQuery = true)
    BoletoProjection traerBoleto(@Param("id")  Long id);





}
