/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package hibernate.fabricas;

import hibernate.mysql.CargoDAOMysql;
import hibernate.interfaces.ICargoDAO;
import hibernate.interfaces.IEmpleadoDAO;
import hibernate.interfaces.ILoginDAO;

/**
 *
 * @author isak
 */
class FabricaDAOMysql extends FabricaDAO{

    public FabricaDAOMysql() {

        
    }

    /**
     * Metodo que devuelve el DAO de CARGO
     * @return
     */
    @Override
    public ICargoDAO crearCargoDAO() {
        return new CargoDAOMysql();
    }

     /**
     * Metodo que devuelve el DAO de EMPLEADO
     * @return
     */
    @Override
    public IEmpleadoDAO crearEmpleadoDAO() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

     /**
     * Metodo que devuelve el DAO de LOGIN
     * @return
     */
    @Override
    public ILoginDAO crearLoginDAO() {
        throw new UnsupportedOperationException("Not supported yet.");
    }





}
