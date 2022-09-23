package com.AeropuertoPrimos20.pruebaDefinitiva.servicio;


import com.AeropuertoPrimos20.pruebaDefinitiva.modelo.Adminstrador;

import java.util.List;

public interface AdminServices {

    public List<Adminstrador> findAll();

    //Guardar usuario
    public Adminstrador save(Adminstrador Adminstrador);

    //buscar el usuario
    public Adminstrador findOne(Long id);

    //Eliminar el usuario
    public void delete(Long id);

    public Adminstrador findById(Long id);



}
