/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ControladorBaseDatos;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 *
 * @author Eliana
 */
public class Categoria {

    private int id;
    private String nombre;
    private String descripcion;
    private List<Producto> producto = new List<Producto>() {

        public int size() {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        public boolean isEmpty() {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        public boolean contains(Object o) {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        public Iterator<Producto> iterator() {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        public Object[] toArray() {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        public <T> T[] toArray(T[] a) {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        public boolean add(Producto e) {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        public boolean remove(Object o) {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        public boolean containsAll(Collection<?> c) {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        public boolean addAll(Collection<? extends Producto> c) {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        public boolean addAll(int index, Collection<? extends Producto> c) {
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

        public Producto get(int index) {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        public Producto set(int index, Producto element) {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        public void add(int index, Producto element) {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        public Producto remove(int index) {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        public int indexOf(Object o) {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        public int lastIndexOf(Object o) {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        public ListIterator<Producto> listIterator() {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        public ListIterator<Producto> listIterator(int index) {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        public List<Producto> subList(int fromIndex, int toIndex) {
            throw new UnsupportedOperationException("Not supported yet.");
        }
    };
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
    private Categoria categoriaSuperior;

    public Categoria()
    {
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
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return the producto
     */
    public List<Producto> getProducto() {
        return producto;
    }

    /**
     * @param producto the producto to set
     */
    public void setProducto(List<Producto> producto) {
        this.producto = producto;
    }

    /**
     * @return the categorias
     */
    public List<Categoria> getCategorias() {
        return categorias;
    }

    /**
     * @param categorias the categorias to set
     */
    public void setCategorias(List<Categoria> categorias) {
        this.categorias = categorias;
    }

    /**
     * @return the categoriaSuperior
     */
    public Categoria getCategoriaSuperior() {
        return categoriaSuperior;
    }

    /**
     * @param categoriaSuperior the categoriaSuperior to set
     */
    public void setCategoriaSuperior(Categoria categoriaSuperior) {
        this.categoriaSuperior = categoriaSuperior;
    }

}
