/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo;

import beans.Empleado;
import hibernate.excepciones.SelaromHibernateException;
import hibernate.mysql.CargoDAOMysql;
import hibernate.EmpleadoDaoImpl;
import hibernate.excepciones.ErrorFormatoFechaException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author william
 */
public class EmpleadoNegocio {
private int listaValidar;

    public String agregarEmpleado(String empleadosNombre, String empleadosApellido, String empleadosCI, String empleadosDir, String empleadosTlfCasa, String empleadosTlfMovil, String empleadosContrasena, String empleadosFechaIng, String empleadosSueldoBase, String empleadosLogin, String empleadosCorreo, String nombreCargo) throws ErrorFormatoFechaException, SelaromHibernateException {
          EmpleadoDaoImpl agregar = new EmpleadoDaoImpl();
          Empleado empleado = new Empleado();
          CargoDAOMysql buscarIdCargo = new CargoDAOMysql();

          empleado.setCargo(buscarIdCargo.buscarCargoPorNombre(nombreCargo));
          empleado.setEmpleadosApellido(empleadosApellido);
          int ci = Integer.parseInt(empleadosCI);
          empleado.setEmpleadosCi(ci);
          empleado.setEmpleadosContrasena(empleadosContrasena);
          empleado.setEmpleadosCorreo(empleadosCorreo);
          empleado.setEmpleadosDir(empleadosDir);

          empleado.setEmpleadosLogin(empleadosLogin);
          empleado.setEmpleadosNombre(empleadosNombre);
          int sueldo = Integer.parseInt(empleadosSueldoBase);
          empleado.setEmpleadosSueldoBase(sueldo);
          empleado.setEmpleadosTlfCasa(empleadosTlfCasa);
          empleado.setEmpleadosTlfMovil(empleadosTlfMovil);

          Date fecha = new Date();
          SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        try {
            fecha = sdf.parse(empleadosFechaIng);
            empleado.setEmpleadosFechaIng(fecha);
            try {
                agregar.salvarEmpleado(empleado);
                return "ok";
            } catch (SelaromHibernateException ex) {
                Logger.getLogger(EmpleadoNegocio.class.getName()).log(Level.SEVERE, null, ex);
                return "fallo";
            }

        } catch (ParseException ex) {
            System.out.println("Error en el formato de la fecha no se pudo salvar el empleado");
            throw new ErrorFormatoFechaException(ex.getMessage());

        }










      }

    public List<Empleado> mostrarEmpleados() {
         EmpleadoDaoImpl listaMostrar = new EmpleadoDaoImpl();
         List<Empleado> lista = listaMostrar.listaEmpleado();

         if (lista == null) {
               setListaValidar(0);
         }
         else {
             setListaValidar(1);
         }

         return lista;
    }

    /**
     * @return the listaValidar
     */
    public int getListaValidar() {
        return listaValidar;
    }

    /**
     * @param listaValidar the listaValidar to set
     */
    public void setListaValidar(int listaValidar) {
        this.listaValidar = listaValidar;
    }

}
