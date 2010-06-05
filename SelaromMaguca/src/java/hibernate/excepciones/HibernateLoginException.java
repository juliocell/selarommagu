/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package hibernate.excepciones;

/**
 *
 * @author isak
 */
public class HibernateLoginException extends Exception{

    private final String msj;

    public HibernateLoginException(String msj) {
        this.msj = msj;
    }

    public String getMsj() {
        return msj;
    }

   





}
