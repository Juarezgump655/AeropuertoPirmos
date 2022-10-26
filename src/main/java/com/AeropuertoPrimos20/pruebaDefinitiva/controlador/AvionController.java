package com.AeropuertoPrimos20.pruebaDefinitiva.controlador;


import com.AeropuertoPrimos20.pruebaDefinitiva.modelo.Avion;
import com.AeropuertoPrimos20.pruebaDefinitiva.servicio.AvionServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/v7/")
@CrossOrigin(origins = "http://localhost:4200/")
public class AvionController {


    @Autowired
    private AvionServices avionServices;

    @GetMapping("/Avion")
    public List<Avion> ListarAvion(){
        return  avionServices.findAll();
    }


    @PostMapping("/Avion")
    public Avion guardarAvion(@RequestBody Avion avion) {
        System.out.print(avion);
        return avionServices.save(avion);
    }


    @GetMapping("/Avion/{idusuario}/{id}")
    public List<Avion> findByAerolinea(@PathVariable Long id){
        System.out.println("Se buscaron aviones con el id de la aerolinea " + id);
        return avionServices.findByAerolinea(id);
    }


    @GetMapping("/Avion/cambiarestado/{idusuario}/{id}")
    public void cambiarestado(@PathVariable Long idusuario,@PathVariable Long id){
        System.out.println("Se buscaron aviones con el id de la aerolinea " + id);
      avionServices.cambiarEstado(idusuario,id);
    }

    @GetMapping("/Avion/elimando/{idusuario}/{id}")
    public void eliminadoLogico(@PathVariable Long idusuario,@PathVariable Long id){
        System.out.println("Se buscaron aviones con el id de la aerolinea " + id);
      avionServices.eliminadologico(idusuario,id);
    }


    @GetMapping("/Avion/reporte/{idusuario}/{id}")
    public List<Avion> findByAerolineaT(@PathVariable Long id){
        System.out.println("Se buscaron aviones con el id de la aerolinea " + id);
        return avionServices.findByAerolineaT(id);
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

    @GetMapping("/Avion/{id}")
    public ResponseEntity<Avion> onbtenerAvionId(@PathVariable Long id){
        System.out.println("Se busco el avion con el id:  " + id);
        Avion avion = avionServices.findById(id);
        return ResponseEntity.ok(avion);
    }

    @DeleteMapping("/Avion/{id}")
    public ResponseEntity<Map<String,Boolean>> eliminarAvion(@PathVariable Long id){
        avionServices.delete(id);
        Map<String, Boolean> respuesta = new HashMap<>();
        respuesta.put("eliminar",Boolean.TRUE);
        return ResponseEntity.ok(respuesta);
    }





}
