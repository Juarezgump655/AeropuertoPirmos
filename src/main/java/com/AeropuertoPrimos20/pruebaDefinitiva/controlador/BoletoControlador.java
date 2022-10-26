package com.AeropuertoPrimos20.pruebaDefinitiva.controlador;

import com.AeropuertoPrimos20.pruebaDefinitiva.modelo.Boleto;
import com.AeropuertoPrimos20.pruebaDefinitiva.projection.BoletoProjection;
import com.AeropuertoPrimos20.pruebaDefinitiva.servicio.BoletoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/b1/")
@CrossOrigin(origins = "http://localhost:4200/")
public class BoletoControlador {

    @Autowired
    private BoletoService boletoService;

    @GetMapping("/boletos")
    public List<Boleto> listarvuelos(){
        System.out.println("Se esta consultando la tabla boletos");
        return(List<Boleto>)  boletoService.findAll();
    }


    @GetMapping("/boletos/{id}")
    public BoletoProjection buscarporid(@PathVariable Long id){
        System.out.println("Se esta consultando la tabla boletos");
        return  boletoService.traerBoleto(id);
    }


    @PostMapping("/boletos")
    public Boleto guardarVuelo(@RequestBody Boleto boleto) {
        System.out.println("Se esta guardo el boleto: ");
        System.out.print(boleto);
        return boletoService.save(boleto);
    }

    @PutMapping("/boletos/{id}")
    public ResponseEntity<Boleto> actualizarUsuarioid(@PathVariable Long id, @RequestBody Boleto detalleBoleto){
        Boleto boleto = boletoService.findById(id);
        boleto.setIdboletos(detalleBoleto.getIdboletos());
        boleto.setIdvuelo(detalleBoleto.getIdvuelo());
        boleto.setIdusuario(detalleBoleto.getIdusuario());
        boleto.setFechacreacion(detalleBoleto.getFechacreacion());
        boleto.setFechamodicar(detalleBoleto.getFechamodicar());
        boleto.setUsuariocreacion(detalleBoleto.getUsuariocreacion());
        boleto.setNomaletas(detalleBoleto.getNomaletas());
        boleto.setIdestadoboleto(detalleBoleto.getIdestadoboleto());
        boleto.setPrecio(detalleBoleto.getPrecio());
        boleto.setCantidad(detalleBoleto.getCantidad());
        Boleto boletoActualizado = boletoService.save(boleto);
        return ResponseEntity.ok(boletoActualizado);
    }





}
