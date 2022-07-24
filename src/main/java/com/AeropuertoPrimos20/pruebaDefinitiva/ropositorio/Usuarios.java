/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.AeropuertoPrimos20.pruebaDefinitiva.ropositorio;

import com.AeropuertoPrimos20.pruebaDefinitiva.modelo.Usuario;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface Usuarios extends PagingAndSortingRepository<Usuario, Long>{
    
}
 