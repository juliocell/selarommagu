/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package hibernate;

import hibernate.excepciones.HibernateLoginException;
import hibernate.excepciones.UsuarioNoExisteException;
import org.hibernate.Session;

/**
 *
 * @author isak
 */
public interface LoginDao {

    String buscarUsuarioPorLogin(String usuario, String password) throws UsuarioNoExisteException, HibernateLoginException;

    /**
     * Metodo que devuelve la sesion o la crea si esta no se ha iniciado antes.
     * @return
     */
    Session getSesion();

    /**
     * Metodo que inicia la sesion hibernate del objeto
     */
 

}
