/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package controlador;

//import javax.faces.bean.ManagedBean;
//import javax.faces.bean.RequestScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;
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
        return "eusr";
        }
        if(this.password.isEmpty()){
        return "eclv";
        }

        LoginNegocio negocio = new LoginNegocio();
        String salida = negocio.validarUsuario(this.usuario, this.password);
        // String salida = negocio.validarUsuario("isaknog", "slayer");
        if(salida.isEmpty()){
            return "fallo";        
        }
        else
        {   //aqui ingreso el usuario a la sesion una vez confirmado

            this.datosEmpleado=salida;
            ExternalContext context = FacesContext.getCurrentInstance().getExternalContext();
            HttpSession session = (HttpSession)context.getSession(true);
            session.setAttribute("usuarioLogin",usuario);
            return "ok";//retorno ok para avanzar a la pagina principal
        }

    }


    
}
