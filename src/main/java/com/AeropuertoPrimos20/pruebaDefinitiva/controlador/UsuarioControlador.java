package com.AeropuertoPrimos20.pruebaDefinitiva.controlador;

import com.AeropuertoPrimos20.pruebaDefinitiva.excepciones.ResourceNotFoundException;
import com.AeropuertoPrimos20.pruebaDefinitiva.modelo.Usuario;
import com.AeropuertoPrimos20.pruebaDefinitiva.ropositorio.Usuarios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


//Apir rest
@RestController
@RequestMapping("/api/v1/")
@CrossOrigin(origins = "http://localhost:4200/")   //sirve para cambiar informacion con el frotend
public class UsuarioControlador {
    @Autowired
    private Usuarios repositorio;

    //este metodo sirve para listar todos los ususarios

    @GetMapping("/Usuarios")
    public List<Usuario> ListarUsuarios(){
    return  repositorio.findAll();

    }
    //metodo para guardar el usuario esto sirve para enviar en formato json

    @PostMapping("/Usuarios")
    public Usuario guardarUsuario(@RequestBody Usuario usuario){
        System.out.print(usuario);
        return repositorio.save(usuario);
    }

    //buusca usuarios por id
    @GetMapping("/Usuarios/{id}")
    public ResponseEntity<Usuario> onbtenerUsuarioId(@PathVariable Long id){
        Usuario usuario = repositorio.findById(id)
                .orElseThrow(()-> new ResourceNotFoundException("No existe usuario con el ID: "+ id));
        return ResponseEntity.ok(usuario);
    }

     @PutMapping("/Usuarios/{id}")
     public ResponseEntity<Usuario> actualizarUsuarioid(@PathVariable Long id, @RequestBody Usuario detallesUsuario){
         Usuario usuario = repositorio.findById(id)
                 .orElseThrow(()-> new ResourceNotFoundException("No existe usuario con el ID: "+ id));
         usuario.setNumeroPasaporte(detallesUsuario.getNumeroPasaporte());
         usuario.setNombreCliente(detallesUsuario.getNombreCliente());
         usuario.setFechanacimiento(detallesUsuario.getFechanacimiento());
         usuario.setNacionalidad(detallesUsuario.getNacionalidad());
         usuario.setCorreo(detallesUsuario.getCorreo());
         usuario.setCodigopais(detallesUsuario.getCodigopais());
         usuario.setNumerotelefoono(detallesUsuario.getNumerotelefoono());
         usuario.setNumerotelefoonoem(detallesUsuario.getNumerotelefoonoem());
         usuario.setDireccion(detallesUsuario.getDireccion());
         usuario.setContrasenia(detallesUsuario.getContrasenia());
         Usuario usuarioActualizado = repositorio.save(usuario);
         return ResponseEntity.ok(usuarioActualizado);
     }

    //este metodo sirve para eliminar un empleado
    @DeleteMapping("/Usuarios/{id}")
    public ResponseEntity<Map<String,Boolean>> eliminarUsuario(@PathVariable Long id){
        Usuario usuario = repositorio.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("No existe el empleado con el ID : " + id));

        repositorio.delete(usuario);
        Map<String, Boolean> respuesta = new HashMap<>();
        respuesta.put("eliminar",Boolean.TRUE);
        return ResponseEntity.ok(respuesta);
    }
}
