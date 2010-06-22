/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package hibernate;

import datos.Empleado;
import java.util.List;

/**
 *
 * @author isak
 */
public interface EmpleadoDao {

    void actualizarEmpleado(Empleado aActualizar);

    Empleado buscarEmpleadoPorId(int id);

    Empleado buscarEmpleadoPorNombre(String nombre);

    boolean eliminarEmpleado(Empleado aBorrar);

    /**
     * Metodo que devuelve una lista de objectos tipo Empleado
     * @return
     */
    List<Empleado> listaEmpleado();

}
