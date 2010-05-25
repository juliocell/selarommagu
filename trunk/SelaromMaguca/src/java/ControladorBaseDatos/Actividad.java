/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ControladorBaseDatos;

/**
 *
 * @author Eliana
 */
public class Actividad {

    private int id;

    private String accion;

    private String descripcion;

    private String tabla;

//    private IList<Rol> rol;

    public Actividad()
        {

        }

    /**
     * @return Este método permite obtener el valor del ID que
     * pertenece a un usuario.
     */
    public int getId() {
        return id;
    }

    /**
     * @param Recive el parametro ID del usuario para el cual se va insertar
     * en la base de datos.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return Devuelve el valor de la accion relizada por un
     * usuario del sistema.
     */
    public String getAccion() {
        return accion;
    }

    /**
     * @param Setea la accion realizada por un usuario.
     */
    public void setAccion(String accion) {
        this.accion = accion;
    }

    /**
     * @return Devuelve la descripcion como descripcion.
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param Valor descripcion a ser seteado.
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return Retorna el nombre de la tabla en la cual se van a hacer los cambios.
     */
    public String getTabla() {
        return tabla;
    }

    /**
     * @param tabla the tabla to set
     */
    public void setTabla(String tabla) {
        this.tabla = tabla;
    }



}
