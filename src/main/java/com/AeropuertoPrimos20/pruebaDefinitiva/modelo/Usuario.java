package com.AeropuertoPrimos20.pruebaDefinitiva.modelo;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Calendar;

@Entity
@Table(name = "usuarios")
public class Usuario implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long idusuario;

    @Column(name= "numeropasaporte",unique = true, nullable = false)
    private Long numeroPasaporte;

    @Column(name= "nombrecliente", nullable = false)
    private String nombreCliente;

    @Column(name= "apellidocliente", nullable = false)
    private String apellidocliente;

    @Column(name = "fechanacimiento", nullable = false)
    @JsonFormat(pattern = "dd-MM-yyyy")
    @Temporal(TemporalType.DATE)
    private Calendar fechanacimiento;

    @Column(name= "nacionalidad", nullable = false)
    private String nacionalidad;
    @Column(name= "correo",unique = true, nullable = false)
    private String correo;

    @Column(name ="codigopais", nullable =false)
    private int codigopais;


    @Column(name ="numerotelefoono", nullable =false)
    private String numerotelefoono;

    @Column(name ="numerotelefoonoem", nullable =false)
    private String numerotelefoonoem;

    @Column(name= "direccion", nullable = false)
    private String direccion;

    @Column(name= "contrasenia", nullable = false)
    private String contrasenia;

    @Column(name= "idroles", nullable = false )
    private Long idroles;

    @Column(name= "idestado", nullable = false)
    private Long idestado;

    @Column(name= "idusuariocreacion", nullable = false)
    private Long idusuariocreacion;

    @Column(name = "fechacreacion", updatable = false, nullable = false)
    @JsonFormat(pattern = "dd-MM-yyyy")
    @Temporal(TemporalType.DATE)
    private Calendar fechacreacion;

    @Column(name = "fechamodicar", nullable = false)
    @JsonFormat(pattern = "dd-MM-yyyy")
    @Temporal(TemporalType.DATE)
    private Calendar fechamodicar;

    public Usuario() {
    }

    public Usuario(Long idusuario, Long numeroPasaporte, String nombreCliente, String apellidocliente, Calendar fechanacimiento, String nacionalidad, String correo, int codigopais,  String numerotelefoono, String numerotelefoonoem, String direccion, String contrasenia, Long idroles, Long idestado, Long idusuariocreacion, Calendar fechacreacion, Calendar fechamodicar) {
        this.idusuario = idusuario;
        this.numeroPasaporte = numeroPasaporte;
        this.nombreCliente = nombreCliente;
        this.apellidocliente = apellidocliente;
        this.fechanacimiento = fechanacimiento;
        this.nacionalidad = nacionalidad;
        this.correo = correo;
        this.codigopais = codigopais;
        this.numerotelefoono = numerotelefoono;
        this.numerotelefoonoem = numerotelefoonoem;
        this.direccion = direccion;
        this.contrasenia = contrasenia;
        this.idroles = idroles;
        this.idestado = idestado;
        this.idusuariocreacion = idusuariocreacion;
        this.fechacreacion = fechacreacion;
        this.fechamodicar = fechamodicar;
    }

    public Long getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(Long idusuario) {
        this.idusuario = idusuario;
    }

    public Long getNumeroPasaporte() {
        return numeroPasaporte;
    }

    public void setNumeroPasaporte(Long numeroPasaporte) {
        this.numeroPasaporte = numeroPasaporte;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getApellidocliente() {
        return apellidocliente;
    }

    public void setApellidocliente(String apellidocliente) {
        this.apellidocliente = apellidocliente;
    }

    public Calendar getFechanacimiento() {
        return fechanacimiento;
    }

    public void setFechanacimiento(Calendar fechanacimiento) {
        this.fechanacimiento = fechanacimiento;
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

    public String getNumerotelefoono() {
        return numerotelefoono;
    }

    public void setNumerotelefoono(String numerotelefoono) {
        this.numerotelefoono = numerotelefoono;
    }

    public String getNumerotelefoonoem() {
        return numerotelefoonoem;
    }

    public void setNumerotelefoonoem(String numerotelefoonoem) {
        this.numerotelefoonoem = numerotelefoonoem;
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

    public Long getIdroles() {
        return idroles;
    }

    public void setIdroles(Long idroles) {
        this.idroles = idroles;
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
