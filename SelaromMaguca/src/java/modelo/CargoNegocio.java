/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo;

import hibernate.CargoDaoImpl;
import datos.Cargo;
import hibernate.excepciones.HibernateSalvarCargoException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author william
 */
public class CargoNegocio {

private int listaValidar;


// ******************** Getters y Setters ****************************
    public int getListaValidar() {
        return listaValidar;
    }

    public void setListaValidar(int listaValidar) {
        this.listaValidar = listaValidar;
    }



    //  ********************** Metodos **********************

      public List<Cargo> mostrarCargos() {
         CargoDaoImpl cargoMostrar = new CargoDaoImpl();
         List<Cargo> lista = cargoMostrar.listaCargo();

         if (lista == null) {
               listaValidar = 0;
         }
         else {
             listaValidar = 1;
         }

         return lista;
    }


      public String agregarCargo(String descripcion) {
          CargoDaoImpl agregar = new CargoDaoImpl();
          Cargo cargo = new Cargo();
          cargo.setCargoDescripcion(descripcion);
        try {
            agregar.salvarCargo(cargo);
            return "ok";
        } catch (HibernateSalvarCargoException ex) {
            Logger.getLogger(CargoNegocio.class.getName()).log(Level.SEVERE, null, ex);
            return "fallo";
        }

      }

      public boolean eliminarCargo(String cargoDescripcion, int idCargo) {
        CargoDaoImpl eliminar = new CargoDaoImpl();
        Cargo cargo = new Cargo();        
        cargo.setCargoDescripcion(cargoDescripcion);
        cargo.setIdCargo(idCargo);
           boolean confirmado = eliminar.eliminarCargo(cargo);
           return confirmado;
    }

      public Cargo buscandoCargo(String nombreCargo){
        CargoDaoImpl buscar = new CargoDaoImpl();
        Cargo aux = buscar.buscarCargoPorNombre(nombreCargo);
        return aux;
      }

      public int actualizandoCargo(int cargo){
        CargoDaoImpl actualizar = new CargoDaoImpl();
        Cargo aux = actualizar.buscarCargoPorId(cargo);
        int respuesta = actualizar.actualizarCargo(aux);
        return respuesta;
      }

}
