package com.AeropuertoPrimos20.pruebaDefinitiva.servicio;

import com.AeropuertoPrimos20.pruebaDefinitiva.excepciones.ResourceNotFoundException;
import com.AeropuertoPrimos20.pruebaDefinitiva.modelo.UsuariosInternos;
import com.AeropuertoPrimos20.pruebaDefinitiva.projection.RoleNameProjection;
import com.AeropuertoPrimos20.pruebaDefinitiva.projection.TableUsuariosProjection;
import com.AeropuertoPrimos20.pruebaDefinitiva.ropositorio.UsuarioInterno;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class  UsuariosInternosServicesmpl implements UsuariosInternosServices {

    @Autowired
    private UsuarioInterno repositorio;

    @Override
    @Transactional(readOnly = true)
    public List<UsuariosInternos> findAll() {
        return(List<UsuariosInternos>) repositorio.findAll();
    }

    @Override
    public List<RoleNameProjection> traerNombre() {
        return repositorio.traerNombre();
    }

    @Override
    public List<TableUsuariosProjection> traertabla() {
        return repositorio.traertabla();
    }


    @Override
    public void deleteUsuario(Long id) {
        repositorio.deleteUsuario(id);
    }

    @Override
    @Transactional(readOnly = true)
    public List<UsuariosInternos> traercopilotos(Long idaero, Long idp) {
        return(List<UsuariosInternos>) repositorio.traercopilotos(idaero,idp);
    }

    @Override
    @Transactional(readOnly = true)
    public List<UsuariosInternos> traerInges(Long idaero, Long idp) {
        return (List<UsuariosInternos>) repositorio.traerInges(idaero, idp);
    }

    @Override
    @Transactional(readOnly = true)
    public List<UsuariosInternos> traerTripulantes(Long idaero, Long idp) {
        return  (List<UsuariosInternos>) repositorio.traerTripulantes(idaero, idp);
    }

    @Override
    @Transactional(readOnly = true)
    public List<UsuariosInternos> traerpilotos(Long idaero, Long idp) {
        return(List<UsuariosInternos>) repositorio.traerpilotos(idaero,idp);
    }


    @Override
    @Transactional(readOnly = true)
    public List<TableUsuariosProjection> traerfiltro(String nombre, Long idaero, Long idaerolinea) {
        return(List<TableUsuariosProjection>) repositorio.traerfiltro(nombre, idaero, idaerolinea);
    }




    @Override
    @Transactional(readOnly = true)
    public List<UsuariosInternos> findAllActivos() {
        return(List<UsuariosInternos>) repositorio.findAllActivos();
    }


    @Override
    @Transactional
    public UsuariosInternos save(UsuariosInternos usuarioInterno) {
        repositorio.save(usuarioInterno);
        return usuarioInterno;
    }


    @Override
    @Transactional(readOnly = true)
    public UsuariosInternos findOne(Long id) {
        return repositorio.findById(id).orElseThrow(()-> new ResourceNotFoundException("No existe usuario con el ID: "+ id));
    }

    @Override
    @Transactional
    public void delete(Long id) {
        Optional <UsuariosInternos> usuariosInternos = repositorio.findById(id);
        if(usuariosInternos.isPresent()){
            repositorio.deleteById(usuariosInternos.get().getIdusuariointerno());
        }
    }

    @Override
    public UsuariosInternos findById(Long id) {
       return repositorio.findById(id).orElseThrow(()-> new ResourceNotFoundException("No existe usuario con el ID: "+ id ));
    }

    @Override
    public void eliminalogico(Long id) {
        repositorio.eliminalogico(id);
    }

    @Override
    public UsuariosInternos buscarAdministradores(Long id) {
        return repositorio.buscarAdministradores(id);
    }

}
