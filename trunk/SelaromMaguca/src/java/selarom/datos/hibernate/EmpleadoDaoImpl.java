/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package selarom.datos.hibernate;

//import com.sun.org.apache.bcel.internal.generic.INSTANCEOF;
import selarom.datos.beans.Empleado;
import selarom.datos.beans.Empleado;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import probador.ProbarHibernate;

/**
 *
 * @author isak
 */
public class EmpleadoDaoImpl{


    public void salvarEmpleado(Empleado elEmpleado, ProbarHibernate pro){
        //ProbarHibernate laSession = new ProbarHibernate();
        //Session sesion = laSession.getSessionFactory().getCurrentSession();
        Session sesion = pro.getSessionFactory().getCurrentSession();
        sesion.beginTransaction();//comienzo la transaccion
        sesion.save(elEmpleado);
        sesion.getTransaction().commit();
        
    }

    public boolean eliminarEmpleado(Empleado aBorrar, ProbarHibernate pro){

        Session sesion = pro.getSessionFactory().getCurrentSession();
        sesion.beginTransaction();//comienzo la transaccion

        try{
            Empleado aux = (Empleado)sesion.load(Empleado.class,aBorrar.getidEmpleado());
            sesion.delete(aux);
            sesion.getTransaction().commit();
            //sesion.close();
            return true;
        }
        catch(HibernateException ex){
            System.out.println("ERROR al eliminar Empleado:" + ex.getMessage());
            sesion.getTransaction().rollback();
            return false;
        }
        finally{
            
                       
        }
    }

    public void actualizarEmpleado(Empleado aActualizar, ProbarHibernate pro){
        Session sesion = pro.getSessionFactory().getCurrentSession();
        sesion.beginTransaction();//comienzo la transaccion        
        sesion.update(aActualizar);
        sesion.close();
    }

    public Empleado buscarEmpleadoPorNombre(String nombre , ProbarHibernate pro){
        
        String elQuery= "from Empleados as c where c.EmpleadoDescripcion = "+ "\'"+nombre+"\'";// armo el query
        //ProbarHibernate laSession = new ProbarHibernate();
        //Session sesion = laSession.getSessionFactory().getCurrentSession();
        Session sesion = pro.getSessionFactory().getCurrentSession();
        sesion.beginTransaction();//comienzo la transaccion
        List<Empleado> lista= sesion.createQuery(elQuery).list();
        Empleado aux=null;
        for (Empleado empleado : lista) {
            aux = empleado;
        }
        sesion.getTransaction().commit();
        
        return aux;
    }

    public Empleado buscarEmpleadoPorId(int id, ProbarHibernate pro){
        Session sesion = pro.getSessionFactory().getCurrentSession();
        sesion.beginTransaction();//comienzo la transaccion
        
        try
        {
            Empleado elEmpleado = (Empleado)sesion.load(Empleado.class, id);
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
    public List<Empleado>  listaEmpleado(ProbarHibernate pro)
    {
        Session sesion = pro.getSessionFactory().getCurrentSession();
        sesion.beginTransaction();//comienzo la transaccion
        List<Empleado> resultado = (List<Empleado>)sesion.createQuery("from Empleado").list();
        sesion.getTransaction().commit();
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


