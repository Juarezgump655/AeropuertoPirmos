package com.AeropuertoPrimos20.pruebaDefinitiva.controlador;

import com.AeropuertoPrimos20.pruebaDefinitiva.modelo.Asiento;
import com.AeropuertoPrimos20.pruebaDefinitiva.servicio.AsientoServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

@RestController
@RequestMapping("/api/v8/")
@CrossOrigin(origins = "http://localhost:4200/")
public class AsientoController {

    @Autowired
    private AsientoServices asientoServices;


    @PostMapping("/Asiento/{asientos}/{id}")
    public void crearAsientos(@PathVariable Long asientos,@PathVariable Long id) throws ParseException {
        List <Asiento> asientoList = new ArrayList<>();
        Calendar miCalendario = Calendar.getInstance();
        for (int i = 1; i <= asientos; i++){
            asientoList.add(new Asiento(0L , i, id, 2L, miCalendario, miCalendario));
        }
        asientoServices.saveAll(asientoList);


    }




    @PutMapping("/Asiento/{idusuario}/{id}")
    public ResponseEntity<Asiento> actualizarAeroilneaid(@PathVariable Long idusuario, @PathVariable Long id, @RequestBody Asiento detalleAsiento){
        System.out.println(idusuario);
        Asiento asiento = asientoServices.findById(id);
        asiento.setId_asiento(detalleAsiento.getId_asiento());
        asiento.setAsiento(detalleAsiento.getAsiento());
        asiento.setId_avion(detalleAsiento.getId_avion());
        asiento.setId_estado(detalleAsiento.getId_estado());
        asiento.setFechacreacion(detalleAsiento.getFechacreacion());
        asiento.setFechamodicar(detalleAsiento.getFechamodicar());
        Asiento asientoActualizado = asientoServices.save(asiento);
        return ResponseEntity.ok(asientoActualizado);
    }



}
