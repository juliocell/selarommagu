/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package controlador;

import datos.Cargo;
import java.util.List;
import modelo.CargoDaoImpl;

import probador.ProbarHibernate;

import org.hibernate.Session;


/**
 *
 * @author william
 */
public class controladorCargo {

    private List<Cargo> listaCargos = null;
   




public List<Cargo> lista() {
    CargoDaoImpl cargosMostrar = new CargoDaoImpl();
    ProbarHibernate laSession = new ProbarHibernate();
        laSession.asociarSession();
        Session sesion = laSession.getSessionFactory().getCurrentSession();

      return  cargosMostrar.listaCargo(laSession);
    
}

    /**
     * @return the listaCargos
     */
    public List<Cargo> getListaCargos() {
        List<Cargo> lista = lista();
        return lista;
    }

    /**
     * @param listaCargos the listaCargos to set
     */
    public void setListaCargos(List<Cargo> listaCargos) {
        this.listaCargos = listaCargos;
    }



}
