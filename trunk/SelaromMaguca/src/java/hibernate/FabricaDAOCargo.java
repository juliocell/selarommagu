/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package hibernate;

/**
 *
 * @author isak
 */
public class FabricaDAOCargo extends FabricaDAO{

    public ICargoDao getCargoDAO() {
        return new CargoDaoImpl();
    }



}
