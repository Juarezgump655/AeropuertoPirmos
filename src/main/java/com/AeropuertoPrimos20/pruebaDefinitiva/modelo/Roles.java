package com.AeropuertoPrimos20.pruebaDefinitiva.modelo;

import javax.persistence.*;
import java.util.Calendar;
@Entity
@Table(name = "Roles")
public class Roles {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private long IdRoles;

    @Column(nullable = false, length = 75)
    private String NombreRol;

    @Column(name = "Fecha_registro", updatable = false, nullable = false)
    @Temporal(TemporalType.DATE)
    private Calendar Fecha_registro;

    @Column(name = "Fecha_Modifco", nullable = false)
    @Temporal(TemporalType.DATE)
    private Calendar Fecha_Modifco;

}
