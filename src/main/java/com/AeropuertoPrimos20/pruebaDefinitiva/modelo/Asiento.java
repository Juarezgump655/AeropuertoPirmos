package com.AeropuertoPrimos20.pruebaDefinitiva.modelo;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Calendar;


@Entity
@Table(name = "asiento")
public class Asiento implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private long id_asiento;


    @Column(name= "asiento", nullable = false)
    private int asiento;

    @Column(name= "id_avion", nullable = false)
    private Long id_avion;


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


    public Asiento() {
    }

    public Asiento(long id_asiento, int asiento, Long id_avion, Long id_estado, Calendar fechacreacion, Calendar fechamodicar) {
        this.id_asiento = id_asiento;
        this.asiento = asiento;
        this.id_avion = id_avion;
        this.id_estado = id_estado;
        this.fechacreacion = fechacreacion;
        this.fechamodicar = fechamodicar;
    }

    public long getId_asiento() {
        return id_asiento;
    }

    public void setId_asiento(long id_asiento) {
        this.id_asiento = id_asiento;
    }

    public int getAsiento() {
        return asiento;
    }

    public void setAsiento(int asiento) {
        this.asiento = asiento;
    }

    public Long getId_avion() {
        return id_avion;
    }

    public void setId_avion(Long id_avion) {
        this.id_avion = id_avion;
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
