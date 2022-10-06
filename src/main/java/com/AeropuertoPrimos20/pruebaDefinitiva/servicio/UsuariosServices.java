/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.AeropuertoPrimos20.pruebaDefinitiva.servicio;

import com.AeropuertoPrimos20.pruebaDefinitiva.modelo.Usuario;

import java.util.List;

public interface UsuariosServices {

    //metodo para buscar todos los empleados
    public List<Usuario> findAll();
    // paginacion

    //Guardar usuario
    public Usuario save(Usuario usuario);

    //buscar el usuario
    public Usuario findOne(Long id);


     //Eliminar el usuario
    public void delete(Long id);

    public Usuario findById(Long id);

    public  Usuario buscarNumero(Long numeroPasaporte);

}
