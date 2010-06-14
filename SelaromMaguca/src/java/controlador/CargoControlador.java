/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package controlador;

import datos.Cargo;
import java.util.List;
import modelo.CargoNegocio;

/**
 *
 * @author william
 */
public class CargoControlador {

    private List<Cargo> listaCargos = null;
    private String cargoDescripcion;
    private String idCargo;




    // ************************* Getters y Stters ************************
    
     public String getIdCargo() {
        return idCargo;
    }

    public void setIdCargo(String idCargo) {
        this.idCargo = idCargo;
    }

    
    public String getCargoDescripcion() {
        return cargoDescripcion;
    }

    public void setCargoDescripcion(String cargoDescripcion) {
        this.cargoDescripcion = cargoDescripcion;
    }

    
    public void setListaCargos(List<Cargo> listaCargos) {
        this.listaCargos = listaCargos;
    }



        public List<Cargo> getListaCargos() {
        CargoNegocio cargoMostrar = new CargoNegocio();
        listaCargos = cargoMostrar.mostrarCargos();
        return listaCargos;
       }

// ********************************************************************************************

public String agregarCargo() {
    CargoNegocio insertarCargo = new CargoNegocio();
    String verificacion = insertarCargo.agregarCargo(cargoDescripcion);
    return verificacion;
}

public void submitEliminar() {
    CargoNegocio insertarCargo = new CargoNegocio();
    insertarCargo.eliminarCargo(cargoDescripcion,idCargo);
}





}
