/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ControladorBaseDatos;

import java.sql.Time;
import java.util.List;

/**
 *
 * @author Eliana
 */
public class Usuario {

    private String id;
    private String nombre;
    private String apellido;
    private String email;
    private Time fechaRegistro;
    private String tipo;
    private String direccion;
    private Rol foraneaRol;
    private List<FormaPago> formasPago;
    private List<Ordendecompra> ordenesCompra;

        public Usuario(){

        }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the fechaRegistro
     */
    public Time getFechaRegistro() {
        return fechaRegistro;
    }

    /**
     * @param fechaRegistro the fechaRegistro to set
     */
    public void setFechaRegistro(Time fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * @return the foraneaRol
     */
    public Rol getForaneaRol() {
        return foraneaRol;
    }

    /**
     * @param foraneaRol the foraneaRol to set
     */
    public void setForaneaRol(Rol foraneaRol) {
        this.foraneaRol = foraneaRol;
    }

    /**
     * @return the formasPago
     */
    public List<FormaPago> getFormasPago() {
        return formasPago;
    }

    /**
     * @param formasPago the formasPago to set
     */
    public void setFormasPago(List<FormaPago> formasPago) {
        this.formasPago = formasPago;
    }

    /**
     * @return the ordenesCompra
     */
    public List<Ordendecompra> getOrdenesCompra() {
        return ordenesCompra;
    }

    /**
     * @param ordenesCompra the ordenesCompra to set
     */
    public void setOrdenesCompra(List<Ordendecompra> ordenesCompra) {
        this.ordenesCompra = ordenesCompra;
    }

}
