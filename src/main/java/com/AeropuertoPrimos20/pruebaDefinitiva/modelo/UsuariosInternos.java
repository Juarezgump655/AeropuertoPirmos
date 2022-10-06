package com.AeropuertoPrimos20.pruebaDefinitiva.modelo;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Calendar;
@Entity
@Table(name = "usuariosinternos")
public class UsuariosInternos implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private long idusuariointerno;

    @Column(name = "documentoidentificaion", unique = true, nullable = false)
    private long documentoidentificaion;

    @Column(name = "nombres", nullable = false, length = 75)
    private String nombres;

    @Column(name = "apellidos", nullable = false, length = 75)
    private String apellidos;

    @Column(name = "fechanacimiento", nullable = false)
    @Temporal(TemporalType.DATE)
    @JsonFormat(pattern = "dd-MM-yyyy")
    private Calendar fechanacimiento;

    @Column(name = "nacionalidad", nullable = false, length = 50)
    private String nacionalidad;

    @Column(name = "correo", unique = true, nullable = false, length = 75)
    private String correo;

    @Column(name = "codigopais", nullable = false)
    private int codigopais;

    @Column(name = "numerotelefoono", nullable = false, length = 15)
    private String numerotelefoono;

    @Column(name = "numerotelefoonoem", nullable = false, length = 15)
    private String numerotelefoonoem;

    @Column(name = "direccion", nullable = false, length = 150)
    private String direccion;

    @Column(name = "contrasenia",  nullable = false, length = 75)
    private String contrasenia;

    @Column(name = "id_rol", nullable = false)
    private Long  idroles;

    @Column(name = "idestado", nullable = false)
    private Long idestado;

    @Column(name = "usariocreacion", nullable = false)
    private Long usariocreacion;

    @Column(name = "fechacreacion", updatable = false, nullable = false)
    @Temporal(TemporalType.DATE)
    @JsonFormat(pattern = "dd-MM-yyyy")
    private Calendar fechacreacion;

    @Column(name = "fechamodicar", nullable = false)
    @Temporal(TemporalType.DATE)
    @JsonFormat(pattern = "dd-MM-yyyy")
    private Calendar fechamodicar;


    @Column(name = "idaeropuerto", nullable = false)
    private Long idaeropuerto;

    @Column(name = "idaerolinea", nullable = false)
    private Long idaerolinea;

    @Column(name = "usuariomodi", nullable = false)
    private Long usuariomodi;

    public UsuariosInternos() {

    }

    public UsuariosInternos(long idusuariointerno, long documentoidentificaion, String nombres, String apellidos, Calendar fechanacimiento, String nacionalidad, String correo, int codigopais, String numerotelefoono, String numerotelefoonoem, String direccion, String contrasenia, Long idroles, Long idestado, Long usariocreacion, Calendar fechacreacion, Calendar fechamodicar, Long idaeropuerto, Long idaerolinea, Long usuariomodi) {
        this.idusuariointerno = idusuariointerno;
        this.documentoidentificaion = documentoidentificaion;
        this.nombres = nombres;
        this.apellidos = apellidos;
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
        this.usariocreacion = usariocreacion;
        this.fechacreacion = fechacreacion;
        this.fechamodicar = fechamodicar;
        this.idaeropuerto = idaeropuerto;
        this.idaerolinea = idaerolinea;
        this.usuariomodi = usuariomodi;
    }


    public long getIdusuariointerno() {
        return idusuariointerno;
    }

    public void setIdusuariointerno(long idusuariointerno) {
        this.idusuariointerno = idusuariointerno;
    }

    public long getDocumentoidentificaion() {
        return documentoidentificaion;
    }

    public void setDocumentoidentificaion(long documentoidentificaion) {
        this.documentoidentificaion = documentoidentificaion;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
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

    public Long getUsariocreacion() {
        return usariocreacion;
    }

    public void setUsariocreacion(Long usariocreacion) {
        this.usariocreacion = usariocreacion;
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

    public Long getIdaeropuerto() {
        return idaeropuerto;
    }

    public void setIdaeropuerto(Long idaeropuerto) {
        this.idaeropuerto = idaeropuerto;
    }

    public Long getIdaerolinea() {
        return idaerolinea;
    }

    public void setIdaerolinea(Long idaerolinea) {
        this.idaerolinea = idaerolinea;
    }

    public Long getUsuariomodi() {
        return usuariomodi;
    }

    public void setUsuariomodi(Long usuariomodi) {
        this.usuariomodi = usuariomodi;
    }
}
