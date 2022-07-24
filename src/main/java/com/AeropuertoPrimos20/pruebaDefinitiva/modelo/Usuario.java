package com.AeropuertoPrimos20.pruebaDefinitiva.modelo;

import javax.persistence.*;

@Entity
@Table(name = "usuarios")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable =false)
    private int numeroPasaporte;
    @Column(nullable =false)
    private String nombreCliente;
    @Column(nullable =false)
    private String Fecha, nacionalidad, correo;
    @Column(nullable =false)
    private int codigopais;
    @Column(nullable =false)
    private int numeroTelefono, numeroTelefonoEm;
    @Column(nullable =false)
    private String direccion;

    public Usuario(int numeroPasaporte, String nombreCliente, String fecha, String nacionalidad, String correo, int codigopais, int numeroTelefono, int numeroTelefonoEm, String direccion) {
        this.numeroPasaporte = numeroPasaporte;
        this.nombreCliente = nombreCliente;
        Fecha = fecha;
        this.nacionalidad = nacionalidad;
        this.correo = correo;
        this.codigopais = codigopais;
        this.numeroTelefono = numeroTelefono;
        this.numeroTelefonoEm = numeroTelefonoEm;
        this.direccion = direccion;
    }

    public int getNumeroPasaporte() {
        return numeroPasaporte;
    }

    public void setNumeroPasaporte(int numeroPasaporte) {
        this.numeroPasaporte = numeroPasaporte;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String fecha) {
        Fecha = fecha;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
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

    public int getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(int numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public int getNumeroTelefonoEm() {
        return numeroTelefonoEm;
    }

    public void setNumeroTelefonoEm(int numeroTelefonoEm) {
        this.numeroTelefonoEm = numeroTelefonoEm;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}