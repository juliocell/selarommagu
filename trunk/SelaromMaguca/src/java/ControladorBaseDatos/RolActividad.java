/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ControladorBaseDatos;

/**
 *
 * @author Eliana
 */
public class RolActividad {

    private PairIdComponent id;
    private Rol rol;
    private Actividad actividad;

    public RolActividad(){

    }

    /**
     * @return the id
     */
    public PairIdComponent getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(PairIdComponent id) {
        this.id = id;
    }

    /**
     * @return the rol
     */
    public Rol getRol() {
        return rol;
    }

    /**
     * @param rol the rol to set
     */
    public void setRol(Rol rol) {
        this.rol = rol;
    }

    /**
     * @return the actividad
     */
    public Actividad getActividad() {
        return actividad;
    }

    /**
     * @param actividad the actividad to set
     */
    public void setActividad(Actividad actividad) {
        this.actividad = actividad;
    }



}
