/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo;

import datos.Cargo;
import modelo.comandos.IngresarCargo;

/**
 *
 * @author isak
 */
public class FabricaComandosCargo implements IFabrica{

   /**
    * Metodo que devuelve el comando IngresarCargo
    * @param cargo
    * @return IngresarCargo()
    */
   public IngresarCargo CrearComandoIngresar(Cargo cargo)
   {
        return new IngresarCargo(cargo);
   }



}
