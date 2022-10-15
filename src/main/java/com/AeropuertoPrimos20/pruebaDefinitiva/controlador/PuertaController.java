package com.AeropuertoPrimos20.pruebaDefinitiva.controlador;


import com.AeropuertoPrimos20.pruebaDefinitiva.modelo.Puerta;
import com.AeropuertoPrimos20.pruebaDefinitiva.projection.puertaProjection;
import com.AeropuertoPrimos20.pruebaDefinitiva.servicio.PuertaServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

@RestController
@RequestMapping("/api/v10/")
@CrossOrigin(origins = "http://localhost:4200/")
public class PuertaController {

    @Autowired
    private PuertaServices puertaServices;


    @PostMapping("/Puerta/{puertas}/{id}")
    public void crearAsientos(@PathVariable Long puertas, @PathVariable Long id) throws ParseException {
        List<Puerta> puertaList = new ArrayList<>();
        Calendar miCalendario = Calendar.getInstance();
        for (int i = 1; i <= puertas; i++){
            puertaList.add(new Puerta(0L , i, id, 2L, miCalendario, miCalendario));
        }

        /*
        for (Puerta model : puertaList) {
            System.out.println("Id: " +model.getId_puerta());
            System.out.println("No.puerta: " +model.getPuertanu());
            System.out.println("ID_Puerta: " +model.getId_aeropuerto());
            System.out.println("Estado" +model.getId_estado());
            System.out.println("Fecha Creacion: " +model.getFechacreacion());
            System.out.println("Fecha Modificar:" +model.getFechamodicar());

        }
        */

        puertaServices.saveAll(puertaList);
    }

    @GetMapping("/Puerta/{id}")
    public List<puertaProjection> traerpuertas(@PathVariable Long id) throws ParseException {
        System.out.println("Se buscaron puertas con el id aeropuerto:  " + id);
         return puertaServices.buscarPuertas(id);
    }


}
