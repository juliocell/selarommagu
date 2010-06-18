/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package controlador;

import datos.Empleado;
import hibernate.excepciones.ErrorFormatoFechaException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.EmpleadoNegocio;

/**
 *
 * @author william
 */
public class EmpleadoControlador {
private String empleadosNombre;
private String empleadosApellido;
private String empleadosCI;
private String empleadosDir;
private String empleadosTlfCasa;
private String empleadosTlfMovil;
private String empleadosContrasena;
private String empleadosFechaIng;
private String empleadosSueldoBase;
private String empleadosLogin;
private String empleadosCorreo;
private String nombreCargo;
private List<Empleado> listaEmpleados;

    public String getNombreCargo() {
        return nombreCargo;
    }

    public void setNombreCargo(String nombreCargo) {
        this.nombreCargo = nombreCargo;
    }


     public String agregarEmpleado() {
        EmpleadoNegocio insertarEmpleado = new EmpleadoNegocio();
    String verificacion = null;
        try {
            verificacion = insertarEmpleado.agregarEmpleado(empleadosNombre, empleadosApellido, empleadosCI, empleadosDir, empleadosTlfCasa, empleadosTlfMovil, empleadosContrasena, empleadosFechaIng, empleadosSueldoBase, empleadosLogin, empleadosCorreo, nombreCargo);
        } catch (ErrorFormatoFechaException ex) {
            Logger.getLogger(EmpleadoControlador.class.getName()).log(Level.SEVERE, null, ex);
        }
    return verificacion;
    }

    /**
     * @return the empleadosNombre
     */
    public String getEmpleadosNombre() {
        return empleadosNombre;
    }

    /**
     * @param empleadosNombre the empleadosNombre to set
     */
    public void setEmpleadosNombre(String empleadosNombre) {
        this.empleadosNombre = empleadosNombre;
    }

    /**
     * @return the empleadosApellido
     */
    public String getEmpleadosApellido() {
        return empleadosApellido;
    }

    /**
     * @param empleadosApellido the empleadosApellido to set
     */
    public void setEmpleadosApellido(String empleadosApellido) {
        this.empleadosApellido = empleadosApellido;
    }

    /**
     * @return the empleadosCI
     */
    public String getEmpleadosCI() {
        return empleadosCI;
    }

    /**
     * @param empleadosCI the empleadosCI to set
     */
    public void setEmpleadosCI(String empleadosCI) {
        this.empleadosCI = empleadosCI;
    }

    /**
     * @return the empleadosDir
     */
    public String getEmpleadosDir() {
        return empleadosDir;
    }

    /**
     * @param empleadosDir the empleadosDir to set
     */
    public void setEmpleadosDir(String empleadosDir) {
        this.empleadosDir = empleadosDir;
    }

    /**
     * @return the empleadosTlfCasa
     */
    public String getEmpleadosTlfCasa() {
        return empleadosTlfCasa;
    }

    /**
     * @param empleadosTlfCasa the empleadosTlfCasa to set
     */
    public void setEmpleadosTlfCasa(String empleadosTlfCasa) {
        this.empleadosTlfCasa = empleadosTlfCasa;
    }

    /**
     * @return the empleadosTlfMovil
     */
    public String getEmpleadosTlfMovil() {
        return empleadosTlfMovil;
    }

    /**
     * @param empleadosTlfMovil the empleadosTlfMovil to set
     */
    public void setEmpleadosTlfMovil(String empleadosTlfMovil) {
        this.empleadosTlfMovil = empleadosTlfMovil;
    }

    /**
     * @return the empleadosContrasena
     */
    public String getEmpleadosContrasena() {
        return empleadosContrasena;
    }

    /**
     * @param empleadosContrasena the empleadosContrasena to set
     */
    public void setEmpleadosContrasena(String empleadosContrasena) {
        this.empleadosContrasena = empleadosContrasena;
    }

    /**
     * @return the empleadosFechaIng
     */
    public String getEmpleadosFechaIng() {
        return empleadosFechaIng;
    }

    /**
     * @param empleadosFechaIng the empleadosFechaIng to set
     */
    public void setEmpleadosFechaIng(String empleadosFechaIng) {
        this.empleadosFechaIng = empleadosFechaIng;
    }

    /**
     * @return the empleadosSueldoBase
     */
    public String getEmpleadosSueldoBase() {
        return empleadosSueldoBase;
    }

    /**
     * @param empleadosSueldoBase the empleadosSueldoBase to set
     */
    public void setEmpleadosSueldoBase(String empleadosSueldoBase) {
        this.empleadosSueldoBase = empleadosSueldoBase;
    }

    /**
     * @return the empleadosLogin
     */
    public String getEmpleadosLogin() {
        return empleadosLogin;
    }

    /**
     * @param empleadosLogin the empleadosLogin to set
     */
    public void setEmpleadosLogin(String empleadosLogin) {
        this.empleadosLogin = empleadosLogin;
    }

    /**
     * @return the empleadosCorreo
     */
    public String getEmpleadosCorreo() {
        return empleadosCorreo;
    }

    /**
     * @param empleadosCorreo the empleadosCorreo to set
     */
    public void setEmpleadosCorreo(String empleadosCorreo) {
        this.empleadosCorreo = empleadosCorreo;
    }

    /**
     * @return the listaEmpleados
     */
    public List<Empleado> getListaEmpleados() {
        EmpleadoNegocio pedirListaEmpleados = new EmpleadoNegocio();
        listaEmpleados = pedirListaEmpleados.mostrarEmpleados();
        return listaEmpleados;
    }

    /**
     * @param listaEmpleados the listaEmpleados to set
     */
    public void setListaEmpleados(List<Empleado> listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
    }

    /**
     * @return the idCargo
     */




}
