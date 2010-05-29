/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo;

import com.sun.org.apache.bcel.internal.generic.INSTANCEOF;
import datos.Cargo;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.LockMode;
import org.hibernate.Session;
import probador.ProbarHibernate;

/**
 *
 * @author isak
 */
public class CargoDaoImpl{
//TODO: pendiente con la busqueda de empleados por cargo???

    public void salvarCargo(Cargo elCargo, ProbarHibernate pro){
        //ProbarHibernate laSession = new ProbarHibernate();
        //Session sesion = laSession.getSessionFactory().getCurrentSession();
        Session sesion = pro.getSessionFactory().getCurrentSession();
        sesion.beginTransaction();//comienzo la transaccion
        sesion.save(elCargo);
        sesion.getTransaction().commit();
        
    }

    public boolean eliminarCargo(Object aBorrar){

        ProbarHibernate laSession = new ProbarHibernate();
        Session sesion = laSession.getSessionFactory().getCurrentSession();
        sesion.beginTransaction();//comienzo la transaccion

        try{

            sesion.delete(aBorrar);
            return true;

        }
        catch(HibernateException ex){
            System.out.println("ERROR al eliminar Cargo:" + ex.getMessage());
            
        }
        finally{
            sesion.close();
            return false;
        }
    }

    public void actualizarCargo(Cargo aActualizar){
        ProbarHibernate laSession = new ProbarHibernate();
        Session sesion = laSession.getSessionFactory().getCurrentSession();
        sesion.beginTransaction();//comienzo la transaccion
        sesion.update(aActualizar);
        sesion.close();
    }

    public Cargo buscarCargoPorNombre(String nombre , ProbarHibernate pro){
        
        String elQuery= "from Cargo as c where c.cargoDescripcion = "+ "\'"+nombre+"\'";// armo el query
        //ProbarHibernate laSession = new ProbarHibernate();
        //Session sesion = laSession.getSessionFactory().getCurrentSession();
        Session sesion = pro.getSessionFactory().getCurrentSession();
        sesion.beginTransaction();//comienzo la transaccion
        List<Cargo> lista= sesion.createQuery(elQuery).list();
        Cargo aux=null;
        for (Cargo cargo : lista) {
            aux = cargo;
        }
        sesion.getTransaction().commit();
        
        return aux;
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


