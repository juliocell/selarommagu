/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo;

import datos.Cargo;
import java.util.List;
import org.hibernate.Session;
import probador.ProbarHibernate;

/**
 *
 * @author isak
 */
public class CargoDaoImpl {




    public void salvarCargo(Cargo elCargo){

    }

    public void eliminarCargo(){

    }

    public void buscarCargoPorNombre(){

    }

    /**
     * Metodo que devuelve una lista de objectos tipo Cargo
     * @return
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
