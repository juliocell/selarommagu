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
public class Ordendecompra {

    private int id;
    private Time fecha;
    private String informacionAdicional;
    private FormaPago formaPago;
    private Usuario usuario;
    private List<HistorialOrden> historialOrden;
    private Factura factura;
    private List<DetalleOrden> detalleOrden;

    /**
     * @return el identificador de la Orden de Compra
     */
    public int getId() {
        return id;
    }

    /**
     * @param id el identificador de la Orden de Compra
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return La fecha de la Orden de Compra
     */
    public Time getFecha() {
        return fecha;
    }

    /**
     * @param fecha la fecha de la Orden de Compra
     */
    public void setFecha(Time fecha) {
        this.fecha = fecha;
    }

    /**
     * @return La informacionAdicional de la Orden de Compra 
     */
    public String getInformacionAdicional() {
        return informacionAdicional;
    }

    /**
     * @param informacionAdicional de la Orden de Compra
     */
    public void setInformacionAdicional(String informacionAdicional) {
        this.informacionAdicional = informacionAdicional;
    }

    /**
     * @return La formaPago para cancelar la Orden de Compra
     */
    public FormaPago getFormaPago() {
        return formaPago;
    }

    /**
     * @param formaPago de la Orden de Compra
     */
    public void setFormaPago(FormaPago formaPago) {
        this.formaPago = formaPago;
    }

    /**
     * @return El usuario al cual se le hace la Orden de Compra
     */
    public Usuario getUsuario() {
        return usuario;
    }

    /**
     * @param usuario de la Orden de Compra
     */
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    /**
     * @return El historialOrden de la Orden de Compra
     */
    public List<HistorialOrden> getHistorialOrden() {
        return historialOrden;
    }

    /**
     * @param historialOrden de la Orden de Compra
     */
    public void setHistorialOrden(List<HistorialOrden> historialOrden) {
        this.historialOrden = historialOrden;
    }

    /**
     * @return La factura de la Orden de Compra
     */
    public Factura getFactura() {
        return factura;
    }

    /**
     * @param factura de la Orden de Compra
     */
    public void setFactura(Factura factura) {
        this.factura = factura;
    }

    /**
     * @return Lista detalleOrden de la Orden de Compra
     */
    public List<DetalleOrden> getDetalleOrden() {
        return detalleOrden;
    }

    /**
     * @param detalleOrden de la Orden de Compra
     */
    public void setDetalleOrden(List<DetalleOrden> detalleOrden) {
        this.detalleOrden = detalleOrden;
    }


}
