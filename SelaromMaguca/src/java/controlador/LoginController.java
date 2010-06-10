/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package controlador;

//import javax.faces.bean.ManagedBean;
//import javax.faces.bean.RequestScoped;
import modelo.LoginNegocio;

/**
 *
 * @author isak
 */
//@ManagedBean
//@RequestScoped
public class LoginController {

    
    String usuario;
    String password;
    String datosEmpleado;
 

    public LoginController() {        
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
        if(this.usuario.isEmpty()){
        return "fallo";
        }
        if(this.password.isEmpty()){
        return "fallo";
        }

        LoginNegocio negocio = new LoginNegocio();
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
