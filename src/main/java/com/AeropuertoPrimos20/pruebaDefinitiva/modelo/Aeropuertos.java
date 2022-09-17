package com.AeropuertoPrimos20.pruebaDefinitiva.modelo;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Calendar;

@Entity
@Table(name = "aeropuertos")
public class Aeropuertos implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private long idaeropuerto;

    @Column(name= "nombreaeropuerto", nullable = false)
    private String nombreaeropuerto;

    @Column(name= "nopuertas", nullable = false)
    private int nopuertas;

    @Column(name = "direccion", nullable = false)
    private String direccion;

    @Column(name = "pais", nullable = false)
    private String pais;

    @Column(name = "notelefono", nullable = false)
    private String notelefono;

    @Column(name = "idestado", nullable = false)
    private Long idestado;

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

    public Aeropuertos() {
    }

    public Aeropuertos(long idaeropuerto, String nombreaeropuerto, int nopuertas, String direccion, String pais, String notelefono, Long idestado, Calendar fechacreacion, Calendar fechamodicar, Long idusuariocreacion) {
        this.idaeropuerto = idaeropuerto;
        this.nombreaeropuerto = nombreaeropuerto;
        this.nopuertas = nopuertas;
        this.direccion = direccion;
        this.pais = pais;
        this.notelefono = notelefono;
        this.idestado = idestado;
        this.fechacreacion = fechacreacion;
        this.fechamodicar = fechamodicar;
        this.idusuariocreacion = idusuariocreacion;
    }

    public long getIdaeropuerto() {
        return idaeropuerto;
    }

    public void setIdaeropuerto(long idaeropuerto) {
        this.idaeropuerto = idaeropuerto;
    }

    public String getNombreaeropuerto() {
        return nombreaeropuerto;
    }

    public void setNombreaeropuerto(String nombreaeropuerto) {
        this.nombreaeropuerto = nombreaeropuerto;
    }

    public int getNopuertas() {
        return nopuertas;
    }

    public void setNopuertas(int nopuertas) {
        this.nopuertas = nopuertas;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getNotelefono() {
        return notelefono;
    }

    public void setNotelefono(String notelefono) {
        this.notelefono = notelefono;
    }

    public Long getIdestado() {
        return idestado;
    }

    public void setIdestado(Long idestado) {
        this.idestado = idestado;
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
}
