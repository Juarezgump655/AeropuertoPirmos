package com.AeropuertoPrimos20.pruebaDefinitiva.controlador;


import com.AeropuertoPrimos20.pruebaDefinitiva.modelo.Tripulacion;
import com.AeropuertoPrimos20.pruebaDefinitiva.servicio.TripulacionServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/v6/")
@CrossOrigin(origins = "http://localhost:4200/")
public class TripulacionController {

    @Autowired
    private TripulacionServices tripulacionServices;

    @GetMapping("/Tripulacion")
    public List<Tripulacion> listarTripu(){
        return  tripulacionServices.findAllActivos();

    }


    @PostMapping("/Tripulacion/{id}")
    public Tripulacion guardarTripu(@PathVariable Long id,@RequestBody Tripulacion Tripulacion){
        System.out.print(Tripulacion);
        return tripulacionServices.save(Tripulacion);
    }

    @GetMapping("/Tripulacion/{id}")
    public ResponseEntity<Tripulacion> onbtenerTripuId(@PathVariable Long id){
        Tripulacion tripulacion = tripulacionServices.findById(id);
        return ResponseEntity.ok(tripulacion);
    }

    @PutMapping("/Tripulacion/{id}")
    public ResponseEntity<Tripulacion> actualizarTripulacion(@PathVariable Long id, @RequestBody Tripulacion detalleTripulacion){
        Tripulacion tripulacion = tripulacionServices.findById(id);
        tripulacion.setIdtripulacion(detalleTripulacion.getIdtripulacion());
        tripulacion.setIdaeropuerto(detalleTripulacion.getIdaeropuerto());
        tripulacion.setIdpiloto(detalleTripulacion.getIdpiloto());
        tripulacion.setIdcopiloto(detalleTripulacion.getIdcopiloto());
        tripulacion.setIdingeniero(detalleTripulacion.getIdingeniero());
        tripulacion.setIdtripulantes1(detalleTripulacion.getIdtripulantes1());
        tripulacion.setIdtripulantes2(detalleTripulacion.getIdtripulantes2());
        tripulacion.setIdtripulantes3(detalleTripulacion.getIdtripulantes3());
        tripulacion.setIdaerolinea(detalleTripulacion.getIdaerolinea());
        tripulacion.setIdestado(detalleTripulacion.getIdestado());
        tripulacion.setIdavion(detalleTripulacion.getIdavion());
        tripulacion.setFechacreacion(detalleTripulacion.getFechacreacion());
        tripulacion.setFechamodicar(detalleTripulacion.getFechamodicar());
        tripulacion.setIdusuariocreacion(detalleTripulacion.getIdusuariocreacion());
        tripulacion.setIdestado(detalleTripulacion.getIdestado());
        Tripulacion  tripulacionActualizado = tripulacionServices.save(tripulacion);
        return ResponseEntity.ok(tripulacionActualizado);
    }
    @DeleteMapping("/Tripulacion/{id}")
    public ResponseEntity<Map<String,Boolean>> eliminarTripu(@PathVariable Long id){
        tripulacionServices.delete(id);
        Map<String, Boolean> respuesta = new HashMap<>();
        respuesta.put("eliminar",Boolean.TRUE);
        return ResponseEntity.ok(respuesta);
    }

}
