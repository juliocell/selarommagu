/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package hibernate;

import hibernate.excepciones.UsuarioNoExisteException;
import hibernate.excepciones.HibernateLoginException;
import beans.Empleado;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author isak
 */
public class LoginDaoImpl implements LoginDao {

    private Session sesion = null;

   


/**
 * Metodo que devuelve comprueba la identidad del usuario con password
 * y login, devuelve un string que activa la navigation-rule de JSF
 * @param usuario
 * @param password
 * @return String
 * @throws UsuarioNoExisteException
 * @throws HibernateLoginException
 */
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

            if(aux.getEmpleadosContrasena().equalsIgnoreCase(password))
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
          //  tx.rollback();
            sesion.getTransaction().rollback();
            System.out.println("ERROR al buscar el Usuario:" + ex.getMessage());
            throw new HibernateLoginException("Error al consultar BD por un LOGIN");            
            
        }


        
    }


   /**
    * Metodo que devuelve la sesion o la crea si esta no se ha iniciado antes.
    * @return
    */
   public Session getSesion() {      
        return sesion;  
    }




}







