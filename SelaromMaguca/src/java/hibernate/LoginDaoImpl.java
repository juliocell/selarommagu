/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package hibernate;

import datos.Empleado;
import org.hibernate.HibernateException;
import org.hibernate.Transaction;
import org.hibernate.Session;

/**
 *
 * @author isak
 */
public class LoginDaoImpl {

    private Session sesion = null;

    public LoginDaoImpl()
    {
       this.sesion = HibernateUtil.getSessionFactory().getCurrentSession();
    }



   public String buscarUsuarioPorLogin(String usuario, String password) throws UsuarioNoExisteException,HibernateLoginException{

        String elQuery= "from Empleado as c where c.empleadosLogin =" + "\'"+usuario+"\'"; // armo el query      
        Transaction tx = sesion.beginTransaction();//comienzo la transaccion

        try
        {       
            Empleado aux=(Empleado) sesion.createQuery(elQuery).uniqueResult();

            if(aux==null)
            {
                throw new UsuarioNoExisteException("El usuario No existe dentro de la BD");                
            }

            if(aux.getEmpleadosLogin().equalsIgnoreCase(password))
            {
                return aux.getEmpleadosNombre() + " " + aux.getEmpleadosApellido();
            }
            else
            {
                return "";
            }
        }
        catch(HibernateException ex)
        {
            tx.rollback();
            System.out.println("ERROR al buscar el Usuario:" + ex.getMessage());
            throw new HibernateLoginException("Error al consultar BD por un LOGIN");            
            
        }


        
    }
}







