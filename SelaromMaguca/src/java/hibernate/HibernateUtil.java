package hibernate;


import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.SessionFactory;

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
            sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
            
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
