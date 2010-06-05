/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package hibernate;

/**
 *
 * @author isak
 */
public class UsuarioNoExisteException extends Exception{

    String msj=null;


    public UsuarioNoExisteException(String msj) {
        this.msj=msj;
    }

    public String getMsj() {
        return msj;
    }


    
    

}
