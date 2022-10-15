package com.AeropuertoPrimos20.pruebaDefinitiva.ropositorio;

import com.AeropuertoPrimos20.pruebaDefinitiva.modelo.UsuariosInternos;
import com.AeropuertoPrimos20.pruebaDefinitiva.projection.RoleNameProjection;
import com.AeropuertoPrimos20.pruebaDefinitiva.projection.TableUsuariosProjection;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UsuarioInterno extends CrudRepository<UsuariosInternos, Long> {

    @Query(value="SELECT u.idusuariointerno, u.documentoidentificaion, u.nombres, u.apellidos, b.nombreaeropuerto, e.nombreaerolinea,\n" +
            " r.nombrerol, u.numerotelefoono\n" +
            "    FROM usuariosinternos u, aeropuertos b, aerolineas e, roles r\n" +
            "    WHERE u.id_rol = r.idroles\n" +
            "    AND  u.idaeropuerto= b.idaeropuerto\n" +
            "    AND u.idaerolinea = e.idaerolineas\n" +
            "    AND u.idestado = 1;", nativeQuery = true)
    List<TableUsuariosProjection> traertabla();

    @Query(value = "SELECT idroles, nombrerol\n" +
            "        FROM public.roles\n" +
            "        WHERE idroles !=5\n" +
            "        AND idroles !=4\n" +
            "        AND idroles !=2\n" +
            "        AND idroles !=6" , nativeQuery = true)
    List<RoleNameProjection> traerNombre();

    @Query(value ="SELECT * FROM usuariosinternos \n" +
            "        WHERE id_rol=7\n" +
            "        AND idaerolinea=:idaero\n" +
            "        AND idaeropuerto=:idp AND idestado=1", nativeQuery = true)
    List<UsuariosInternos> traerpilotos(@Param("idaero")  Long idaero, @Param("idp") Long idp);

    @Query(value ="SELECT * FROM usuariosinternos \n" +
            "        WHERE id_rol=8\n" +
            "        AND idaerolinea=:idaero\n" +
            "        AND idaeropuerto=:idp AND idestado=1", nativeQuery = true)
    List<UsuariosInternos> traercopilotos(@Param("idaero")  Long idaero, @Param("idp") Long idp);

    @Query(value ="SELECT * FROM usuariosinternos \n" +
            "        WHERE id_rol=9\n" +
            "        AND idaerolinea=:idaero\n" +
            "        AND idaeropuerto=:idp AND idestado=1;", nativeQuery = true)
    List<UsuariosInternos> traerInges(@Param("idaero")  Long idaero, @Param("idp") Long idp);

    @Query(value ="SELECT * FROM usuariosinternos \n" +
            "        WHERE id_rol=10\n" +
            "        AND idaerolinea=:idaero\n" +
            "        AND idaeropuerto=:idp AND idestado=1", nativeQuery = true)
    List<UsuariosInternos> traerTripulantes(@Param("idaero") Long idaero,@Param("idp") Long idp);

    @Query(value = "SELECT u.idusuariointerno, u.documentoidentificaion, u.nombres, u.apellidos, b.nombreaeropuerto, e.nombreaerolinea,\n" +
            "            r.nombrerol, u.numerotelefoono\n" +
            "                FROM usuariosinternos u, aeropuertos b, aerolineas e, roles r \n" +
            "                WHERE u.id_rol = r.idroles\n" +
            "                AND  u.idaeropuerto= b.idaeropuerto\n" +
            "                AND u.idaerolinea = e.idaerolineas\n" +
            "                AND u.idestado = 1\n" +
            "                AND u.nombres LIKE %:nombre%\n" +
            "                AND u.idaeropuerto = :idaero\n" +
            "                AND u.idaerolinea = :idaerolinea AND u.idestado=1", nativeQuery = true)
    List<TableUsuariosProjection> traerfiltro(@Param("nombre")  String nombre,@Param("idaero")  Long idaero,@Param("idaerolinea")  Long idaerolinea);


    @Query(value="SELECT idusuariointerno, documentoidentificaion, nombres, apellidos, fechanacimiento, nacionalidad, correo, codigopais, numerotelefoono, numerotelefoonoem, direccion, contrasenia, idestado, usariocreacion, fechacreacion, fechamodicar, idaeropuerto, idaerolinea, id_rol, usuariomodi\n" +
            "\tFROM usuariosinternos WHERE idestado=1;", nativeQuery= true)
    List<UsuariosInternos> findAllActivos();

    @Query(value="    \n" +
            "   UPDATE public.usuariosinternos\n" +
            "\tSET  idestado=2\n" +
            "\tWHERE idusuariointerno=id;", nativeQuery = true)
    void deleteUsuario(@Param("id")  Long id);

    @Query(value = "UPDATE usuariosinternos SET idestado=2 WHERE idusuariointerno=:id;", nativeQuery = true)
    void eliminalogico(@Param("id") Long id);


    @Query(value = "SELECT * \n" +
            "FROM usuariosinternos\n" +
            "WHERE idusuariointerno= :id\n" +
            "AND id_rol=1 AND idestado=1;", nativeQuery = true)
    UsuariosInternos  buscarAdministradores(@Param("id")   Long id);



}
