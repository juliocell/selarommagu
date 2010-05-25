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
public class Rol {

    private int id;
    private String nombre;
    private String descripcion;
    private List<Usuario> usuarios;
    private List<Actividad> actividades=new List<Actividad>(){

        public int size() {
            throw new UnsupportedOperationException("Not supported yet.");
        }
        
        public boolean isEmpty() {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        public boolean contains(Object o) {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        public Iterator<Actividad> iterator() {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        public Object[] toArray() {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        public <T> T[] toArray(T[] a) {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        public boolean add(Actividad e) {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        public boolean remove(Object o) {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        public boolean containsAll(Collection<?> c) {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        public boolean addAll(Collection<? extends Actividad> c) {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        public boolean addAll(int index, Collection<? extends Actividad> c) {
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

        public Actividad get(int index) {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        public Actividad set(int index, Actividad element) {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        public void add(int index, Actividad element) {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        public Actividad remove(int index) {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        public int indexOf(Object o) {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        public int lastIndexOf(Object o) {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        public ListIterator<Actividad> listIterator() {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        public ListIterator<Actividad> listIterator(int index) {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        public List<Actividad> subList(int fromIndex, int toIndex) {
            throw new UnsupportedOperationException("Not supported yet.");
        }
    };

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
     * @return the usuarios
     */
    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    /**
     * @param usuarios the usuarios to set
     */
    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    /**
     * @return the actividades
     */
    public List<Actividad> getActividades() {
        return actividades;
    }

    /**
     * @param actividades the actividades to set
     */
    public void setActividades(List<Actividad> actividades) {
        this.actividades = actividades;
    }

    /**
     * @void AddActividad inserta una nueva actividades
     */
    public void AddActividad(Actividad a){
            this.actividades.add(a);
    }
}
