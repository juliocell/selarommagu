/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package probador;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author isak
 */
public class ProbarHibernate {

    private SessionFactory sessionFactory;
    

    public void setSessionFactory(SessionFactory sessionFactory){   
        this.sessionFactory =sessionFactory;        
    }

    public void asociarSession(){
        this.setSessionFactory(new Configuration().configure().buildSessionFactory());
    }

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    

}
