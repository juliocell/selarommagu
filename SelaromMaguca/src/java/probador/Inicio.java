/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package probador;

import datos.Cargo;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author isak
 */
public class Inicio {

    public static void main(String Args[])
    {
        ProbarHibernate laSession = new ProbarHibernate();
        laSession.asociarSession();
        Session sesion = laSession.getSessionFactory().getCurrentSession();
        sesion.beginTransaction();//comienzo la transaccion
        Cargo cargo = new Cargo(4, "Cajero");
        Cargo cargo1 = new Cargo(5, "Gerente");
        Cargo cargo2 = new Cargo(6, "Administrador");
        sesion.save(cargo);//salvo un cargo
        sesion.save(cargo1);
        sesion.save(cargo2);
        sesion.getTransaction().commit();
        Inicio ini = new Inicio();
        ini.listaCargo();
           
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
