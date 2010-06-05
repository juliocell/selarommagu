package hibernate;


import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Clase Hibernate util que me permite tener las sessionFactory y crear las sesiones sencilla
 * desde cualquier clase, lo hace automatico con el bloque de codigo static que hace la llamada
 *
 * @author isak
 */
public class HibernateUtil
{
    private static final SessionFactory sessionFactory;

    static
    {
        try
        {
           /**
            * Aqui le indico a hibernate que inicialice tomando
            * los datos de configuracion del hibernate.cfg.xml de la raiz
            */

            sessionFactory = new Configuration().configure().buildSessionFactory();
            
        } catch (Throwable ex) {
            // muestro el error
            System.err.println("SessionFactory fallo al iniciar" + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static SessionFactory getSessionFactory()
    {
     
            return sessionFactory;           
    }
}
