package com.AeropuertoPrimos20.pruebaDefinitiva.controlador;

import com.AeropuertoPrimos20.pruebaDefinitiva.modelo.Usuario;
import com.AeropuertoPrimos20.pruebaDefinitiva.servicio.UsuariosServices;
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
    private UsuariosServices usuarioServices;

    //este metodo sirve para listar todos los ususarios

    @GetMapping("/Usuarios")
    public List<Usuario> ListarUsuarios(){
    return  usuarioServices.findAll();
    }
    //metodo para guardar el usuario esto sirve para enviar en formato json

    @PostMapping("/Usuarios")
    public Usuario guardarUsuario(@RequestBody Usuario usuario){
        System.out.print(usuario);
        return usuarioServices.save(usuario);
    }

    //buusca usuarios por id
    @GetMapping("/Usuarios/{id}")
    public ResponseEntity<Usuario> onbtenerUsuarioId(@PathVariable Long id){
        Usuario usuario = usuarioServices.findById(id);
        return ResponseEntity.ok(usuario);
    }

    @GetMapping("/Usuarios/numeroPasaporte/{id}")
    public Usuario obtenernumoero(@PathVariable Long id){;
        return usuarioServices.buscarNumero(id);
    }


    @PutMapping("/Usuarios/{id}")
     public ResponseEntity<Usuario> actualizarUsuarioid(@PathVariable Long id, @RequestBody Usuario detallesUsuario){
         Usuario usuario = usuarioServices.findById(id);
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
         Usuario usuarioActualizado = usuarioServices.save(usuario);
         return ResponseEntity.ok(usuarioActualizado);
     }

    //este metodo sirve para eliminar un empleado
    @DeleteMapping("/Usuarios/{id}")
    public ResponseEntity<Map<String,Boolean>> eliminarUsuario(@PathVariable Long id){
        usuarioServices.delete(id);
        Map<String, Boolean> respuesta = new HashMap<>();
        respuesta.put("eliminar",Boolean.TRUE);
        return ResponseEntity.ok(respuesta);
    }
}
