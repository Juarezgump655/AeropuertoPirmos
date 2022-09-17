package com.AeropuertoPrimos20.pruebaDefinitiva.controlador;

import com.AeropuertoPrimos20.pruebaDefinitiva.excepciones.ResourceNotFoundException;
import com.AeropuertoPrimos20.pruebaDefinitiva.modelo.Aerolineas;
import com.AeropuertoPrimos20.pruebaDefinitiva.ropositorio.AerolienaRepo;
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
    private AerolienaRepo repositorio;

    //este metodo sirve para listar todos los ususarios

    @GetMapping("/Aerolineas")
    public List<Aerolineas> ListarUsuarios(){
        return  repositorio.findAll();

    }
    //metodo para guardar el usuario esto sirve para enviar en formato json

    @PostMapping("/Aerolineas")
    public Aerolineas guardarAerolinea(@RequestBody Aerolineas aerolineas){
        System.out.print(aerolineas);
        return repositorio.save(aerolineas);
    }

    //buusca usuarios por id
    @GetMapping("/Aerolineas/{id}")
    public ResponseEntity<Aerolineas> onbtenerAerolineaId(@PathVariable Long id){
        Aerolineas aerolineas = repositorio.findById(id)
                .orElseThrow(()-> new ResourceNotFoundException("No existe usuario con el ID: "+ id));
        return ResponseEntity.ok(aerolineas);
    }

    @PutMapping("/Aerolineas/{id}")
    public ResponseEntity<Aerolineas> actualizarUsuarioid(@PathVariable Long id, @RequestBody Aerolineas detallesAerolineas){
        Aerolineas aerolineas = repositorio.findById(id)
                .orElseThrow(()-> new ResourceNotFoundException("No existe usuario con el ID: "+ id));
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
        Aerolineas aerolineasActualizado = repositorio.save(aerolineas);
        return ResponseEntity.ok(aerolineasActualizado);
    }

    //este metodo sirve para eliminar un empleado
    @DeleteMapping("/Aerolineas/{id}")
    public ResponseEntity<Map<String,Boolean>> eliminarUsuario(@PathVariable Long id){
        Aerolineas aerolineas = repositorio.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("No existe el empleado con el ID : " + id));

        repositorio.delete(aerolineas);
        Map<String, Boolean> respuesta = new HashMap<>();
        respuesta.put("eliminar",Boolean.TRUE);
        return ResponseEntity.ok(respuesta);
    }


}
