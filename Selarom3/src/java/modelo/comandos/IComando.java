/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo.comandos;
import beans.Cargo;
import modelo.excepciones.SelaromNegocioException;

/**
 * Interface que define el metodo general de todos los comandos
 * @author isak
 */
public interface IComando
{

    public void ejecutar() throws SelaromNegocioException;

    

}
