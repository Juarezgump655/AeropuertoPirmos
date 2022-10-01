package com.AeropuertoPrimos20.pruebaDefinitiva.controlador;

import com.AeropuertoPrimos20.pruebaDefinitiva.modelo.Aeropuertos;
import com.AeropuertoPrimos20.pruebaDefinitiva.projection.AeropuertoNameProjection;
import com.AeropuertoPrimos20.pruebaDefinitiva.servicio.AeropuertoServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/v4/")
@CrossOrigin(origins = "http://localhost:4200/")   //sirve para cambiar informacion con el frotend
public class AeropuertoControlador {
    @Autowired
    private AeropuertoServices aeropuertoServices;

    //este metodo sirve para listar todos los ususarios

    @GetMapping("/Aeropuerto")
    public List<Aeropuertos> ListarUsuarios(){
        return  aeropuertoServices.findAllActivos();

    }
    //metodo para guardar el usuario esto sirve para enviar en formato json

    @PostMapping("/Aeropuerto")
    public Aeropuertos guardarAerolinea(@RequestBody Aeropuertos aeropuertos){
        System.out.print(aeropuertos);
        return aeropuertoServices.save(aeropuertos);
    }
    //buusca usuarios por id
    @GetMapping("/Aeropuerto/{id}")
    public ResponseEntity<Aeropuertos> onbtenerAerolineaId(@PathVariable Long id){
        Aeropuertos aeropuertos = aeropuertoServices.findById(id);
        return ResponseEntity.ok(aeropuertos);
    }

    @GetMapping("/Aeropuerto/list")
    public List<AeropuertoNameProjection> ListarAeropuertos(){
        return  aeropuertoServices.traerAeropuertos();
    }

    @GetMapping("/Aeropuerto/filtro/{id}")
    public List<Aeropuertos> obtenerAeropuertosID(@PathVariable Long id){
        Aeropuertos aeropuertos = aeropuertoServices.findById(id);
        List<Aeropuertos> lista= new ArrayList<Aeropuertos>();
        lista.add(aeropuertos);
        return lista;
    }
    @GetMapping("/Aeropuerto/filtro/{nombre}/{direccion}")
    public List<Aeropuertos> obtenerAeropuertosfiltro(@PathVariable String nombre, @PathVariable String direccion){
        return aeropuertoServices.findbynombreAnddireccion(nombre , direccion);
    }



    @PutMapping("/Aeropuerto/{id}")
    public ResponseEntity<Aeropuertos> actualizarUsuarioid(@PathVariable Long id, @RequestBody Aeropuertos detallesAeropuertos){
        Aeropuertos aeropuertos = aeropuertoServices.findById(id);
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
        Aeropuertos aeropuertoActualizado = aeropuertoServices.save(aeropuertos);
        return ResponseEntity.ok(aeropuertoActualizado);
    }

    //este metodo sirve para eliminar un empleado
    @DeleteMapping("/Aeropuerto/{id}")
    public ResponseEntity<Map<String,Boolean>> eliminarUsuario(@PathVariable Long id){
        aeropuertoServices.delete(id);
        Map<String, Boolean> respuesta = new HashMap<>();
        respuesta.put("eliminar",Boolean.TRUE);
        return ResponseEntity.ok(respuesta);
    }
}
