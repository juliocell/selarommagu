/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package hibernate.mysql;

//import com.sun.org.apache.bcel.internal.generic.INSTANCEOF;
import hibernate.interfaces.ICargoDAO;
import hibernate.excepciones.SelaromHibernateException;
import beans.Cargo;
import hibernate.HibernateUtil;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;

/**
 *
 * @author isak
 */
public class CargoDAOMysql implements ICargoDAO {

    Session sesion = null;





/**
 * Metodo que sirve para guardar el cargo.
 * @param elCargo
 * @throws HibernateSalvarCargoException
 */
    public void salvarCargo(Cargo cargoASalvar) throws SelaromHibernateException
    {
        try
        {
        sesion = HibernateUtil.getSessionFactory().getCurrentSession();     
        sesion.save(cargoASalvar);

        }catch(HibernateException ex)
        {
            System.out.println("SELAROM: Error al salvar Cargo:" + ex.getMessage());
            throw new SelaromHibernateException();
        }
    }

    public void eliminarCargo(Cargo aBorrar)throws SelaromHibernateException{

       
    try{
            sesion = HibernateUtil.getSessionFactory().getCurrentSession();           
            Cargo aux = (Cargo)sesion.load(Cargo.class,aBorrar.getIdCargo());
            sesion.delete(aux);
            sesion.flush();            
            

        }
        catch(HibernateException ex)
        {
            System.out.println("SELAROM: Error al eliminar Cargo:" + ex.getMessage());
            throw new SelaromHibernateException();
            
        }
       
    }

    public void actualizarCargo(Cargo aActualizar)throws SelaromHibernateException{
        
        sesion = HibernateUtil.getSessionFactory().getCurrentSession();        
        try
        {
            sesion.update(aActualizar);
            sesion.flush();
        }
        catch(HibernateException ex)
        {
            System.out.println("SELAROM: Error al actualizar Cargo:" + ex.getMessage());
            throw new SelaromHibernateException();
        }
    }

    public Cargo buscarCargoPorNombre(String nombre)throws SelaromHibernateException{
        try {

        sesion = HibernateUtil.getSessionFactory().getCurrentSession();
        String elQuery= "from Cargo as c where c.cargoDescripcion = "+ "\'"+nombre+"\'";// armo el query

        List<Cargo> lista= sesion.createQuery(elQuery).list();
        Cargo aux=null;

        for (Cargo cargo : lista) {
            aux = cargo;
        }
        
        return aux;

        } catch (HibernateException ex) {

            System.out.println("SELAROM: Error al Buscar el Cargo:" + ex.getMessage());
            throw new SelaromHibernateException();

        }
    }

    public Cargo buscarCargoPorId(int idcar)throws SelaromHibernateException{
        sesion = HibernateUtil.getSessionFactory().getCurrentSession();
        
        try
        {
            
            Cargo elCargo = (Cargo)sesion.load(Cargo.class, idcar);
            
            return elCargo;
        }
        catch(HibernateException ex){
            
            System.out.println("SELAROM: Error al buscar el Cargo:" + ex.getMessage());
            throw new SelaromHibernateException();
        }
    }

    /**
     * Metodo que devuelve una lista de objectos tipo Cargo
     * @return
     */
    public List<Cargo>  listaCargo() throws SelaromHibernateException
    {
        try
        {

            sesion = HibernateUtil.getSessionFactory().getCurrentSession();
        
            List<Cargo> resultado = (List<Cargo>)sesion.createQuery("from Cargo").list();
             
            return resultado;
            
        } 
        catch(HibernateException ex){

            System.out.println("SELAROM: Error al listar el Cargo:" + ex.getMessage());
            throw new SelaromHibernateException();
        }

    }

  
    

//TODO: modificar las pruebas de nuevo

}


