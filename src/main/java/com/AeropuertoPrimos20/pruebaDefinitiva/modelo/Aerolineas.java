package com.AeropuertoPrimos20.pruebaDefinitiva.modelo;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Calendar;

@Entity
@Table(name = "aerolineas")
public class Aerolineas implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private long idaerolineas;

    @Column(name= "nombreaerolinea", nullable = false)
    private String nombreaerolinea;

    @Column(name= "correo", nullable = false)
    private String correo;

    @Column(name = "codigopais", nullable = false)
    private int codigopais;

    @Column(name = "numerotelefono", nullable = false)
    private String numerotelefono;

    @Column(name = "idestado", nullable = false)
    private Long idestado;

    @Column(name = "idusuariocreacion", nullable = false)
    private Long idusuariocreacion;

    @Column(name = "idaeropuerto", nullable = false)
    private Long idaeropuerto;

    @Column(name = "vuelos", nullable = false)
    private Long vuelos;

    @Column(name = "aviones", nullable = false)
    private Long aviones;

    @Column(name = "fechacreacion", nullable = false)
    @JsonFormat(pattern = "dd-MM-yyyy")
    @Temporal(TemporalType.DATE)
    private Calendar fechacreacion;

    @Column(name = "fechamodicar", nullable = false)
    @JsonFormat(pattern = "dd-MM-yyyy")
    @Temporal(TemporalType.DATE)
    private Calendar fechamodicar;

    public Aerolineas() {

    }

    public Aerolineas(long idaerolineas, String nombreaerolinea, String correo, int codigopais, String numerotelefono, Long idestado, Long idusuariocreacion, Long idaeropuerto, Long vuelos, Long aviones, Calendar fechacreacion, Calendar fechamodicar) {
        this.idaerolineas = idaerolineas;
        this.nombreaerolinea = nombreaerolinea;
        this.correo = correo;
        this.codigopais = codigopais;
        this.numerotelefono = numerotelefono;
        this.idestado = idestado;
        this.idusuariocreacion = idusuariocreacion;
        this.idaeropuerto = idaeropuerto;
        this.vuelos = vuelos;
        this.aviones = aviones;
        this.fechacreacion = fechacreacion;
        this.fechamodicar = fechamodicar;
    }

    public long getIdaerolineas() {
        return idaerolineas;
    }

    public void setIdaerolineas(long idaerolineas) {
        this.idaerolineas = idaerolineas;
    }

    public String getNombreaerolinea() {
        return nombreaerolinea;
    }

    public void setNombreaerolinea(String nombreaerolinea) {
        this.nombreaerolinea = nombreaerolinea;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getCodigopais() {
        return codigopais;
    }

    public void setCodigopais(int codigopais) {
        this.codigopais = codigopais;
    }

    public String getNumerotelefono() {
        return numerotelefono;
    }

    public void setNumerotelefono(String numerotelefono) {
        this.numerotelefono = numerotelefono;
    }

    public Long getIdestado() {
        return idestado;
    }

    public void setIdestado(Long idestado) {
        this.idestado = idestado;
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

    public Long getVuelos() {
        return vuelos;
    }

    public void setVuelos(Long vuelos) {
        this.vuelos = vuelos;
    }

    public Long getAviones() {
        return aviones;
    }

    public void setAviones(Long aviones) {
        this.aviones = aviones;
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
}
