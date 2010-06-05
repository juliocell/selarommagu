/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package hibernate;

import org.hibernate.classic.Session;

/**
 *
 * @author isak
 */
public class LoginDaoImpl {

    Session sesion = null;

    public LoginDaoImpl() {
       this.sesion = HibernateUtil.getSessionFactory().getCurrentSession();
    }




    public void esValido(String login, String clave){
        
    }
}
