/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ControladorBaseDatos;

/**
 *
 * @author Eliana
 */
public class Inventario {

    private int id;
    private Proveedor proveedor;
    private Producto  producto;
    private double precio;
    private int cantidadMinima;
    private int cantidadExistente;

    /**
     * @return El id del inventario
     */
    public int getId() {
        return id;
    }

    /**
     * @param id El id del inventario a setear
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return El proveedor para el inventario
     */
    public Proveedor getProveedor() {
        return proveedor;
    }

    /**
     * @param proveedor a quien le asigne el inventario
     */
    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    /**
     * @return El producto del inventario
     */
    public Producto getProducto() {
        return producto;
    }

    /**
     * @param producto del inventario
     */
    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    /**
     * @return El precio del producto inventario
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * @param precio del producto inventario
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * @return La cantidadMinima del inventario
     */
    public int getCantidadMinima() {
        return cantidadMinima;
    }

    /**
     * @param cantidadMinima del inventario
     */
    public void setCantidadMinima(int cantidadMinima) {
        this.cantidadMinima = cantidadMinima;
    }

    /**
     * @return La cantidadExistente en el inventario
     */
    public int getCantidadExistente() {
        return cantidadExistente;
    }

    /**
     * @param cantidadExistente en el inventario
     */
    public void setCantidadExistente(int cantidadExistente) {
        this.cantidadExistente = cantidadExistente;
    }

}
