/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package hibernate.excepciones;

/**
 *
 * @author william
 */
public class ErrorFormatoFechaException extends Exception{

   private String mensaje;

   public ErrorFormatoFechaException(String msj) {
       this.mensaje = msj;
       System.out.println("Mensaje del Exception generado: " + mensaje);
   }

    /**
     * @return the mensaje
     */
    public String getMensaje() {
        return mensaje;
    }


}
