package com.AeropuertoPrimos20.pruebaDefinitiva.controlador;

import com.AeropuertoPrimos20.pruebaDefinitiva.modelo.Vuelos;
import com.AeropuertoPrimos20.pruebaDefinitiva.projection.PsajerrosProjection;
import com.AeropuertoPrimos20.pruebaDefinitiva.projection.VuelotableProjection;
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
    public List<VuelotableProjection> listarvuelos(){
        System.out.println("Se esta consultando la tabla vuelos");
        return(List<VuelotableProjection>)  vueloServices.buscartodos();
    }

    @PostMapping("/Vuelos")
    public Vuelos guardarVuelo(@RequestBody Vuelos vuelos) {
        System.out.println("Se esta guardo el vuelo: ");
        System.out.print(vuelos);
        return vueloServices.save(vuelos);
    }


    @GetMapping("/Vuelos/{fecha}/{id}")
    public List<VuelotableProjection> traertabla(@PathVariable String fecha , @PathVariable Long id){
        System.out.println("Se esta consultando la tabla vuelos");
        return(List<VuelotableProjection>)  vueloServices.traertabla(fecha , id);
    }



    @GetMapping("/Vuelos/{id}")
    public ResponseEntity<VuelotableProjection> onbtenerVueloId(@PathVariable Long id){
        VuelotableProjection vuelos = vueloServices.findById(id);
        System.out.println("Se trajo el vuelo con id:  "  + id);
        return ResponseEntity.ok(vuelos);
    }

    @GetMapping("/Vuelos/pasajeros/{id}")
    public List<PsajerrosProjection> reportesPasajero(@PathVariable Long id){
        System.out.println("Se trajo el vuelo con id:  "  + id);
        return(List<PsajerrosProjection>) vueloServices.traerPasajeros(id);
    }






}

