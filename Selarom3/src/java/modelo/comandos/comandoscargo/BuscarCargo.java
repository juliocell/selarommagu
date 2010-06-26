/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo.comandos.comandoscargo;

import beans.Cargo;
import hibernate.fabricas.FabricaDAO;
import hibernate.interfaces.ICargoDAO;
import hibernate.excepciones.SelaromHibernateException;
import modelo.comandos.IComando;
import modelo.excepciones.SelaromNegocioException;

/**
 *
 * @author isak
 */
public class BuscarCargo implements IComando {

    Cargo cargo;

    public BuscarCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }
 



    /**
     * Comando que ejecuta la busqueda del CARGO
     * @throws SelaromHibernateException
     */
    public void ejecutar() throws SelaromNegocioException{

        try
        {
            ICargoDAO dao = FabricaDAO.crearFabricaDAOMysql().crearCargoDAO();
            this.setCargo(dao.buscarCargoPorNombre(this.cargo.getCargoDescripcion()));
        }
        catch (SelaromHibernateException ex)
        {            
            throw new SelaromNegocioException();
        }
    }

}
