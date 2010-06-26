/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package hibernate.fabricas;

import hibernate.interfaces.ICargoDAO;
import hibernate.interfaces.IEmpleadoDAO;
import hibernate.interfaces.ILoginDAO;

/**
 *
 * @author isak
 */
public abstract  class FabricaDAO {

    /**
     * metodo que retorna el DAO de CARGO
     * @return ICargoDAO
     */
    public abstract ICargoDAO crearCargoDAO();

    /**
     * metodo que retorna el DAO de EMPLEADO
     * @return IEmpleadoDAO
     */

    public abstract IEmpleadoDAO crearEmpleadoDAO();

    /**
     * metodo que retorna el DAO de LOGIN
     * @return ILoginDAO
     */
    

    public abstract ILoginDAO crearLoginDAO();


    /**
     * Metodo que crea DAO para mysql
     * @return
     */
    public static FabricaDAO crearFabricaDAOMysql(){
        return new FabricaDAOMysql();
    }

     /**
     * Metodo que crea DAO para ORACLE (No implementado)
     * @return
     */
    public static FabricaDAO crearFabricaDAOOracle(){
        throw new UnsupportedOperationException("SELAROM: DAO ORACLE No implementado TODAVIA");
    }

}
