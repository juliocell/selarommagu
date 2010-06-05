/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package hibernate;

//import com.sun.org.apache.bcel.internal.generic.INSTANCEOF;
import datos.Cargo;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import probador.ProbarHibernate;

/**
 *
 * @author isak
 */
public class CargoDaoImpl{


    public void salvarCargo(Cargo elCargo, ProbarHibernate pro){
        //ProbarHibernate laSession = new ProbarHibernate();
        //Session sesion = laSession.getSessionFactory().getCurrentSession();
        Session sesion = pro.getSessionFactory().getCurrentSession();
        sesion.beginTransaction();//comienzo la transaccion
        sesion.save(elCargo);
        sesion.flush();
        sesion.getTransaction().commit();
        
    }

    public boolean eliminarCargo(Cargo aBorrar, ProbarHibernate pro){

        Session sesion = pro.getSessionFactory().getCurrentSession();
        sesion.beginTransaction();//comienzo la transaccion

        try{
            Cargo aux = (Cargo)sesion.load(Cargo.class,aBorrar.getIdCargo());
            sesion.delete(aux);
            sesion.getTransaction().commit();
            //sesion.close();
            return true;
        }
        catch(HibernateException ex){
            System.out.println("ERROR al eliminar Cargo:" + ex.getMessage());
            sesion.getTransaction().rollback();
            return false;
        }
        finally{
            
                       
        }
    }

    public void actualizarCargo(Cargo aActualizar, ProbarHibernate pro){
        Session sesion = pro.getSessionFactory().getCurrentSession();
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

    public Cargo buscarCargoPorId(int id, ProbarHibernate pro){
        Session sesion = pro.getSessionFactory().getCurrentSession();
        sesion.beginTransaction();//comienzo la transaccion
        
        try
        {
            Cargo elCargo = (Cargo)sesion.load(Cargo.class, id);
            return elCargo;
        }
        catch(HibernateException ex){
            System.out.println("ERROR al buscar el Cargo:" + ex.getMessage());
            return null;
        }
    }

    /**
     * Metodo que devuelve una lista de objectos tipo Cargo
     * @return
     */
    public List<Cargo>  listaCargo(ProbarHibernate pro)
    {
        Session sesion = pro.getSessionFactory().getCurrentSession();
        sesion.beginTransaction();//comienzo la transaccion
        List<Cargo> resultado = (List<Cargo>)sesion.createQuery("from Cargo").list();
        sesion.getTransaction().commit();
        if(resultado!=null)
        {
            for (Cargo cargo : resultado)
            {
                System.out.println("Cargo: "+ resultado);
            }

            return resultado;

        }
        else
        {
            return null;

        }
    }

  
    

//TODO: hacer las pruebas de actualizar, buscar y listarCargo

}


