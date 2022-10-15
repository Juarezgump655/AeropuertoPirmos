/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.AeropuertoPrimos20.pruebaDefinitiva.ropositorio;

import com.AeropuertoPrimos20.pruebaDefinitiva.modelo.Usuario;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface Usuarios extends CrudRepository<Usuario, Long> {

    @Query(value = "SELECT * FROM usuarios Where numeropasaporte =:numeroPasaporte" , nativeQuery = true)
    Usuario buscarNumero(@Param("numeroPasaporte")  Long numeroPasaporte);

}
 