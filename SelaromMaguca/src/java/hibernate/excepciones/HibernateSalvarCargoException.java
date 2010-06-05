/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package hibernate.excepciones;

/**
 *
 * @author isak
 */
public class HibernateSalvarCargoException extends Exception{

    String msj=null;

    public HibernateSalvarCargoException(String message) {
        this.msj=message;
    }

    public String getMsj() {
        return msj;
    }

    

}
