/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package presenter;

import beans.Cargo;
import java.util.List;
import javax.faces.context.FacesContext;

import modelo.comandos.IComando;
import modelo.comandos.comandoscargo.BuscarCargo;
import modelo.excepciones.SelaromNegocioException;
import modelo.fabricas.FabricaComandosCargo;

/**
 *
 * @author william
 */
public class CargoPresenter {

    private List<Cargo> listaCargos = null;       
    private String error=null;
    private String mensaje=null;
    



  // ************************* Getters y Stters ************************


    /**
     * @return the mensaje
     */
    public String getMensaje() {
        return mensaje;
    }

    /**
     * @param mensaje the mensaje to set
     */
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }




     /**
     * @param lista de CARGOS para asignar a listaCargos
     */
    public void setListaCargos(List<Cargo> listaCargos) {
        this.listaCargos = listaCargos;
    }


   /**
    * Devuelve la lista de Cargos
    * @return listaCargos
    */
   public List<Cargo> getListaCargos() {

        return this.listaCargos;
       }

   /**
    * Devuelve el error
    * @return listaCargos
    */
    public String getError() {
        return error;
    }

    /**
    * asigna un msj a error
    * @return listaCargos
    */
    public void setError(String error) {
        this.error = error;
    }

// ********************************************************************************************
/**
 * Metodo  que sirve para obtener los mensajes de usuario y confirmacion de persistencia del cargo
 * @return String respuesta 
 */
public void agregarCargo() {

   try{
       //TODO modificar lo de faceContext para poder hacer pruebas unitarias sin JSF
       //TODO ver si puedo agregar el objeto CARGO como parametro de este en faces-config.xml
   Cargo cargo = (Cargo) FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("cargo");
   
   IComando ingresar =  modelo.fabricas.FabricaComandosCargo.CrearComandoSalvarCargo(cargo);
   
   ingresar.ejecutar();   
   this.setMensaje("El cargo se ingreso Exitosamente");
   cargo.setIdCargo(0);
   cargo.setCargoDescripcion("");
  
   }
   catch (SelaromNegocioException ex)
   {
        this.setError("ERROR: Operacion FALLO");
        //Logger.getLogger(CargoPresenter.class.getName()).log(Level.SEVERE, null, ex);

   }

}

/**
 * Metodo  que sirve para eliminar la persistencia del cargo
 * @return String respuesta
 */
public void eliminarCargo() {    
    Cargo cargo = (Cargo) FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("cargo");
    IComando eliminar = FabricaComandosCargo.CrearComandoEliminarCargo(cargo);
        try {
            eliminar.ejecutar();
            this.setMensaje("El cargo ha sido eliminado");
            cargo.setIdCargo(0);
            cargo.setCargoDescripcion("");

        } catch (SelaromNegocioException ex) {
            this.setError("ERROR: Operacion FALLO");
            
        }
                
        
}

/**
 * Metodo  que sirve para obtener un cargo
 * @return String respuesta
 */
public void buscarCargo(){

Cargo cargo = (Cargo) FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("cargo");
 IComando buscar = FabricaComandosCargo.CrearComandoBuscarCargo(cargo);
 
        try
        {
            buscar.ejecutar();
        }
        catch (SelaromNegocioException ex)
        {
            this.setError("ERROR: Operacion FALLO");
        }

        BuscarCargo respuesta = (BuscarCargo)buscar;
        FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("cargo", respuesta.getCargo());

}


/**
 * Metodo  que sirve para actualizar un cargo
 * @return String respuesta
 */
public void actualizarCargo(){
    Cargo cargo = (Cargo) FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("cargo");
    
    IComando actualizar = FabricaComandosCargo.CrearComandoActualizarCargo(cargo);
        try
        {
            actualizar.ejecutar();
            this.setError("");
            this.setMensaje("EL CARGO HA SIDO ACTUALIZADO EXITOSAMENTE");
        }
        catch (SelaromNegocioException ex)
        {
            
            this.setError("ERROR: Operacion FALLO");
        }
    
}








  


}

