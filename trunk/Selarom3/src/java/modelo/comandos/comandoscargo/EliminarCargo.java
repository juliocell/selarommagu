/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo.comandos.comandoscargo;

import beans.Cargo;
import hibernate.fabricas.FabricaDAO;
import hibernate.excepciones.SelaromHibernateException;
import modelo.comandos.IComando;
import modelo.excepciones.SelaromNegocioException;

/**
 *
 * @author isak
 */
public class EliminarCargo implements IComando{

    private Cargo cargo=null;

    public EliminarCargo(Cargo cargo) {
        this.cargo= cargo;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    

    public void ejecutar() throws SelaromNegocioException
    {
        try 
        {
            FabricaDAO.crearFabricaDAOMysql().crearCargoDAO().eliminarCargo(cargo);

        } 
        catch (SelaromHibernateException ex)
        {

           throw new SelaromNegocioException();

        }
    }

}
