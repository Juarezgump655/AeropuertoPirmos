package com.AeropuertoPrimos20.pruebaDefinitiva.controlador;

import com.AeropuertoPrimos20.pruebaDefinitiva.modelo.Adminstrador;
import com.AeropuertoPrimos20.pruebaDefinitiva.servicio.AdminServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v5/")
@CrossOrigin(origins = "http://localhost:4200/")   //sirve para cambiar informacion con el frotend
public class AdminControlador {

    @Autowired
    private AdminServices adminServices;

    @GetMapping("/Admin")
    public List<Adminstrador> ListarAdministradores(){
        return  adminServices.findAll();
    }

    @GetMapping("/Admin/{id}")
    public ResponseEntity<Adminstrador> onbtenerUsuarioId(@PathVariable Long id){
        Adminstrador adminstrador = adminServices.findById(id);
        return ResponseEntity.ok(adminstrador);
    }


}
