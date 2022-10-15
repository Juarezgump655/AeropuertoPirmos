package com.AeropuertoPrimos20.pruebaDefinitiva.modelo;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Calendar;

@Entity
@Table(name = "avion")
public class Avion implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private long idavion;

    @Column(name= "marca", nullable = false)
    private String marca;

    @Column(name= "modelo", nullable = false)
    private String modelo;

    @Column(name = "vuelos", nullable = false)
    private Long vuelos;

    @Column(name = "idestado", nullable = false)
    private Long idestado;

    @Column(name = "idaerolinea", nullable = false)
    private Long idaerolinea;

    @Column(name = "fechacreacion", nullable = false)
    @JsonFormat(pattern = "dd-MM-yyyy")
    @Temporal(TemporalType.DATE)
    private Calendar fechacreacion;

    @Column(name = "fechamodicar", nullable = false)
    @JsonFormat(pattern = "dd-MM-yyyy")
    @Temporal(TemporalType.DATE)
    private Calendar fechamodicar;

    @Column(name = "idusuariocreacion", nullable = false)
    private Long idusuariocreacion;

    @Column(name = "idaeropuerto", nullable = false)
    private Long idaeropuerto;


    @Column(name = "usuariomodi", nullable = false)
    private Long usuariomodi;

    @Column(name = "anio", nullable = false)
    private int anio;

    @Column(name = "asientos", nullable = false)
    private int asientos;


    public Avion() {
    }

    public Avion(long idavion, String marca, String modelo, Long vuelos, Long idestado, Long idaerolinea, Calendar fechacreacion, Calendar fechamodicar, Long idusuariocreacion, Long idaeropuerto, Long usuariomodi, int anio, int asientos) {
        this.idavion = idavion;
        this.marca = marca;
        this.modelo = modelo;
        this.vuelos = vuelos;
        this.idestado = idestado;
        this.idaerolinea = idaerolinea;
        this.fechacreacion = fechacreacion;
        this.fechamodicar = fechamodicar;
        this.idusuariocreacion = idusuariocreacion;
        this.idaeropuerto = idaeropuerto;
        this.usuariomodi = usuariomodi;
        this.anio = anio;
        this.asientos = asientos;
    }

    public long getIdavion() {
        return idavion;
    }

    public void setIdavion(long idavion) {
        this.idavion = idavion;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Long getVuelos() {
        return vuelos;
    }

    public void setVuelos(Long vuelos) {
        this.vuelos = vuelos;
    }

    public Long getIdestado() {
        return idestado;
    }

    public void setIdestado(Long idestado) {
        this.idestado = idestado;
    }

    public Long getIdaerolinea() {
        return idaerolinea;
    }

    public void setIdaerolinea(Long idaerolinea) {
        this.idaerolinea = idaerolinea;
    }

    public Calendar getFechacreacion() {
        return fechacreacion;
    }

    public void setFechacreacion(Calendar fechacreacion) {
        this.fechacreacion = fechacreacion;
    }

    public Calendar getFechamodicar() {
        return fechamodicar;
    }

    public void setFechamodicar(Calendar fechamodicar) {
        this.fechamodicar = fechamodicar;
    }

    public Long getIdusuariocreacion() {
        return idusuariocreacion;
    }

    public void setIdusuariocreacion(Long idusuariocreacion) {
        this.idusuariocreacion = idusuariocreacion;
    }

    public Long getIdaeropuerto() {
        return idaeropuerto;
    }

    public void setIdaeropuerto(Long idaeropuerto) {
        this.idaeropuerto = idaeropuerto;
    }

    public Long getUsuariomodi() {
        return usuariomodi;
    }

    public void setUsuariomodi(Long usuariomodi) {
        this.usuariomodi = usuariomodi;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getAsientos() {
        return asientos;
    }

    public void setAsientos(int asientos) {
        this.asientos = asientos;
    }
}
