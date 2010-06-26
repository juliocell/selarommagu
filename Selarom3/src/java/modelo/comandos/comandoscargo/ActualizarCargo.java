/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo.comandos.comandoscargo;

import beans.Cargo;
import modelo.comandos.IComando;
import modelo.excepciones.SelaromNegocioException;

/**
 *
 * @author isak
 */
public class ActualizarCargo implements IComando{

    private Cargo cargo;

    public ActualizarCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    
    public void ejecutar() throws SelaromNegocioException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
