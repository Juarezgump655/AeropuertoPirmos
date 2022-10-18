package com.AeropuertoPrimos20.pruebaDefinitiva.ropositorio;

import com.AeropuertoPrimos20.pruebaDefinitiva.modelo.Tripulacion;
import com.AeropuertoPrimos20.pruebaDefinitiva.projection.TripulacionProjection;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TripuRepo extends CrudRepository<Tripulacion, Long> {

    @Query(value = "select * from tripulacion\n" +
            "where  idestado=1\n" +
            "and idaeropuerto =:id", nativeQuery = true)
    List<Tripulacion> findAllActivos(@Param("id") Long id);



    @Query(value = "select   t.idtripulacion, u.nombres  as nombres, u2.nombres  as nombrecopi , u3.nombres  as nombresInge, u4.nombres  as nombresTripu, \n" +
            "\t\t  \tu5.nombres  as nombreTripu2, u6.nombres  as nombreTripu3\t\t\n" +
            "            from public.tripulacion t   \n" +
            "            inner join public.usuariosinternos u  on  u.idusuariointerno  = t.idpiloto\n" +
            "            inner join public.usuariosinternos u2  on  u2.idusuariointerno  = t.idcopiloto \n" +
            "            inner join public.usuariosinternos u3  on  u3.idusuariointerno  = t.idingeniero  \n" +
            "            inner join public.usuariosinternos u4  on  u4.idusuariointerno  = t.idtripulantes1   \n" +
            "            inner join public.usuariosinternos u5  on  u5.idusuariointerno  = t.idtripulantes2   \n" +
            "            inner join public.usuariosinternos u6  on  u6.idusuariointerno  = t.idtripulantes3\n" +
            "            where t.idestado = 1\n" +
            "            and  t.idaeropuerto =:id" , nativeQuery = true)
    List<TripulacionProjection> tableTripu(@Param("id") Long id);


}
