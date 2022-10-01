package com.AeropuertoPrimos20.pruebaDefinitiva.ropositorio;

import com.AeropuertoPrimos20.pruebaDefinitiva.modelo.UsuariosInternos;
import com.AeropuertoPrimos20.pruebaDefinitiva.projection.RoleNameProjection;
import com.AeropuertoPrimos20.pruebaDefinitiva.projection.TableUsuariosProjection;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
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
            "\tFROM public.roles;" , nativeQuery = true)
    List<RoleNameProjection> traerNombre();

    @Query(value ="SELECT * FROM usuariosinternos \n" +
            "WHERE id_rol=7", nativeQuery = true)
    List<UsuariosInternos> traerpilotos();

    @Query(value ="SELECT * FROM usuariosinternos \n" +
            "WHERE id_rol=8", nativeQuery = true)
    List<UsuariosInternos> traercopilotos();

    @Query(value ="SELECT * FROM usuariosinternos \n" +
            "WHERE id_rol=9", nativeQuery = true)
    List<UsuariosInternos> traerInges();

    @Query(value ="SELECT * FROM usuariosinternos \n" +
            "WHERE id_rol=10", nativeQuery = true)
    List<UsuariosInternos> traerTripulantes();

    @Query(value = "SELECT u.idusuariointerno, u.documentoidentificaion, u.nombres, u.apellidos, b.nombreaeropuerto, e.nombreaerolinea,\n" +
            "            r.nombrerol, u.numerotelefoono\n" +
            "                FROM usuariosinternos u, aeropuertos b, aerolineas e, roles r \n" +
            "                WHERE u.id_rol = r.idroles\n" +
            "                AND  u.idaeropuerto= b.idaeropuerto\n" +
            "                AND u.idaerolinea = e.idaerolineas\n" +
            "                AND u.idestado = 1\n" +
            "                AND u.nombres LIKE %:nombre%\n" +
            "                AND u.idaeropuerto = :idaero\n" +
            "                AND u.idaerolinea = :idaerolinea", nativeQuery = true)
    List<TableUsuariosProjection> traerfiltro(String nombre, Long idaero, Long idaerolinea);


    @Query(value="SELECT idusuariointerno, documentoidentificaion, nombres, apellidos, fechanacimiento, nacionalidad, correo, codigopais, numerotelefoono, numerotelefoonoem, direccion, contrasenia, idestado, usariocreacion, fechacreacion, fechamodicar, idaeropuerto, idaerolinea, id_rol\n" +
            "\tFROM usuariosinternos WHERE idestado=1;", nativeQuery= true)
    List<UsuariosInternos> findAllActivos();

    @Query(value="    \n" +
            "   UPDATE public.usuariosinternos\n" +
            "\tSET  idestado=2\n" +
            "\tWHERE idusuariointerno=id;", nativeQuery = true)
    void deleteUsuario(Long id);

}
