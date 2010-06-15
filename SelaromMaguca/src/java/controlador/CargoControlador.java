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
    private int idCargo;
    private String error=null;




    // ************************* Getters y Stters ************************
    
     public int getIdCargo() {
        return idCargo;
    }

    public void setIdCargo(int idCargo) {
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

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

// ********************************************************************************************

public String agregarCargo() {
    CargoNegocio insertarCargo = new CargoNegocio();
    String verificacion = insertarCargo.agregarCargo(cargoDescripcion);
    return verificacion;
}

public void submitEliminar() {
    CargoNegocio insertarCargo = new CargoNegocio();
    insertarCargo.eliminarCargo(cargoDescripcion,Integer.toString(idCargo));
}

public void buscarCargo(){
 
 CargoNegocio buscarCargo = new CargoNegocio();
 Cargo respuesta = buscarCargo.buscandoCargo(cargoDescripcion);
 if(respuesta!=null){
    this.setCargoDescripcion(respuesta.getCargoDescripcion());
    this.setIdCargo(respuesta.getIdCargo());
    this.setError("");

 }
 else
 {
    this.setError("Cargo no encontrado");
 }
 

}



}
