/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package presenter;

import beans.Cargo;
import javax.faces.context.FacesContext;

/**
 *
 * @author isak
 */
public class LoginPresenter {




    public String ValidarUsuario(){

        Cargo cargo = (Cargo) FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("login");        
        return "ok";
        
    }

}
