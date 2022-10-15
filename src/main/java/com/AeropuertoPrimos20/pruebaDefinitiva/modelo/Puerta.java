package com.AeropuertoPrimos20.pruebaDefinitiva.modelo;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Calendar;

@Entity
@Table(name = "puerta")
public class Puerta  implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private long id_puerta;

    @Column(name= "puertanu", nullable = false)
    private int puertanu;

    @Column(name= "id_aeropuerto", nullable = false)
    private Long id_aeropuerto;


    @Column(name= "id_estado", nullable = false)
    private Long id_estado;

    @Column(name = "fechacreacion", nullable = false)
    @JsonFormat(pattern = "dd-MM-yyyy")
    @Temporal(TemporalType.DATE)
    private Calendar fechacreacion;

    @Column(name = "fechamodicar", nullable = false)
    @JsonFormat(pattern = "dd-MM-yyyy")
    @Temporal(TemporalType.DATE)
    private Calendar fechamodicar;

    public Puerta() {
    }

    public Puerta(long id_puerta, int puertanu, Long id_aeropuerto, Long id_estado, Calendar fechacreacion, Calendar fechamodicar) {
        this.id_puerta = id_puerta;
        this.puertanu = puertanu;
        this.id_aeropuerto = id_aeropuerto;
        this.id_estado = id_estado;
        this.fechacreacion = fechacreacion;
        this.fechamodicar = fechamodicar;
    }

    public long getId_puerta() {
        return id_puerta;
    }

    public void setId_puerta(long id_puerta) {
        this.id_puerta = id_puerta;
    }

    public int getPuertanu() {
        return puertanu;
    }

    public void setPuertanu(int puertanu) {
        this.puertanu = puertanu;
    }

    public Long getId_aeropuerto() {
        return id_aeropuerto;
    }

    public void setId_aeropuerto(Long id_aeropuerto) {
        this.id_aeropuerto = id_aeropuerto;
    }

    public Long getId_estado() {
        return id_estado;
    }

    public void setId_estado(Long id_estado) {
        this.id_estado = id_estado;
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

