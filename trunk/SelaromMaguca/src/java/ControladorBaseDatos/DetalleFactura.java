/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ControladorBaseDatos;

/**
 *
 * @author Eliana
 */
public class DetalleFactura {

    private int id;
    private int cantidad;
    private double monto;
    private int foraneaInventario;
    private int foraneaDetalle;
    private int foraneaFactura;
    private DetalleOrden detalleOrden;
    private Inventario inventario;

    public DetalleFactura(){

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
     * @return the monto
     */
    public double getMonto() {
        return monto;
    }

    /**
     * @param monto the monto to set
     */
    public void setMonto(double monto) {
        this.monto = monto;
    }

    /**
     * @return the foraneaInventario
     */
    public int getForaneaInventario() {
        return foraneaInventario;
    }

    /**
     * @param foraneaInventario the foraneaInventario to set
     */
    public void setForaneaInventario(int foraneaInventario) {
        this.foraneaInventario = foraneaInventario;
    }

    /**
     * @return the foraneaDetalle
     */
    public int getForaneaDetalle() {
        return foraneaDetalle;
    }

    /**
     * @param foraneaDetalle the foraneaDetalle to set
     */
    public void setForaneaDetalle(int foraneaDetalle) {
        this.foraneaDetalle = foraneaDetalle;
    }

    /**
     * @return the foraneaFactura
     */
    public int getForaneaFactura() {
        return foraneaFactura;
    }

    /**
     * @param foraneaFactura the foraneaFactura to set
     */
    public void setForaneaFactura(int foraneaFactura) {
        this.foraneaFactura = foraneaFactura;
    }

    /**
     * @return the detalleOrden
     */
    public DetalleOrden getDetalleOrden() {
        return detalleOrden;
    }

    /**
     * @param detalleOrden the detalleOrden to set
     */
    public void setDetalleOrden(DetalleOrden detalleOrden) {
        this.detalleOrden = detalleOrden;
    }

    /**
     * @return the inventario
     */
    public Inventario getInventario() {
        return inventario;
    }

    /**
     * @param inventario the inventario to set
     */
    public void setInventario(Inventario inventario) {
        this.inventario = inventario;
    }

}
