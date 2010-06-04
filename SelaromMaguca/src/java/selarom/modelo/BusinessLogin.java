/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package selarom.modelo;

import selarom.datos.beans.Login;
import selarom.datos.hibernate.LoginDaoImpl;

/**
 *
 * @author isak
 */
public class BusinessLogin
{

    LoginDaoImpl loguear;

    public BusinessLogin() {
        this.loguear =  new LoginDaoImpl();
    }







    public void validarUsuario()
    {
        
    }
}
