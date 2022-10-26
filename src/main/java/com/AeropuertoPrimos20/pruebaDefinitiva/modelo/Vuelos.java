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

    @Column(name = "idestino", nullable = false)
    private Long idestino;

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
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Calendar fechasalida;

    @Column(name = "fechallegada", nullable = false)
    @Temporal(TemporalType.DATE)
    @JsonFormat(pattern = "yyyy-MM-dd")
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

    public Vuelos() {
    }

    public Vuelos(long idvuelo, Long idaeropuerto, Long idestino, Long idaerolinea, Long idestado, Long idavion, double precioeconomico, double precioejecutivo, Long puertabordaje, Calendar fechasalida, Calendar fechallegada, Calendar fechacreacion, Calendar fechamodicar, Long idusuariocreacion, Long idestadovuelo, Long id_tripu, String horasalida, String horallegada) {
        this.idvuelo = idvuelo;
        this.idaeropuerto = idaeropuerto;
        this.idestino = idestino;
        this.idaerolinea = idaerolinea;
        this.idestado = idestado;
        this.idavion = idavion;
        this.precioeconomico = precioeconomico;
        this.precioejecutivo = precioejecutivo;
        this.puertabordaje = puertabordaje;
        this.fechasalida = fechasalida;
        this.fechallegada = fechallegada;
        this.fechacreacion = fechacreacion;
        this.fechamodicar = fechamodicar;
        this.idusuariocreacion = idusuariocreacion;
        this.idestadovuelo = idestadovuelo;
        this.id_tripu = id_tripu;
        this.horasalida = horasalida;
        this.horallegada = horallegada;
    }

    public long getIdvuelo() {
        return idvuelo;
    }

    public void setIdvuelo(long idvuelo) {
        this.idvuelo = idvuelo;
    }

    public Long getIdaeropuerto() {
        return idaeropuerto;
    }

    public void setIdaeropuerto(Long idaeropuerto) {
        this.idaeropuerto = idaeropuerto;
    }

    public Long getIdestino() {
        return idestino;
    }

    public void setIdestino(Long idestino) {
        this.idestino = idestino;
    }

    public Long getIdaerolinea() {
        return idaerolinea;
    }

    public void setIdaerolinea(Long idaerolinea) {
        this.idaerolinea = idaerolinea;
    }

    public Long getIdestado() {
        return idestado;
    }

    public void setIdestado(Long idestado) {
        this.idestado = idestado;
    }

    public Long getIdavion() {
        return idavion;
    }

    public void setIdavion(Long idavion) {
        this.idavion = idavion;
    }

    public double getPrecioeconomico() {
        return precioeconomico;
    }

    public void setPrecioeconomico(double precioeconomico) {
        this.precioeconomico = precioeconomico;
    }

    public double getPrecioejecutivo() {
        return precioejecutivo;
    }

    public void setPrecioejecutivo(double precioejecutivo) {
        this.precioejecutivo = precioejecutivo;
    }

    public Long getPuertabordaje() {
        return puertabordaje;
    }

    public void setPuertabordaje(Long puertabordaje) {
        this.puertabordaje = puertabordaje;
    }

    public Calendar getFechasalida() {
        return fechasalida;
    }

    public void setFechasalida(Calendar fechasalida) {
        this.fechasalida = fechasalida;
    }

    public Calendar getFechallegada() {
        return fechallegada;
    }

    public void setFechallegada(Calendar fechallegada) {
        this.fechallegada = fechallegada;
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

    public Long getIdestadovuelo() {
        return idestadovuelo;
    }

    public void setIdestadovuelo(Long idestadovuelo) {
        this.idestadovuelo = idestadovuelo;
    }

    public Long getId_tripu() {
        return id_tripu;
    }

    public void setId_tripu(Long id_tripu) {
        this.id_tripu = id_tripu;
    }

    public String getHorasalida() {
        return horasalida;
    }

    public void setHorasalida(String horasalida) {
        this.horasalida = horasalida;
    }

    public String getHorallegada() {
        return horallegada;
    }

    public void setHorallegada(String horallegada) {
        this.horallegada = horallegada;
    }
}

