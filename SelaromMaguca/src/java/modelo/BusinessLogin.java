/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo;

import datos.Login;
import hibernate.LoginDaoImpl;

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
