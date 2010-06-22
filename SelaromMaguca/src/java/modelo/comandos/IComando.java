/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo.comandos;

import org.hibernate.HibernateException;

/**
 * Interface que define el metodo general de todos los comandos
 * @author isak
 */
public interface IComando
{

    public void ejecutar() throws HibernateException;

}
