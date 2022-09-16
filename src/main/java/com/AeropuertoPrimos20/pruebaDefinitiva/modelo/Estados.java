package com.AeropuertoPrimos20.pruebaDefinitiva.modelo;

import javax.persistence.*;
import java.util.Calendar;
@Entity
@Table(name = "Status")
public class Estados {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private long IdEstatus;

    @Column(nullable = false, length = 75)
    private String NombreEstado;

    @Column(name = "Fecha_registro", updatable = false, nullable = false)
    @Temporal(TemporalType.DATE)
    private Calendar Fecha_registro;

    @Column(name = "Fecha_Modifco", nullable = false)
    @Temporal(TemporalType.DATE)
    private Calendar Fecha_Modifco;


}
