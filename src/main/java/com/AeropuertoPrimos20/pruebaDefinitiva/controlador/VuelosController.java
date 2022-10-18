package com.AeropuertoPrimos20.pruebaDefinitiva.controlador;

import com.AeropuertoPrimos20.pruebaDefinitiva.modelo.Vuelos;
import com.AeropuertoPrimos20.pruebaDefinitiva.servicio.VueloServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v9/")
@CrossOrigin(origins = "http://localhost:4200/")
public class VuelosController {

    @Autowired
    private VueloServices vueloServices;

    @GetMapping("/Vuelos")
    public List<Vuelos> listarvuelos(){
        System.out.println("Se esta consultando la tabla vuelos");
        return(List<Vuelos>)  vueloServices.findAll();
    }

    @PostMapping("/Vuelos")
    public Vuelos guardarVuelo(@RequestBody Vuelos vuelos) {
        System.out.println("Se esta guardo el vuelo: ");
        System.out.print(vuelos);
        return vueloServices.save(vuelos);
    }

    @GetMapping("/Vuelos/{id}")
    public ResponseEntity<Vuelos> onbtenerVueloId(@PathVariable Long id){
        Vuelos vuelos = vueloServices.findById(id);
        System.out.println("Se trajo el avion con id:  "  + id);
        return ResponseEntity.ok(vuelos);
    }



}

