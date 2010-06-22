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
interface IFabrica {

    public IngresarCargo CrearComandoIngresar(Cargo cargo);
}
