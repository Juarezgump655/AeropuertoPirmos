package com.AeropuertoPrimos20.pruebaDefinitiva.ropositorio;

import com.AeropuertoPrimos20.pruebaDefinitiva.modelo.UsuariosInternos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioInterno extends JpaRepository<UsuariosInternos, Long> {

}
