package com.AeropuertoPrimos20.pruebaDefinitiva.servicio;

import com.AeropuertoPrimos20.pruebaDefinitiva.modelo.Avion;

import java.util.List;

public interface AvionServices {

    public List<Avion> findAll();

    //Guardar usuario
    public Avion save(Avion avion);

    //buscar por id
    public Avion findById(Long id);

    public  List<Avion>  findByAerolinea(Long id);

    public void delete(Long id);

    public  List<Avion>  findByAerolineaT(Long id);

    public  void cambiarEstado(Long iduser,Long id);

    public void eliminadologico(Long iduser,Long id);

}
