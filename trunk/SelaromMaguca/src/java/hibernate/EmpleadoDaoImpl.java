/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package hibernate;

//import com.sun.org.apache.bcel.internal.generic.INSTANCEOF;
import datos.Empleado;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author isak
 */
public class EmpleadoDaoImpl{

    Session sesion=null;

    public EmpleadoDaoImpl()
    {
        this.sesion = HibernateUtil.getSessionFactory().getCurrentSession();
    }




    public void salvarEmpleado(Empleado elEmpleado){
        Transaction tx = sesion.beginTransaction();//comienzo la transaccion
        sesion.save(elEmpleado);
        tx.commit();
        
    }

    public boolean eliminarEmpleado(Empleado aBorrar){

        Transaction tx = sesion.beginTransaction();//comienzo la transaccion
            
        try{
            Empleado aux = (Empleado)sesion.load(Empleado.class,aBorrar.getidEmpleado());
            sesion.delete(aux);
            tx.commit();           
            return true;
        }
        catch(HibernateException ex){
            tx.rollback();
            System.out.println("ERROR al eliminar Empleado:" + ex.getMessage());            
            return false;
        }
        finally{
            
                       
        }
    }

    public void actualizarEmpleado(Empleado aActualizar){
        Transaction tx = sesion.beginTransaction();//comienzo la transaccion
        sesion.update(aActualizar);
        tx.commit();
    }

    public Empleado buscarEmpleadoPorNombre(String nombre){
        
        String elQuery= "from Empleados as c where c.EmpleadoDescripcion = "+ "\'"+nombre+"\'";// armo el query
        Transaction tx = sesion.beginTransaction();//comienzo la transaccion
        List<Empleado> lista= sesion.createQuery(elQuery).list();
        Empleado aux=null;
        for (Empleado empleado : lista) {
            aux = empleado;
        }
        //sesion.getTransaction().commit();
        tx.commit();
        return aux;
    }

    public Empleado buscarEmpleadoPorId(int id){
        Transaction tx = sesion.beginTransaction();//comienzo la transaccion
        try
        {
            Empleado elEmpleado = (Empleado)sesion.load(Empleado.class, id);
            tx.commit();
            return elEmpleado;
        }
        catch(HibernateException ex){
            System.out.println("ERROR al buscar el Empleado:" + ex.getMessage());
            return null;
        }
    }

    /**
     * Metodo que devuelve una lista de objectos tipo Empleado
     * @return
     */
    public List<Empleado>  listaEmpleado()
    {
        Transaction tx = sesion.beginTransaction();//comienzo la transaccion
        List<Empleado> resultado = (List<Empleado>)sesion.createQuery("from Empleado").list();
        tx.commit();
        if(resultado!=null)
        {
            for (Empleado empleado : resultado)
            {
                System.out.println("Empleado: "+ resultado);
            }

            return resultado;

        }
        else
        {
            return null;

        }
    }

  
    

//TODO: hacer las pruebas de actualizar, buscar y listarEmpleado

}


