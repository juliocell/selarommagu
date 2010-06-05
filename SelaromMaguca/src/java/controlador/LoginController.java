/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package controlador;

import modelo.LoginNegocio;

/**
 *
 * @author isak
 */
public class LoginController {

    LoginNegocio negocio;
    String usuario;
    String password;
    String datosEmpleado;

    public LoginController() {
        this.negocio= new LoginNegocio();
    }

    public LoginNegocio getNegocio() {
        return negocio;
    }

    public String getPassword() {
        return password;
    }

    public String getUsuario() {
        return usuario;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String validarUsuario(){

        String salida = negocio.validarUsuario(this.usuario, this.password);
        if(salida.isEmpty()){
            return "fallo";        
        }
        else
        {
            this.datosEmpleado=salida;
            return "ok";
        }

    }


    
}
