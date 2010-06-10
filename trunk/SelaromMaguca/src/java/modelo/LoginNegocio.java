/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo;

import hibernate.excepciones.HibernateLoginException;
import hibernate.LoginDaoImpl;
import hibernate.excepciones.UsuarioNoExisteException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author isak
 */
public class LoginNegocio
{

    

    public LoginNegocio() {
        
    }
    /**
     * Metodo que busca al usuario por su login y password
     * @param usuario
     * @param password
     * @return
     */
    public String validarUsuario(String usuario, String password)
    {
        try
        {
            LoginDaoImpl loguear = new LoginDaoImpl();            
            String datosUsuario = loguear.buscarUsuarioPorLogin(usuario, password);
            if(datosUsuario.isEmpty())
            {
                return "";
            }
            else
            {
                return datosUsuario;
            }


        } 
        catch (HibernateLoginException ex)
        {
            Logger.getLogger(LoginNegocio.class.getName()).log(Level.SEVERE, ex.getMessage(), ex);
            return null;
        }
        catch (UsuarioNoExisteException ex)
        {
            Logger.getLogger(LoginNegocio.class.getName())
            .log(Level.SEVERE, "ERROR: usuario o clave errado, por favor verifique", ex);
            return null;
        }

    }
}
