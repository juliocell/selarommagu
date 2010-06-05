/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package datos;

/**
 *
 * @author isak
 */
public class Login {
private String nombre;
private String clave;

    public Login(String nombre, String clave) {
        this.nombre = nombre;
        this.clave = clave;
    }

    public Login(){

    }

    public String getClave() {
        return clave;
    }

    public String getNombre() {
        return nombre;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Login other = (Login) obj;
        if ((this.nombre == null) ? (other.nombre != null) : !this.nombre.equals(other.nombre)) {
            return false;
        }
        if ((this.clave == null) ? (other.clave != null) : !this.clave.equals(other.clave)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + (this.nombre != null ? this.nombre.hashCode() : 0);
        hash = 17 * hash + (this.clave != null ? this.clave.hashCode() : 0);
        return hash;
    }

    

}
