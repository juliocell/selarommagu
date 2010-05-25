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
public class Proveedor {

    private String id;
    private String nombre;
    private String direccion;
    private Time fechaRegistro;
    private String email;
    private String pagina;
    private List<Inventario> inventarios;

    /**
     * @return id id del proveedor
     */
    public String getId() {
        return id;
    }

    /**
     * @param id a ser seteado como identificador del proveedor.
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return Devuelve el nombre del proveedor
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre que va ser seteado por un nuevo proveedor
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return la direccion del proveedor
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion valor de la direccion del proveedor
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * @return the fechaRegistro del proveedor
     */
    public Time getFechaRegistro() {
        return fechaRegistro;
    }

    /**
     * @param fechaRegistro es la fecha de registro del proveedor
     */
    public void setFechaRegistro(Time fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    /**
     * @return el email del proveedor
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email que pertenece a un proveedor
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return la pagina donde esta el proveedor
     */
    public String getPagina() {
        return pagina;
    }

    /**
     * @param pagina donde se encntra el proveedor URL
     */
    public void setPagina(String pagina) {
        this.pagina = pagina;
    }

    /**
     * @return invenatrios la lista de inventarios que poseea el proveedor.
     */
    public List<Inventario> getInventarios() {
        return inventarios;
    }

    /**
     * @param inventarios setea el valor de los inventarios.
     */
    public void setInventarios(List<Inventario> inventarios) {
        this.inventarios = inventarios;
    }

}
