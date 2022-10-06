package com.AeropuertoPrimos20.pruebaDefinitiva.servicio;

import com.AeropuertoPrimos20.pruebaDefinitiva.excepciones.ResourceNotFoundException;
import com.AeropuertoPrimos20.pruebaDefinitiva.modelo.Usuario;
import com.AeropuertoPrimos20.pruebaDefinitiva.ropositorio.Usuarios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class UsuariosServicesmpl implements UsuariosServices{

    @Autowired
    private Usuarios repositorio;
    @Override
    @Transactional(readOnly = true)
    public List<Usuario> findAll() {
        return(List<Usuario>) repositorio.findAll();
    }


    @Override
    public Usuario save(Usuario usuario) {
        repositorio.save(usuario);
        return usuario;
    }

    @Override
    @Transactional(readOnly = true)
    public Usuario findOne(Long id) {
        return repositorio.findById(id).orElse(null);
    }

    @Override
    public void delete(Long id) {
        Optional<Usuario> usuario = repositorio.findById(id);
        if(usuario.isPresent()){
            repositorio.deleteById(usuario.get().getIdusuario());
        }
    }

    @Override
    public Usuario findById(Long id) {
        return repositorio.findById(id).orElseThrow(()-> new ResourceNotFoundException("No existe usuario con el ID: "+ id));
    }

    @Override
    public Usuario buscarNumero(Long numeroPasaporte) {
        return repositorio.buscarNumero(numeroPasaporte);
    }


}
