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

    LoginDaoImpl loguear;

    public LoginNegocio() {
        this.loguear =  new LoginDaoImpl();
    }

    public String validarUsuario(String usuario, String password)
    {
        try
        {
            loguear.getSesion().beginTransaction();
            String datosUsuario = loguear.buscarUsuarioPorLogin(usuario, password);
            if(datosUsuario.isEmpty()){
                return "";
            }
            else
            {
                return datosUsuario;
            }


        } 
        catch (HibernateLoginException ex)
        {
            Logger.getLogger(LoginNegocio.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        catch (UsuarioNoExisteException ex)
        {
            Logger.getLogger(LoginNegocio.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }

    }
}
