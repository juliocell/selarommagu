/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package hibernate.excepciones;

/**
 *
 * @author isak
 */
public class SelaromHibernateException extends Exception {

    private final String msj;

    public SelaromHibernateException(String msj) {
        this.msj = msj;
    }

    public SelaromHibernateException() {
        this.msj="ERROR: Ha ocurrido un Error en la Capa de DATOS";
    }

    public String getMsj() {
        return msj;
    }
}
