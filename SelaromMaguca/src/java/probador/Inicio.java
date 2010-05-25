/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package probador;

import datos.Cargo;
import org.hibernate.Session;

/**
 *
 * @author isak
 */
public class Inicio {

    public static void main(String Args[])
    {
        ProbarHibernate laSession = new ProbarHibernate();
        laSession.asociarSession();
        Session sesion = laSession.getSessionFactory().getCurrentSession();
        sesion.beginTransaction();//comienzo la transaccion
        Cargo cargo = new Cargo(1, "Cajero");
        Cargo cargo1 = new Cargo(2, "Gerente");
        Cargo cargo2 = new Cargo(3, "Administrador");
        sesion.save(cargo);//salvo un cargo
        sesion.save(cargo1);
        sesion.save(cargo2);
        sesion.getTransaction().commit();
        
        
//TODO: terminar la prueba de hibernate para salvar y buscar un empleado y una categoria
    }
}
