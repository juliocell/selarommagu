/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package probador;

import selarom.datos.beans.Cargo;
import selarom.datos.beans.Empleado;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import selarom.datos.hibernate.CargoDaoImpl;
import selarom.datos.hibernate.EmpleadoDaoImpl;
import org.hibernate.Session;

/**
 *
 * @author isak
 */
public class Inicio {

    public static void main(String Args[])
    {
        
        ProbarHibernate pro = new ProbarHibernate();
        pro.asociarSession();
        Session sesion = pro.getSessionFactory().getCurrentSession();
        sesion.beginTransaction();//comienzo la transaccion
        Cargo cargo = new Cargo("Gerente");
        CargoDaoImpl gestionar = new CargoDaoImpl();
        gestionar.salvarCargo(cargo, pro);
        Cargo aux =(Cargo)gestionar.buscarCargoPorNombre("Gerente", pro);
        Empleado emp = new Empleado(cargo, "freddy", "Nogales", 14015477, "slayer", new Date(), "isak", "mcdsx10@cantv.net");
        emp.setCargo(aux);
        EmpleadoDaoImpl gestEmp = new EmpleadoDaoImpl();
        gestEmp.salvarEmpleado(emp, pro);
        
//        cargo.setEmpleadoses(new HashSet());
//        cargo.getEmpleadoses().add(emp);
//        ProbarHibernate laSession = new ProbarHibernate();
//        laSession.asociarSession();
//        Session sesion = laSession.getSessionFactory().getCurrentSession();
//    
//TODO probar el archivo inicio de nuevo para verificar que guarde al empleado
        

//        Cargo cargo = new Cargo(10,"prueba martes 1");
//        Cargo cargo1 = new Cargo(11,"prueba martes 2");
//        Cargo cargo2 = new Cargo(12,"prueba martes 3");
//        sesion.beginTransaction();//comienzo la transaccion
//        sesion.save(cargo);//salvo un cargo
//        sesion.save(cargo1);
//        sesion.save(cargo2);
//        sesion.getTransaction().commit();
//        Cargo aux =(Cargo)sesion.get(Cargo.class, 3);
//        Inicio ini = new Inicio();
//        ini.listaCargo();
//
//TODO: terminar la prueba de hibernate para salvar y buscar un empleado y una categoria
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
