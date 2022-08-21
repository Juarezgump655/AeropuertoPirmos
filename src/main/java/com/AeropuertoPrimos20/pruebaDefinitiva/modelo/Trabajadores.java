package com.AeropuertoPrimos20.pruebaDefinitiva.modelo;

import javax.persistence.*;

@Entity
@Table(name = "Trabajadores")
public class Trabajadores {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable =false)
    private int documentoIdentificacion;

    @Column(nullable =false)
    private String nombre;

    @Column(nullable =false)
    private int edad;

    @Column(nullable =false)
    private int añosExperencia;

    @Column(nullable =false)
    private String especialidad;

    @Column(nullable =false)
    private String fechaIngreso;

    @Column(nullable =false)
    private String  fechaModificacion ;

    @Column(nullable =false)
    private String  UsuarioIngreso;

    //Se genera un constructor vacio por nomenclantura
    public Trabajadores() {
    }

    public Trabajadores(int documentoIdentificacion, String nombre, int edad, int añosExperencia, String especialidad, String fechaIngreso, String fechaModificacion, String usuarioIngreso) {
        this.documentoIdentificacion = documentoIdentificacion;
        this.nombre = nombre;
        this.edad = edad;
        this.añosExperencia = añosExperencia;
        this.especialidad = especialidad;
        this.fechaIngreso = fechaIngreso;
        this.fechaModificacion = fechaModificacion;
        UsuarioIngreso = usuarioIngreso;
    }

    public int getDocumentoIdentificacion() {
        return documentoIdentificacion;
    }

    public void setDocumentoIdentificacion(int documentoIdentificacion) {
        this.documentoIdentificacion = documentoIdentificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getAñosExperencia() {
        return añosExperencia;
    }

    public void setAñosExperencia(int añosExperencia) {
        this.añosExperencia = añosExperencia;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getFechaModificacion() {
        return fechaModificacion;
    }

    public void setFechaModificacion(String fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
    }

    public String getUsuarioIngreso() {
        return UsuarioIngreso;
    }

    public void setUsuarioIngreso(String usuarioIngreso) {
        UsuarioIngreso = usuarioIngreso;
    }
}
