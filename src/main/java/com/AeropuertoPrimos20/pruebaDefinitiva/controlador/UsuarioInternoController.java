package com.AeropuertoPrimos20.pruebaDefinitiva.controlador;

import com.AeropuertoPrimos20.pruebaDefinitiva.modelo.UsuariosInternos;
import com.AeropuertoPrimos20.pruebaDefinitiva.projection.RoleNameProjection;
import com.AeropuertoPrimos20.pruebaDefinitiva.projection.TableUsuariosProjection;
import com.AeropuertoPrimos20.pruebaDefinitiva.servicio.UsuariosInternosServices;
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
    private UsuariosInternosServices usuariosInternosServices;


    //este metodo sirve para listar todos los ususarios


    @GetMapping("/UsuariosInternos")
    public List<TableUsuariosProjection> ListarUsuariosInternos(){
        return  usuariosInternosServices.traertabla();

    }
    @GetMapping("/UsuariosInternos/filtro/{nombre}/{idaero}/{idaerolinea}")
    public List<TableUsuariosProjection> obtenerAeropuertosfiltro(@PathVariable String nombre, @PathVariable Long idaero, @PathVariable Long idaerolinea){
        return usuariosInternosServices.traerfiltro(nombre, idaero, idaerolinea);
    }
    @GetMapping("/UsuariosInternos/rol")
    public List<RoleNameProjection> ListarUsuariosInterno(){
        return  usuariosInternosServices.traerNombre();
    }


        //metodo para guardar el usuario esto sirve para enviar en formato json

    @PostMapping("/UsuariosInternos")
    public UsuariosInternos guardarUsuario(@RequestBody UsuariosInternos UsuariosInternos){
        System.out.print(UsuariosInternos);
        return usuariosInternosServices.save(UsuariosInternos);
    }



    //buusca usuarios por id
    @GetMapping("/UsuariosInternos/{id}")
    public ResponseEntity<UsuariosInternos> onbtenerUsuarioId(@PathVariable Long id){
        UsuariosInternos usuariosInternos = usuariosInternosServices.findById(id);
        return ResponseEntity.ok(usuariosInternos);
    }
    @GetMapping("/UsuariosInternos/inicio-sesion/{id}")
    public ResponseEntity<UsuariosInternos> inicioSesion(@PathVariable Long id){
        UsuariosInternos usuariosInternos = usuariosInternosServices.buscarAdministradores(id);
        return ResponseEntity.ok(usuariosInternos);
    }
    @GetMapping("/UsuariosInternos/pilotos/{idaero}/{idp}")
    public List<UsuariosInternos> onbtenerpilotos(@PathVariable Long idaero, @PathVariable Long idp){
        return  usuariosInternosServices.traerpilotos(idaero, idp);
    }

    @GetMapping("/UsuariosInternos/copilotos/{idaero}/{idp}")
    public List<UsuariosInternos> onbtenercopilotos(@PathVariable Long idaero, @PathVariable Long idp){
        return  usuariosInternosServices.traercopilotos(idaero, idp );
    }

    @GetMapping("/UsuariosInternos/ingenieros/{idaero}/{idp}")
    public List<UsuariosInternos> obtenerInges(@PathVariable Long idaero, @PathVariable Long idp){
        return  usuariosInternosServices.traerInges(idaero, idp );
    }

    @GetMapping("/UsuariosInternos/tripulantes/{idaero}/{idp}")
    public List<UsuariosInternos> obtenerTripulantes(@PathVariable Long idaero, @PathVariable Long idp){
        return  usuariosInternosServices.traerTripulantes(idaero, idp );
    }


    @PutMapping("/UsuariosInternos/{idaero}/{id}")
    public ResponseEntity<UsuariosInternos> actualizarUsuarioidinterno(@PathVariable Long idaero,@PathVariable Long id, @RequestBody UsuariosInternos detallesUsuariointerno){
        System.out.println(idaero + "espacio"+ id );
        UsuariosInternos usuariosInternos = usuariosInternosServices.findById(id);
        usuariosInternos.setIdusuariointerno(detallesUsuariointerno.getIdusuariointerno());
        usuariosInternos.setDocumentoidentificaion(detallesUsuariointerno.getDocumentoidentificaion());
        usuariosInternos.setNombres(detallesUsuariointerno.getNombres());
        usuariosInternos.setApellidos(detallesUsuariointerno.getApellidos());
        usuariosInternos.setFechanacimiento(detallesUsuariointerno.getFechanacimiento());
        usuariosInternos.setNacionalidad(detallesUsuariointerno.getNacionalidad());
        usuariosInternos.setCorreo(detallesUsuariointerno.getCorreo());
        usuariosInternos.setCodigopais(detallesUsuariointerno.getCodigopais());
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
        usuariosInternos.setUsuariomodi(idaero);
        UsuariosInternos usuarioActualizado = usuariosInternosServices.save(usuariosInternos);
        return ResponseEntity.ok(usuarioActualizado);
    }

    //este metodo sirve para eliminar un empleado
    @DeleteMapping("/UsuariosInternos/{id}")
    public ResponseEntity<Map<String,Boolean>> eliminarUsuario(@PathVariable Long id){
        usuariosInternosServices.delete(id);
        Map<String, Boolean> respuesta = new HashMap<>();
        respuesta.put("eliminar",Boolean.TRUE);
        return ResponseEntity.ok(respuesta);
    }




}
