/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo.excepciones;

/**
 *
 * @author isak
 */
public class SelaromNegocioException extends Exception {

  private final String msj;

    public SelaromNegocioException(String msj) {
        this.msj = msj;
    }

    public SelaromNegocioException() {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    public String getMsj() {
        return msj;
    }

}
