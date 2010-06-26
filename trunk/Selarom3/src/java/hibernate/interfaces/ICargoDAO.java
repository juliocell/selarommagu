/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package hibernate.interfaces;

import beans.Cargo;
import hibernate.excepciones.SelaromHibernateException;
import java.util.List;

/**
 *
 * @author isak
 */
public interface ICargoDAO {

     /**
     * Metodo que persiste en bd a un objeto tipo Cargo
     * @return
     */
   public  void salvarCargo(Cargo elCargo)throws SelaromHibernateException;

   /**
     * Metodo que actualizar en bd a un objeto tipo Cargo
     * @return
     */
   public void actualizarCargo(Cargo aActualizar)throws SelaromHibernateException;

   /**
     * Metodo que busca en bd a un objeto Cargo por ID
     * @return
     */
   public Cargo buscarCargoPorId(int idcar)throws SelaromHibernateException;

   /**
     * Metodo que busca en bd a un objeto Cargo por NOMBRE
     * @return
     */
   public Cargo buscarCargoPorNombre(String nombre)throws SelaromHibernateException;

   /**
     * Metodo que persiste en bd a un objeto tipo Cargo
     * @return
     */
   public  void eliminarCargo(Cargo aBorrar)throws SelaromHibernateException;

    
    /**
     * Metodo que devuelve una lista de objetos tipo Cargo
     * @return
     */
   public List<Cargo> listaCargo()throws SelaromHibernateException;

 

  

}
