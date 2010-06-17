/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package hibernate.excepciones;

/**
 *
 * @author william
 */
public class HibernateSalvarEmpleadoException extends Exception {

     String msj=null;

    public HibernateSalvarEmpleadoException(String message) {
        this.msj= "EXCEPCION DE HIBERNATE AL SALVAR EL CARGO: MENSAJE DE LA EXC = " + message;
        System.out.println(msj);
    }

    public String getMsj() {
        return msj;
    }

}
