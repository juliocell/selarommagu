/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo;

import datos.Empleado;
import hibernate.CargoDaoImpl;
import hibernate.EmpleadoDaoImpl;
import hibernate.excepciones.ErrorFormatoFechaException;
import hibernate.excepciones.HibernateSalvarEmpleadoException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author william
 */
public class EmpleadoNegocio {


    public String agregarEmpleado(String empleadosNombre, String empleadosApellido, String empleadosCI, String empleadosDir, String empleadosTlfCasa, String empleadosTlfMovil, String empleadosContrasena, String empleadosFechaIng, String empleadosSueldoBase, String empleadosLogin, String empleadosCorreo, String idCargo) throws ErrorFormatoFechaException {
          EmpleadoDaoImpl agregar = new EmpleadoDaoImpl();
          Empleado empleado = new Empleado();
          int id = Integer.parseInt(idCargo);
          CargoDaoImpl buscarIdCargo = new CargoDaoImpl();
          
          empleado.setCargo(buscarIdCargo.buscarCargoPorId(id));
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
                agregar.salvarEmpleados(empleado);
                return "ok";
            } catch (HibernateSalvarEmpleadoException ex) {
                Logger.getLogger(EmpleadoNegocio.class.getName()).log(Level.SEVERE, null, ex);
                return "fallo";
            }
            
        } catch (ParseException ex) {
            System.out.println("Error en el formato de la fecha no se pudo salvar el empleado");
            throw new ErrorFormatoFechaException(ex.getMessage());

        }
        
            
       
            

            

            
              
       
      }

}
