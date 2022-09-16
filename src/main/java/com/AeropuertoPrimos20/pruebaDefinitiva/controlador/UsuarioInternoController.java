package com.AeropuertoPrimos20.pruebaDefinitiva.controlador;

import com.AeropuertoPrimos20.pruebaDefinitiva.excepciones.ResourceNotFoundException;
import com.AeropuertoPrimos20.pruebaDefinitiva.modelo.UsuariosInternos;
import com.AeropuertoPrimos20.pruebaDefinitiva.ropositorio.UsuarioInterno;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/v2/")
@CrossOrigin(origins = "http://localhost:4200/")   //sirve para cambiar informacion con el frotend
public class UsuarioInternoController {

    @Autowired
    private UsuarioInterno repositorio;


    //este metodo sirve para listar todos los ususarios

    @GetMapping("/UsuariosInternos")
    public List<UsuariosInternos> ListarUsuariosInternos(){
        return  repositorio.findAll();

    }
    //metodo para guardar el usuario esto sirve para enviar en formato json

    @PostMapping("/UsuariosInternos")
    public UsuariosInternos guardarUsuario(@RequestBody UsuariosInternos UsuariosInternos){
        System.out.print(UsuariosInternos);
        return repositorio.save(UsuariosInternos);
    }

    //buusca usuarios por id
    @GetMapping("/UsuariosInternos/{id}")
    public ResponseEntity<UsuariosInternos> onbtenerUsuarioId(@PathVariable Long id){
        UsuariosInternos usuariosInternos = repositorio.findById(id)
                .orElseThrow(()-> new ResourceNotFoundException("No existe usuario con el ID: "+ id));
        return ResponseEntity.ok(usuariosInternos);
    }

    @PutMapping("/UsuariosInternos/{id}")
    public ResponseEntity<UsuariosInternos> actualizarUsuarioidinterno(@PathVariable Long id, @RequestBody UsuariosInternos detallesUsuariointerno){
        UsuariosInternos usuariosInternos = repositorio.findById(id)
                .orElseThrow(()-> new ResourceNotFoundException("No existe usuario con el ID: "+ id));
        usuariosInternos.setIdusuariointerno(detallesUsuariointerno.getIdusuariointerno());
        usuariosInternos.setDocumentoidentificaion(detallesUsuariointerno.getDocumentoidentificaion());
        usuariosInternos.setNombres(detallesUsuariointerno.getNombres());
        usuariosInternos.setApellidos(detallesUsuariointerno.getApellidos());
        usuariosInternos.setUsuarioingreso(detallesUsuariointerno.getUsuarioingreso());
        usuariosInternos.setFechanacimiento(detallesUsuariointerno.getFechanacimiento());
        usuariosInternos.setNacionalidad(detallesUsuariointerno.getNacionalidad());
        usuariosInternos.setCorreo(detallesUsuariointerno.getCorreo());
        usuariosInternos.setCodigopais(detallesUsuariointerno.getCodigopais());
        usuariosInternos.setGenero(detallesUsuariointerno.getGenero());
        usuariosInternos.setNumerotelefoono(detallesUsuariointerno.getNumerotelefoono());
        usuariosInternos.setNumerotelefoonoem(detallesUsuariointerno.getNumerotelefoonoem());
        usuariosInternos.setDireccion(detallesUsuariointerno.getDireccion());
        usuariosInternos.setContrasenia(detallesUsuariointerno.getContrasenia());
        usuariosInternos.setIdroles(detallesUsuariointerno.getIdroles());
        usuariosInternos.setIdestado(detallesUsuariointerno.getIdestado());
        usuariosInternos.setUsariocreacion(detallesUsuariointerno.getUsariocreacion());
        usuariosInternos.setIdaeropuerto(detallesUsuariointerno.getIdaeropuerto());
        usuariosInternos.setFechacreacion(detallesUsuariointerno.getFechacreacion());
        usuariosInternos.setFechamodicar(detallesUsuariointerno.getFechamodicar());
        usuariosInternos.setIdaerolinea(detallesUsuariointerno.getIdaerolinea());
        UsuariosInternos usuarioActualizado = repositorio.save(usuariosInternos);
        return ResponseEntity.ok(usuarioActualizado);
    }

    //este metodo sirve para eliminar un empleado
    @DeleteMapping("/UsuariosInternos/{id}")
    public ResponseEntity<Map<String,Boolean>> eliminarUsuario(@PathVariable Long id){
        UsuariosInternos usuariosInternos = repositorio.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("No existe el empleado con el ID : " + id));

        repositorio.delete(usuariosInternos);
        Map<String, Boolean> respuesta = new HashMap<>();
        respuesta.put("eliminar",Boolean.TRUE);
        return ResponseEntity.ok(respuesta);
    }

}
