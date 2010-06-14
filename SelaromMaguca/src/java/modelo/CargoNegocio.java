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

      public void eliminarCargo(String cargoDescripcion, String idCargo) {
        CargoDaoImpl eliminar = new CargoDaoImpl();
        Cargo cargo = new Cargo();
        int id = Integer.parseInt(idCargo);
        cargo.setCargoDescripcion(cargoDescripcion);
        cargo.setIdCargo(id);
           eliminar.eliminarCargo(cargo);
    }


}
