package com.AeropuertoPrimos20.pruebaDefinitiva.modelo;


import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.util.Calendar;

@Entity
@Table(name = "vuelos")
public class Vuelos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private long idvuelo;

    @Column(name = "idaeropuerto", nullable = false)
    private Long  idaeropuerto;

    @Column(name = "idaeropuertosalida", nullable = false)
    private Long idaeropuertosalida;

    @Column(name = "idaerolinea", nullable = false)
    private Long idaerolinea;

    @Column(name = "idestado", nullable = false)
    private Long idestado;

    @Column(name = "idavion", nullable = false)
    private Long idavion;

    @Column(name = "precioeconomico", nullable = false)
    private double precioeconomico;

    @Column(name = "precioejecutivo", nullable = false)
    private double precioejecutivo;

    @Column(name = "puertabordaje", nullable = false)
    private Long puertabordaje;

    @Column(name = "fechasalida", updatable = false, nullable = false)
    @Temporal(TemporalType.DATE)
    @JsonFormat(pattern = "dd-MM-yyyy")
    private Calendar fechasalida;

    @Column(name = "fechallegada", nullable = false)
    @Temporal(TemporalType.DATE)
    @JsonFormat(pattern = "dd-MM-yyyy")
    private Calendar fechallegada;


    @Column(name = "fechacreacion", updatable = false, nullable = false)
    @Temporal(TemporalType.DATE)
    @JsonFormat(pattern = "dd-MM-yyyy")
    private Calendar fechacreacion;

    @Column(name = "fechamodicar", nullable = false)
    @Temporal(TemporalType.DATE)
    @JsonFormat(pattern = "dd-MM-yyyy")
    private Calendar fechamodicar;

    @Column(name = "idusuariocreacion", nullable = false)
    private Long idusuariocreacion;

    @Column(name = "idestadovuelo", nullable = false)
    private Long idestadovuelo;

    @Column(name = "id_tripu", nullable = false)
    private Long id_tripu;

    @Column(name = "horasalida", nullable = false)
    private String horasalida;

    @Column(name = "horallegada", nullable = false)
    private String horallegada;






}
