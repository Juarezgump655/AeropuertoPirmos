package com.AeropuertoPrimos20.pruebaDefinitiva.controlador;

import com.AeropuertoPrimos20.pruebaDefinitiva.modelo.Usuario;
import com.AeropuertoPrimos20.pruebaDefinitiva.ropositorio.Usuarios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//Apir rest
@RestController
@RequestMapping("/api/v1/")
public class UsuarioControlador {
    @Autowired
    private Usuarios repositorio;

    @GetMapping("/Usuarios")
    public List<Usuario> ListarUsuarios(){
    return  repositorio.findAll();

    }
}
