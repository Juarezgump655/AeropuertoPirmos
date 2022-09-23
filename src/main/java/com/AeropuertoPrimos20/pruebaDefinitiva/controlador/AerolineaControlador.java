package com.AeropuertoPrimos20.pruebaDefinitiva.controlador;

import com.AeropuertoPrimos20.pruebaDefinitiva.modelo.Aerolineas;
import com.AeropuertoPrimos20.pruebaDefinitiva.servicio.AerolineasServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
@RestController
@RequestMapping("/api/v3/")
@CrossOrigin(origins = "http://localhost:4200/")   //sirve para cambiar informacion con el frotend
public class AerolineaControlador {
    @Autowired
    private AerolineasServices aerolineasServices;

    //este metodo sirve para listar todos los ususarios

    @GetMapping("/Aerolineas")
    public List<Aerolineas> ListarUsuarios(){
        return  aerolineasServices.findAll();
    }
    //metodo para guardar el usuario esto sirve para enviar en formato json

    @PostMapping("/Aerolineas")
    public Aerolineas guardarAerolinea(@RequestBody Aerolineas aerolineas){
        System.out.print(aerolineas);
        return aerolineasServices.save(aerolineas);
    }

    //buusca usuarios por id
    @GetMapping("/Aerolineas/{id}")
    public ResponseEntity<Aerolineas> onbtenerAerolineaId(@PathVariable Long id){
        Aerolineas aerolineas = aerolineasServices.findById(id);
        return ResponseEntity.ok(aerolineas);
    }

    @PutMapping("/Aerolineas/{id}")
    public ResponseEntity<Aerolineas> actualizarUsuarioid(@PathVariable Long id, @RequestBody Aerolineas detallesAerolineas){
        Aerolineas aerolineas = aerolineasServices.findById(id);
        aerolineas.setIdaerolineas(detallesAerolineas.getIdaerolineas());
        aerolineas.setNombreaerolinea(detallesAerolineas.getNombreaerolinea());
        aerolineas.setCorreo(detallesAerolineas.getCorreo());
        aerolineas.setCodigopais(detallesAerolineas.getCodigopais());
        aerolineas.setIdestado(detallesAerolineas.getIdestado());
        aerolineas.setIdusuariocreacion(detallesAerolineas.getIdusuariocreacion());
        aerolineas.setIdaeropuerto(detallesAerolineas.getIdaeropuerto());
        aerolineas.setVuelos(detallesAerolineas.getVuelos());
        aerolineas.setAviones(detallesAerolineas.getAviones());
        aerolineas.setFechacreacion(detallesAerolineas.getFechacreacion());
        aerolineas.setFechamodicar(detallesAerolineas.getFechamodicar());
        Aerolineas aerolineasActualizado = aerolineasServices.save(aerolineas);
        return ResponseEntity.ok(aerolineasActualizado);
    }

    //este metodo sirve para eliminar un empleado
    @DeleteMapping("/Aerolineas/{id}")
    public ResponseEntity<Map<String,Boolean>> eliminarUsuario(@PathVariable Long id){
        aerolineasServices.delete(id);
        Map<String, Boolean> respuesta = new HashMap<>();
        respuesta.put("eliminar",Boolean.TRUE);
        return ResponseEntity.ok(respuesta);
    }


}
