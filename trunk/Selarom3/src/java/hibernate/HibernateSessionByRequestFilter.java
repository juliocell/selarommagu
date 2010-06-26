/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package hibernate;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import org.hibernate.SessionFactory;
import org.hibernate.StaleObjectStateException;

/**
 * Clase filtro para aplicar el patron sesion on view
 * @author isak
 */
public class HibernateSessionByRequestFilter implements Filter{

    private SessionFactory sesion; //variable sesionFactory

    public void init(FilterConfig filterConfig) throws ServletException {
        sesion = HibernateUtil.getSessionFactory();

    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        try
        {
            //inicio la sesion
            sesion.getCurrentSession().beginTransaction();
            
            chain.doFilter(request, response);

            //cierro la sesion
            sesion.getCurrentSession().getTransaction().commit();


        } 
        catch (StaleObjectStateException staleEx)
        {
            throw staleEx;

        }catch (Throwable ex) {
            // Rollback si error
            ex.printStackTrace();
            try {
                if (sesion.getCurrentSession().getTransaction().isActive()) {
                    //"Trying to rollback database transaction after exception"
                    sesion.getCurrentSession().getTransaction().rollback();
                }
            } catch (Throwable rbEx) {
                System.out.println("SELAROM: No se pudo hacer ROllback de la transaccion" +rbEx);
            }

            // Let others handle it... maybe another interceptor for exceptions?
            throw new ServletException(ex);
        }

    }

    /**
     * Metodo que cierra el filtro
     */
    public void destroy() {
        
    }

}
