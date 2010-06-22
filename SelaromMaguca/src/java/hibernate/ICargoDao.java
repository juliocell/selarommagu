/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package hibernate;

import datos.Cargo;
import hibernate.excepciones.HibernateSalvarCargoException;
import java.util.List;

/**
 *
 * @author isak
 */
public interface ICargoDao {

    int actualizarCargo(Cargo aActualizar);

    Cargo buscarCargoPorId(int idcar);

    Cargo buscarCargoPorNombre(String nombre);

    boolean eliminarCargo(Cargo aBorrar);

    /**
     * Metodo que devuelve una lista de objectos tipo Cargo
     * @return
     */
    List<Cargo> listaCargo();

    void salvarCargo(Cargo elCargo) throws HibernateSalvarCargoException;

}
