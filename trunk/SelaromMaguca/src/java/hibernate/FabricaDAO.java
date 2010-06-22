/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package hibernate;

/**
 * declaracion de metodos para obtener DAO de los distintos clientes
 * @author isak
 */
public abstract class FabricaDAO
{

    /**
     * declaracion de metodos para obtener DAO de los distintos clientes
     * @return
     */
    
    public abstract  ICargoDao getCargoDAO();
    


}
