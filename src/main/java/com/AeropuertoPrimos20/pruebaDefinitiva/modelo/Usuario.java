package com.AeropuertoPrimos20.pruebaDefinitiva.modelo;

import javax.persistence.*;

@Entity
@Table(name = "usuarios")
public class Usuario {
    @Id
    @Column(unique = true, nullable =false)
    private  long numeroPasaporte;
    @Column(nullable =false)
    private String nombreCliente;

    @Column(name ="fecha" , nullable =false)
    private String fecha;

    @Column(name ="Nacionalidad",nullable =false )
    private String nacionalidad;
    @Column(name ="Correo",nullable =false )
    private String correo;

    @Column(nullable =false)
    private int codigopais;
    @Column(nullable =false)
    private int numeroTelefono, numeroTelefonoEm;
    @Column(nullable =false)
    private String direccion;

    @Column(name ="Contraseña",nullable =false)
    private String contrasenia;



    //Se genera un constructor vacio por nomenclantura
    public Usuario() {
    }

    public Usuario(long numeroPasaporte, String nombreCliente, String fecha, String nacionalidad, String correo, int codigopais, int numeroTelefono, int numeroTelefonoEm, String direccion, String contrasenia) {
        this.numeroPasaporte = numeroPasaporte;
        this.nombreCliente = nombreCliente;
        this.fecha = fecha;
        this.nacionalidad = nacionalidad;
        this.correo = correo;
        this.codigopais = codigopais;
        this.numeroTelefono = numeroTelefono;
        this.numeroTelefonoEm = numeroTelefonoEm;
        this.direccion = direccion;
        this.contrasenia = contrasenia;
    }

    public long getNumeroPasaporte() {
        return numeroPasaporte;
    }

    public void setNumeroPasaporte(long numeroPasaporte) {
        this.numeroPasaporte = numeroPasaporte;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
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

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }
}