/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ControladorBaseDatos;

import java.io.File;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 *
 * @author Eliana
 */
public class Producto {

    private int id;
    private String nombre;
    private String descripcion;
    private String imagen;
    private String informacionExtra;
    private List<Inventario> inventarios;
    private List<Categoria> categorias=new List<Categoria>() {

        public int size() {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        public boolean isEmpty() {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        public boolean contains(Object o) {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        public Iterator<Categoria> iterator() {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        public Object[] toArray() {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        public <T> T[] toArray(T[] a) {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        public boolean add(Categoria e) {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        public boolean remove(Object o) {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        public boolean containsAll(Collection<?> c) {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        public boolean addAll(Collection<? extends Categoria> c) {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        public boolean addAll(int index, Collection<? extends Categoria> c) {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        public boolean removeAll(Collection<?> c) {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        public boolean retainAll(Collection<?> c) {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        public void clear() {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        public Categoria get(int index) {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        public Categoria set(int index, Categoria element) {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        public void add(int index, Categoria element) {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        public Categoria remove(int index) {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        public int indexOf(Object o) {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        public int lastIndexOf(Object o) {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        public ListIterator<Categoria> listIterator() {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        public ListIterator<Categoria> listIterator(int index) {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        public List<Categoria> subList(int fromIndex, int toIndex) {
            throw new UnsupportedOperationException("Not supported yet.");
        }
    };

    public Producto(){
        }

    public Producto( String nombre, String categoria, String imagen, String info){
        this.nombre = nombre;
        this.descripcion = categoria;
        this.imagen = imagen;
        this.informacionExtra = info;
    }

    /**
     * @return El id del producto
     */
    public int getId() {
        return id;
    }

    /**
     * @param id del producto a ser insertado
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return El nombre del producto
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre variable nombre del producto
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return la descripcion del producto
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion del producto a setear
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return la imagen del producto nuevo
     */
    public String getImagen() {
        return imagen;
    }

    /**
     * @param imagen variable de la imagen
     */
    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    /**
     * @return La informacionExtra del producto como, temperatura, EBC, etc.
     */
    public String getInformacionExtra() {
        return informacionExtra;
    }

    /**
     * @param informacionExtra variable a ser seteada
     */
    public void setInformacionExtra(String informacionExtra) {
        this.informacionExtra = informacionExtra;
    }

    /**
     * @return La lista de inventarios
     */
    public List<Inventario> getInventarios() {
        return inventarios;
    }

    /**
     * @param inventarios variable donde se inserta el producto nuevo
     */
    public void setInventarios(List<Inventario> inventarios) {
        this.inventarios = inventarios;
    }

    /**
     * @return La lista de categorias a la que pertenece el producto
     */
    public List<Categoria> getCategorias() {
        return categorias;
    }

    /**
     * @param categorias de un producto en particular
     */
    public void setCategorias(List<Categoria> categorias) {
        this.categorias = categorias;
    }
}
