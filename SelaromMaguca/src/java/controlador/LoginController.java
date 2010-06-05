/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package controlador;

import modelo.BusinessLogin;

/**
 *
 * @author isak
 */
public class LoginController {

    BusinessLogin negocio;
    String usuario;
    String password;

    public LoginController() {
        this.negocio= new BusinessLogin();
    }

    public BusinessLogin getNegocio() {
        return negocio;
    }

    public String getPassword() {
        return password;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setNegocio(BusinessLogin negocio) {
        this.negocio = negocio;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }



    
}
