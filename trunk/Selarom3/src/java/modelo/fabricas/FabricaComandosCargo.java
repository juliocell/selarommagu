/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo.fabricas;

import beans.Cargo;
import modelo.comandos.IComando;
import modelo.comandos.comandoscargo.ActualizarCargo;
import modelo.comandos.comandoscargo.BuscarCargo;
import modelo.comandos.comandoscargo.EliminarCargo;
import modelo.comandos.comandoscargo.IngresarCargo;
import modelo.comandos.comandoscargo.ListarCargo;

/**
 *
 * @author isak
 */
public class FabricaComandosCargo {

   /**
    * Metodo que devuelve el comando IngresarCargo
    * @param cargo
    * @return IngresarCargo()
    */
   public static IComando CrearComandoSalvarCargo(Cargo cargo)
   {
        return new IngresarCargo(cargo);
   }

      /**
    * Metodo que devuelve el comando EliminarCargo
    * @param cargo
    * @return EliminarCargo()
    */
   public static IComando CrearComandoEliminarCargo(Cargo cargo)
   {
        //throw new UnsupportedOperationException("Selarom: Operacion No SOportada Todavia");
        return new EliminarCargo(cargo);

   }

      /**
    * Metodo que devuelve el comando buscarCargo
    * @param cargo
    * @return EliminarCargo()
    */
  public static IComando CrearComandoBuscarCargo(Cargo cargo)
   {
        return new BuscarCargo(cargo);

   }
   
    /**
    * Metodo que devuelve el comando actualizarCargo
    * @param cargo
    * @return ActualizarCargo()
    */
   public static IComando CrearComandoActualizarCargo(Cargo cargo)
   {
        return new ActualizarCargo(cargo);

   }
       /**
    * Metodo que devuelve el comando buscarCargo
    * @param cargo
    * @return EliminarCargo()
    */
    public static IComando CrearComandoListarCargo()
   {
        return new ListarCargo();

   }
}
