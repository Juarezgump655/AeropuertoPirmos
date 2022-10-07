package com.AeropuertoPrimos20.pruebaDefinitiva.controlador;


import com.AeropuertoPrimos20.pruebaDefinitiva.modelo.Avion;
import com.AeropuertoPrimos20.pruebaDefinitiva.servicio.AvionServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v7/")
@CrossOrigin(origins = "http://localhost:4200/")
public class AvionController {


    AsientoController asiento = new AsientoController();
    @Autowired
    private AvionServices avionServices;

    @GetMapping("/Avion")
    public List<Avion> ListarAerolinea(){
        return  avionServices.findAll();
    }


    @PostMapping("/Avion")
    public Avion guardarAvion(@RequestBody Avion avion) {
        System.out.print(avion);
        return avionServices.save(avion);
    }


    @PutMapping("/Avion/{idusuario}/{id}")
    public ResponseEntity<Avion> actualizarAvionid(@PathVariable Long idusuario, @PathVariable Long id, @RequestBody Avion detallesAvion){
        System.out.println(idusuario);
        Avion avion = avionServices.findById(id);
        avion.setIdavion(detallesAvion.getIdavion());
        avion.setMarca(detallesAvion.getMarca());
        avion.setModelo(detallesAvion.getModelo());
        avion.setVuelos(detallesAvion.getVuelos());
        avion.setIdestado(detallesAvion.getIdestado());
        avion.setIdaerolinea(detallesAvion.getIdaerolinea());
        avion.setFechacreacion(detallesAvion.getFechacreacion());
        avion.setFechamodicar(detallesAvion.getFechamodicar());
        avion.setIdusuariocreacion(detallesAvion.getIdusuariocreacion());
        avion.setIdaeropuerto(detallesAvion.getIdaeropuerto());
        avion.setAnio(detallesAvion.getAnio());
        avion.setUsuariomodi(idusuario);
        Avion avionActualizado = avionServices.save(avion);
        return ResponseEntity.ok(avionActualizado);
    }




}
