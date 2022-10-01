package com.AeropuertoPrimos20.pruebaDefinitiva.modelo;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Calendar;

@Entity
@Table(name ="tripulacion")
public class Tripulacion implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private long idtripulacion;

    @Column(name = "idaeropuerto", unique = true, nullable = false)
    private long idaeropuerto;

    @Column(name = "idpiloto", unique = true, nullable = false)
    private long idpiloto;

    @Column(name = "idcopiloto", unique = true, nullable = false)
    private long idcopiloto;

    @Column(name = "idingeniero", unique = true, nullable = false)
    private long idingeniero;

    @Column(name = "idtripulantes1", unique = true, nullable = false)
    private long idtripulantes1;

    @Column(name = "idtripulantes2", unique = true, nullable = false)
    private long idtripulantes2;

    @Column(name = "idtripulantes3", unique = true, nullable = false)
    private long idtripulantes3;

    @Column(name = "idaerolinea", unique = true, nullable = false)
    private long idaerolinea;

    @Column(name = "idestado", unique = true, nullable = false)
    private long idestado;

    @Column(name = "idavion", unique = true, nullable = false)
    private long idavion;

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

    public Tripulacion(long idtripulacion, long idaeropuerto, long idpiloto, long idcopiloto, long idingeniero, long idtripulantes1, long idtripulantes2, long idtripulantes3, long idaerolinea, long idestado, long idavion, Calendar fechacreacion, Calendar fechamodicar, Long idusuariocreacion) {
        this.idtripulacion = idtripulacion;
        this.idaeropuerto = idaeropuerto;
        this.idpiloto = idpiloto;
        this.idcopiloto = idcopiloto;
        this.idingeniero = idingeniero;
        this.idtripulantes1 = idtripulantes1;
        this.idtripulantes2 = idtripulantes2;
        this.idtripulantes3 = idtripulantes3;
        this.idaerolinea = idaerolinea;
        this.idestado = idestado;
        this.idavion = idavion;
        this.fechacreacion = fechacreacion;
        this.fechamodicar = fechamodicar;
        this.idusuariocreacion = idusuariocreacion;
    }

    public long getIdtripulacion() {
        return idtripulacion;
    }

    public void setIdtripulacion(long idtripulacion) {
        this.idtripulacion = idtripulacion;
    }

    public long getIdaeropuerto() {
        return idaeropuerto;
    }

    public void setIdaeropuerto(long idaeropuerto) {
        this.idaeropuerto = idaeropuerto;
    }

    public long getIdpiloto() {
        return idpiloto;
    }

    public void setIdpiloto(long idpiloto) {
        this.idpiloto = idpiloto;
    }

    public long getIdcopiloto() {
        return idcopiloto;
    }

    public void setIdcopiloto(long idcopiloto) {
        this.idcopiloto = idcopiloto;
    }

    public long getIdingeniero() {
        return idingeniero;
    }

    public void setIdingeniero(long idingeniero) {
        this.idingeniero = idingeniero;
    }

    public long getIdtripulantes1() {
        return idtripulantes1;
    }

    public void setIdtripulantes1(long idtripulantes1) {
        this.idtripulantes1 = idtripulantes1;
    }

    public long getIdtripulantes2() {
        return idtripulantes2;
    }

    public void setIdtripulantes2(long idtripulantes2) {
        this.idtripulantes2 = idtripulantes2;
    }

    public long getIdtripulantes3() {
        return idtripulantes3;
    }

    public void setIdtripulantes3(long idtripulantes3) {
        this.idtripulantes3 = idtripulantes3;
    }

    public long getIdaerolinea() {
        return idaerolinea;
    }

    public void setIdaerolinea(long idaerolinea) {
        this.idaerolinea = idaerolinea;
    }

    public long getIdestado() {
        return idestado;
    }

    public void setIdestado(long idestado) {
        this.idestado = idestado;
    }

    public long getIdavion() {
        return idavion;
    }

    public void setIdavion(long idavion) {
        this.idavion = idavion;
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
