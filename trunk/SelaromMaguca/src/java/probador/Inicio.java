/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package probador;

import datos.Cargo;
import datos.Empleado;
import hibernate.HibernateSalvarCargoException;
import java.util.Date;
import java.util.List;
import hibernate.CargoDaoImpl;
import hibernate.EmpleadoDaoImpl;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author isak
 */
public class Inicio {

    static Session sesion = null;

    public static void main(String Args[])
    {
        
        
        
        sesion = hibernate.HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = sesion.beginTransaction();//comienzo la transaccion
        Cargo cargo = new Cargo("Cargo de Prueba");
        CargoDaoImpl gestionar = new CargoDaoImpl();
        try
        {
            gestionar.salvarCargo(cargo);
        } catch (HibernateSalvarCargoException ex) {
            Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
        }
        Cargo aux =(Cargo)gestionar.buscarCargoPorNombre("Cargo de Prueba");
        Empleado emp = new Empleado(cargo, "freddy", "Nogales", 14015477, "slayer", new Date(), "isak", "mcdsx10@cantv.net");
        emp.setCargo(aux);
        EmpleadoDaoImpl gestEmp = new EmpleadoDaoImpl();
        gestEmp.salvarEmpleado(emp);
        tx.commit();
    }


    /**
     * Metodo que Devuelve la lista de los cargos que se encuentran en la tabla Cargos de la BD
     */

    public List<Cargo>  listaCargo()
    {
        ProbarHibernate laSession = new ProbarHibernate();
        Session sesion = laSession.getSessionFactory().getCurrentSession();
        sesion.beginTransaction();//comienzo la transaccion
        List<Cargo> resultado = (List<Cargo>)sesion.createQuery("from Cargo").list();
        sesion.getTransaction().commit();
        
        for (Cargo cargo : resultado)
        {
            System.out.println("Cargo: "+ resultado);
        }

    return resultado;
    }

}
