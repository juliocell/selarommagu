/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ControladorBaseDatos;

/**
 *
 * @author Eliana
 */
public class ProductoCategoria {

    private PairIdComponent id;
    private Producto producto;
    private Categoria categoria;

    public ProductoCategoria(){

    }

    /**
     * @return the id de la categoria del producto
     */
    public PairIdComponent getId() {
        return id;
    }

    /**
     * @param id del Producto de la Categoria
     */
    public void setId(PairIdComponent id) {
        this.id = id;
    }

    /**
     * @return El producto
     */
    public Producto getProducto() {
        return producto;
    }

    /**
     * @param producto que va a ser insertado
     */
    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    /**
     * @return the categoria a la cual pertenece el producto
     */
    public Categoria getCategoria() {
        return categoria;
    }

    /**
     * @param categoria que recibe como parametro
     */
    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }


}
