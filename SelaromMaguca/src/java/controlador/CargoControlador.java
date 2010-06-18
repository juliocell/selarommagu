/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package controlador;

import datos.Cargo;
import java.util.List;
import modelo.CargoNegocio;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;

/**
 *
 * @author william
 */
public class CargoControlador {

    private List<Cargo> listaCargos = null;
    private String cargoDescripcion;
    private int idCargo;
    private String error=null;
    private CargoNegocio negocio = null;




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
    this.instanciarNegocio();
    String verificacion = negocio.agregarCargo(cargoDescripcion);
    return verificacion;
}

public void eliminarCargo() {    
    this.instanciarNegocio();
    boolean respuesta= negocio.eliminarCargo(cargoDescripcion,idCargo);
    if(respuesta){
        this.setError("El cargo ha sido eliminado");
        this.setIdCargo(0);
        this.setCargoDescripcion("");
    }else
    {
        this.setError("ERROR: NO SE PUDO ELIMINAR EL CARGO");
    }

}

public void buscarCargo(){
 
 this.instanciarNegocio();
 Cargo respuesta = negocio.buscandoCargo(cargoDescripcion);
 if(respuesta!=null){
    this.setCargoDescripcion(respuesta.getCargoDescripcion());
    this.setIdCargo(respuesta.getIdCargo());
    this.setError("");

 }
 else
 {
    this.setError("ERROR: CARGO NO ENCONTRADO");
 }
 

}


public void actualizarCargo(){
    this.setError("");
    this.instanciarNegocio();
    int respuesta = negocio.actualizandoCargo(this.getIdCargo());
    if(respuesta==1){
        this.setError("EL CARGO HA SIDO ACTUALIZADO");
        
    }
    else{
        this.setError("ERROR: El CARGO NO PUDO SER ACTUALIZADO");
        
    }
}


public void instanciarNegocio(){
    if(negocio==null){
        
        this.negocio = new CargoNegocio();
    }


}


}
