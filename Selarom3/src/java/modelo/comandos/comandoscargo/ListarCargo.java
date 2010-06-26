/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo.comandos.comandoscargo;

import beans.Cargo;
import java.util.List;
import modelo.comandos.IComando;
import modelo.excepciones.SelaromNegocioException;

/**
 *
 * @author isak
 */
public class ListarCargo implements IComando{

    List<Cargo> listaCargo;

    /**
     * constructor
     */
    public ListarCargo() {
       
    }



    /**
     * Retorna una lista de Cargos
     * @return Lista<Cargo>
     */
    public List<Cargo> getListaCargo() {
        return listaCargo;
    }

    

    /**
     * Metodo que devuelve una lista de todos los Cargos del Sistema
     * @throws SelaromNegocioException
     */
    
    public void ejecutar() throws SelaromNegocioException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
















