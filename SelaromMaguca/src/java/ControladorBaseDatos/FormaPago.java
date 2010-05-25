/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ControladorBaseDatos;

import java.sql.Time;

/**
 *
 * @author Eliana
 */
public class FormaPago {

    private int id;
    private int numero;
    private Time fechaVencimiento;
    private int codigo;
    private String marca;
    private String foraneaUsuario;
    private Usuario usuario;

    public FormaPago(){

    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the numero
     */
    public int getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     * @return the fechaVencimiento
     */
    public Time getFechaVencimiento() {
        return fechaVencimiento;
    }

    /**
     * @param fechaVencimiento the fechaVencimiento to set
     */
    public void setFechaVencimiento(Time fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    /**
     * @return the codigo
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the foraneaUsuario
     */
    public String getForaneaUsuario() {
        return foraneaUsuario;
    }

    /**
     * @param foraneaUsuario the foraneaUsuario to set
     */
    public void setForaneaUsuario(String foraneaUsuario) {
        this.foraneaUsuario = foraneaUsuario;
    }

    /**
     * @return the usuario
     */
    public Usuario getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

}
