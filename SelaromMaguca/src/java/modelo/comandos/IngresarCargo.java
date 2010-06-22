/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo.comandos;

import datos.Cargo;
import hibernate.FabricaDAO;
import hibernate.FabricaDAOCargo;
import hibernate.ICargoDao;
import hibernate.excepciones.HibernateSalvarCargoException;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.FabricaComandosCargo;
import org.hibernate.HibernateException;

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
 * Metodo que guarda el cargo en la BD
 */
    public void ejecutar(){
           FabricaDAO fabrica = new FabricaDAOCargo();
           ICargoDao dao =  fabrica.getCargoDAO();
        try {
            dao.salvarCargo(cargo);
        } catch (HibernateSalvarCargoException ex) {
            Logger.getLogger(IngresarCargo.class.getName()).log(Level.SEVERE, null, ex);
            
        }
    }


}
