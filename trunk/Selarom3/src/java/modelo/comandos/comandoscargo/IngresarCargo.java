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
public class IngresarCargo implements IComando{

    private Cargo cargo;


    /**
     * Constructor que inicializa el cargo
     * @param cargo
     */
    public IngresarCargo(Cargo cargo) {
        this.cargo = cargo;
    }


/**
 * Comando que guarda el cargo en la BD
 */
    public void ejecutar() throws SelaromNegocioException{
        // TODO Lista Fabrica Abastracta DAO

        ICargoDAO dao = FabricaDAO.crearFabricaDAOMysql().crearCargoDAO();
        
        try 
        {

            dao.salvarCargo(cargo);
            
        } 
        catch (SelaromHibernateException ex)
        {
            throw new SelaromNegocioException();
        }

       

    }//fin de ejecutar

}
