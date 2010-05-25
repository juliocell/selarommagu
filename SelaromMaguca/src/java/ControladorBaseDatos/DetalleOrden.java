/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ControladorBaseDatos;

/**
 *
 * @author Eliana
 */
public class DetalleOrden {

    private int id;
    private int cantidad;
    private Producto producto;

    public DetalleOrden(){

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
     * @return the cantidad
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * @param cantidad the cantidad to set
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * @return the producto
     */
    public Producto getProducto() {
        return producto;
    }

    /**
     * @param producto the producto to set
     */
    public void setProducto(Producto producto) {
        this.producto = producto;
    }

}
