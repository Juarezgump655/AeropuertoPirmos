package com.AeropuertoPrimos20.pruebaDefinitiva.modelo;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.util.Calendar;
@Entity
@Table(name = "boletos")
public class Boleto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private long idboletos;

    @Column(name = "idvuelo", nullable = false)
    private Long idvuelo;

    @Column(name = "idusuario", nullable = false)
    private Long idusuario;

    @Column(name = "fechacreacion", updatable = false, nullable = false)
    @Temporal(TemporalType.DATE)
    @JsonFormat(pattern = "dd-MM-yyyy")
    private Calendar fechacreacion;

    @Column(name = "fechamodicar", nullable = false)
    @Temporal(TemporalType.DATE)
    @JsonFormat(pattern = "dd-MM-yyyy")
    private Calendar fechamodicar;

    @Column(name = "usuariocreacion", nullable = false)
    private Long usuariocreacion;

    @Column(name = "nomaletas", nullable = false)
    private Integer nomaletas;

    @Column(name = "idestadoboleto", nullable = false)
    private Long idestadoboleto;

    @Column(name = "precio", nullable = false)
    private double precio;


    @Column(name = "cantidad", nullable = false)
    private Integer cantidad;


    public Boleto() {
    }

    public Boleto(long idboletos, Long idvuelo, Long idusuario, Calendar fechacreacion, Calendar fechamodicar, Long usuariocreacion, Integer nomaletas, Long idestadoboleto, double precio, Integer cantidad) {
        this.idboletos = idboletos;
        this.idvuelo = idvuelo;
        this.idusuario = idusuario;
        this.fechacreacion = fechacreacion;
        this.fechamodicar = fechamodicar;
        this.usuariocreacion = usuariocreacion;
        this.nomaletas = nomaletas;
        this.idestadoboleto = idestadoboleto;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public long getIdboletos() {
        return idboletos;
    }

    public void setIdboletos(long idboletos) {
        this.idboletos = idboletos;
    }

    public Long getIdvuelo() {
        return idvuelo;
    }

    public void setIdvuelo(Long idvuelo) {
        this.idvuelo = idvuelo;
    }

    public Long getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(Long idusuario) {
        this.idusuario = idusuario;
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

    public Long getUsuariocreacion() {
        return usuariocreacion;
    }

    public void setUsuariocreacion(Long usuariocreacion) {
        this.usuariocreacion = usuariocreacion;
    }

    public Integer getNomaletas() {
        return nomaletas;
    }

    public void setNomaletas(Integer nomaletas) {
        this.nomaletas = nomaletas;
    }

    public Long getIdestadoboleto() {
        return idestadoboleto;
    }

    public void setIdestadoboleto(Long idestadoboleto) {
        this.idestadoboleto = idestadoboleto;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }
}
