/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package presenter;

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
    String error;

    public String getError() {
        return error;
    }

    public void setDatosEmpleado(String datosEmpleado) {
        this.datosEmpleado = datosEmpleado;
    }

    public void setError(String error) {
        this.error = error;
    }
 

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

    public String getDatosEmpleado() {
        return datosEmpleado.toUpperCase();
    }

    public String validarUsuario(){
 

        LoginNegocio negocio = new LoginNegocio();
        String salida = negocio.validarUsuario(this.usuario, this.password);
        // String salida = negocio.validarUsuario("isaknog", "slayer");
        if(salida.isEmpty()){
            this.setError("ERROR: Combinacion usuario y password Invalida");
            return "";
        }
        else
        {   //aqui ingreso el usuario a la sesion una vez confirmado

            this.datosEmpleado=salida;
            this.setError("");
            ExternalContext context = FacesContext.getCurrentInstance().getExternalContext();
            HttpSession session = (HttpSession)context.getSession(true);
            session.setAttribute("usuarioLogin",usuario);
            return "ok";//retorno ok para avanzar a la pagina principal
        }

    }

    public String salirSesion(){


        ExternalContext context = FacesContext.getCurrentInstance().getExternalContext();
        HttpSession session = (HttpSession)context.getSession(true);
        session.setAttribute("usuarioLogin",null);
        return "logout";

    }


    
}
