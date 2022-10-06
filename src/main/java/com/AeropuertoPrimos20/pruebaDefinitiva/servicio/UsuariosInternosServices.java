package com.AeropuertoPrimos20.pruebaDefinitiva.servicio;

import com.AeropuertoPrimos20.pruebaDefinitiva.modelo.UsuariosInternos;
import com.AeropuertoPrimos20.pruebaDefinitiva.projection.RoleNameProjection;
import com.AeropuertoPrimos20.pruebaDefinitiva.projection.TableUsuariosProjection;

import java.util.List;

public interface UsuariosInternosServices {

    //metodo para buscar todos los empleados
    public List<UsuariosInternos> findAll();

    public List<RoleNameProjection> traerNombre();

    public List<TableUsuariosProjection> traertabla();

    public  void deleteUsuario(Long id);

    List<UsuariosInternos> traercopilotos(Long idaero, Long idp);

    List<UsuariosInternos> traerInges(Long idaero, Long idp);

    List<UsuariosInternos> traerTripulantes(Long idaero, Long idp);

    public     List<UsuariosInternos> traerpilotos(Long idaero, Long idp);
    public   List<TableUsuariosProjection> traerfiltro(String nombre, Long idaero, Long idaerolinea);
    public List<UsuariosInternos> findAllActivos();

    //Guardar usuario
    public UsuariosInternos save(UsuariosInternos UsuarioInterno);

    //buscar el usuario
    public UsuariosInternos findOne(Long id);

    //Eliminar el usuario
    public void delete(Long id);

    public UsuariosInternos findById(Long id);

    public void eliminalogico(Long id);

    public UsuariosInternos buscarAdministradores(Long id);

}
