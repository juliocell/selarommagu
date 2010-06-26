/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package beans;

/**
 *
 * @author isak
 */
public class Login implements java.io.Serializable{
    String usuario;
    String password;

    public Login(String usuario, String password) {
        this.usuario = usuario;
        this.password = password;
    }

    public Login() {
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



}
