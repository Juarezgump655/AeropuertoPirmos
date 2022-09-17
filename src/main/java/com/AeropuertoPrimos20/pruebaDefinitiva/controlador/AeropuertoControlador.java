package com.AeropuertoPrimos20.pruebaDefinitiva.controlador;

import com.AeropuertoPrimos20.pruebaDefinitiva.excepciones.ResourceNotFoundException;
import com.AeropuertoPrimos20.pruebaDefinitiva.modelo.Aeropuertos;
import com.AeropuertoPrimos20.pruebaDefinitiva.ropositorio.AeropuertoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/v4/")
@CrossOrigin(origins = "http://localhost:4200/")   //sirve para cambiar informacion con el frotend
public class AeropuertoControlador {
    @Autowired
    private AeropuertoRepo repositorio;

    //este metodo sirve para listar todos los ususarios

    @GetMapping("/Aeropuerto")
    public List<Aeropuertos> ListarUsuarios(){
        return  repositorio.findAll();

    }
    //metodo para guardar el usuario esto sirve para enviar en formato json

    @PostMapping("/Aeropuerto")
    public Aeropuertos guardarAerolinea(@RequestBody Aeropuertos aeropuertos){
        System.out.print(aeropuertos);
        return repositorio.save(aeropuertos);
    }

    //buusca usuarios por id
    @GetMapping("/Aeropuerto/{id}")
    public ResponseEntity<Aeropuertos> onbtenerAerolineaId(@PathVariable Long id){
        Aeropuertos aeropuertos = repositorio.findById(id)
                .orElseThrow(()-> new ResourceNotFoundException("No existe usuario con el ID: "+ id));
        return ResponseEntity.ok(aeropuertos);
    }

    @PutMapping("/Aeropuerto/{id}")
    public ResponseEntity<Aeropuertos> actualizarUsuarioid(@PathVariable Long id, @RequestBody Aeropuertos detallesAeropuertos){
        Aeropuertos aeropuertos = repositorio.findById(id)
                .orElseThrow(()-> new ResourceNotFoundException("No existe usuario con el ID: "+ id));
        aeropuertos.setIdaeropuerto(detallesAeropuertos.getIdaeropuerto());
        aeropuertos.setNombreaeropuerto(detallesAeropuertos.getNombreaeropuerto());
        aeropuertos.setNopuertas(detallesAeropuertos.getNopuertas());
        aeropuertos.setDireccion(detallesAeropuertos.getDireccion());
        aeropuertos.setPais(detallesAeropuertos.getPais());
        aeropuertos.setNotelefono(detallesAeropuertos.getNotelefono());
        aeropuertos.setIdestado(detallesAeropuertos.getIdestado());
        aeropuertos.setFechacreacion(detallesAeropuertos.getFechacreacion());
        aeropuertos.setFechamodicar(detallesAeropuertos.getFechamodicar());
        aeropuertos.setIdusuariocreacion(detallesAeropuertos.getIdusuariocreacion());
        Aeropuertos aeropuertoActualizado = repositorio.save(aeropuertos);
        return ResponseEntity.ok(aeropuertoActualizado);
    }

    //este metodo sirve para eliminar un empleado
    @DeleteMapping("/Aeropuerto/{id}")
    public ResponseEntity<Map<String,Boolean>> eliminarUsuario(@PathVariable Long id){
        Aeropuertos aeropuertos = repositorio.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("No existe el empleado con el ID : " + id));

        repositorio.delete(aeropuertos);
        Map<String, Boolean> respuesta = new HashMap<>();
        respuesta.put("eliminar",Boolean.TRUE);
        return ResponseEntity.ok(respuesta);
    }
}
