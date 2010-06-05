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
import org.hibernate.Transaction;

/**
 *
 * @author isak
 */
public class CargoDaoImpl {

        Session sesion = null;

    public CargoDaoImpl()
    {
        this.sesion = HibernateUtil.getSessionFactory().getCurrentSession();
    }




    public void salvarCargo(Cargo elCargo) throws HibernateSalvarCargoException{
        Transaction tx = sesion.beginTransaction();
        try
        {
        sesion.save(elCargo);
        }
        catch(HibernateException ex){
            System.out.println("EXCEPCION: MENSAJE DE LA EXC = " + ex.getMessage());
            throw new HibernateSalvarCargoException(ex.getMessage());
        }
        //sesion.flush();
        
    }

    public boolean eliminarCargo(Cargo aBorrar){

       

        try
        {

            Transaction tx = sesion.beginTransaction();
            Cargo aux = (Cargo)sesion.load(Cargo.class,aBorrar.getIdCargo());
            sesion.delete(aux);
            sesion.flush();
            //tx.commit();
            return true;

        }
        catch(HibernateException ex)
        {
            System.out.println("ERROR al eliminar Cargo:" + ex.getMessage());
            sesion.getTransaction().rollback();
            return false;
        }
        finally{
            
                       
        }
    }

    public void actualizarCargo(Cargo aActualizar){
        Transaction tx = sesion.beginTransaction();
        sesion.update(aActualizar);
        sesion.flush();
        
    }

    public Cargo buscarCargoPorNombre(String nombre){
        
        String elQuery= "from Cargo as c where c.cargoDescripcion = "+ "\'"+nombre+"\'";// armo el query
        Transaction tx = sesion.beginTransaction();//comienzo la transaccion
        List<Cargo> lista= sesion.createQuery(elQuery).list();
        Cargo aux=null;

        for (Cargo cargo : lista) {
            aux = cargo;
        }

        //tx.commit();
        return aux;
    }

    public Cargo buscarCargoPorId(int id){

        Transaction tx = sesion.beginTransaction();
        try
        {
            
            Cargo elCargo = (Cargo)sesion.load(Cargo.class, id);
            //tx.commit();
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
    public List<Cargo>  listaCargo()
    {
        Transaction tx = sesion.beginTransaction();
        List<Cargo> resultado = (List<Cargo>)sesion.createQuery("from Cargo").list();        
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

  
    

//TODO: modificar las pruebas de nuevo

}


