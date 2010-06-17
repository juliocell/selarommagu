/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package probador;

import datos.Cargo;
import datos.Empleado;
import hibernate.CargoDaoImpl;
import hibernate.EmpleadoDaoImpl;
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
public class Inicio2 {

    public static void main(String Args[])
    {

        Empleado empleado = new Empleado();
                EmpleadoDaoImpl empleadoPrueba = new EmpleadoDaoImpl();
                CargoDaoImpl buscarCargo = new CargoDaoImpl();
                Cargo cargo2 = new Cargo();
               cargo2 = buscarCargo.buscarCargoPorId(1);
                empleado.setCargo(cargo2);
                empleado.setEmpleadosApellido("Morales");
                empleado.setEmpleadosCi(1234353);
                empleado.setEmpleadosContrasena("1234");
                empleado.setEmpleadosCorreo("maria@hotmail.com");
                empleado.setEmpleadosDir("el paraiso");
                
                empleado.setEmpleadosLogin("maria");
                empleado.setEmpleadosNombre("Alejandro");
                int sueldo = Integer.parseInt("1000");
                empleado.setEmpleadosSueldoBase(sueldo);
                empleado.setEmpleadosTlfCasa("0212322232");
                empleado.setEmpleadosTlfMovil("04167283930");
                Date fecha = new Date();
                SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        try {
            fecha = sdf.parse("10-06-2010");
        } catch (ParseException ex) {
            Logger.getLogger(Inicio2.class.getName()).log(Level.SEVERE, null, ex);
        }

 empleado.setEmpleadosFechaIng(fecha);
//        try {
//            empleadoPrueba.salvarEmpleado(empleado);
//        } catch (HibernateSalvarEmpleadoException ex) {
//            Logger.getLogger(Inicio2.class.getName()).log(Level.SEVERE, null, ex);
//        }
          
                      
        
    }
}
