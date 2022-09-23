package com.AeropuertoPrimos20.pruebaDefinitiva.ropositorio;

import com.AeropuertoPrimos20.pruebaDefinitiva.modelo.UsuariosInternos;
import com.AeropuertoPrimos20.pruebaDefinitiva.projection.RoleNameProjection;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UsuarioInterno extends CrudRepository<UsuariosInternos, Long> {

    @Query(value="\n" +
            "select u.id_rol as idRol , r.idrol  as nombreRol \n" +
            "            from public.usuariosinternos u \n" +
            "            inner join public.rol r on r.id_rol =u.id_rol ", nativeQuery = true)
    List<RoleNameProjection> traerNombre();

   @Override
    List<UsuariosInternos> findAll();

}
