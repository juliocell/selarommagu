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
public class Factura {

    private int id;
    private Time fecha;
    private double monto;
    private Ordendecompra ordenCompra;
    private List<DetalleFactura> detalleFactura;

    public Factura(){

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
     * @return the fecha
     */
    public Time getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(Time fecha) {
        this.fecha = fecha;
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
     * @return the ordenCompra
     */
    public Ordendecompra getOrdenCompra() {
        return ordenCompra;
    }

    /**
     * @param ordenCompra the ordenCompra to set
     */
    public void setOrdenCompra(Ordendecompra ordenCompra) {
        this.ordenCompra = ordenCompra;
    }

    /**
     * @return the detalleFactura
     */
    public List<DetalleFactura> getDetalleFactura() {
        return detalleFactura;
    }

    /**
     * @param detalleFactura the detalleFactura to set
     */
    public void setDetalleFactura(List<DetalleFactura> detalleFactura) {
        this.detalleFactura = detalleFactura;
    }

}
