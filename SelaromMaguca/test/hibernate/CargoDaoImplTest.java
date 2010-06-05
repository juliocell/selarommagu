/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package hibernate;


import hibernate.CargoDaoImpl;
import datos.Cargo;
//import hibernate.HibernateUtil;
import hibernate.Excepciones.HibernateSalvarCargoException;
import hibernate.HibernateUtil;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author isak
 */
public class CargoDaoImplTest {
    Session sesion = null;

    public CargoDaoImplTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of salvarCargo method, of class CargoDaoImpl.
     */


    @Test
    public void testSalvarCargo() throws HibernateSalvarCargoException {
       // inicializarSesion();
        System.out.println("probando salvarCargo");
        Transaction tx = HibernateUtil.getSessionFactory().getCurrentSession().beginTransaction();
        Cargo elCargo = new Cargo(18,"test cajero");
        CargoDaoImpl instance = new CargoDaoImpl();   
        instance.salvarCargo(elCargo);
        Cargo aux =(Cargo)instance.buscarCargoPorNombre("test cajero");            
        assertTrue(elCargo.equal(aux));
        instance.eliminarCargo(elCargo);
      
        //assertTrue(elCargo.equal(elCargo2));
        //TODO: poner unique al campo de nombre de la categoria
       // assertEquals(elCargo2, aux);// comparo con un cargo distinto a ver si sirve

    }

    /**
     * Test of eliminarCargo method, of class CargoDaoImpl.
    */
    @Test
    public void testEliminarCargo() throws HibernateSalvarCargoException {
        System.out.println("probando eliminarCargo");
        Cargo aBorrar =  new Cargo(15, "obrero");
        CargoDaoImpl instance = new CargoDaoImpl();       
        instance.salvarCargo(aBorrar);
        boolean aux =  instance.eliminarCargo(aBorrar);
        assertTrue(aux);
        
    }
     

    /**
     * Test of actualizarCargo method, of class CargoDaoImpl.
    */
    @Test
    public void testActualizarCargo() throws HibernateSalvarCargoException{
        System.out.println("probando actualizarCargo");
        Cargo aActualizar = new Cargo("cargo a actualizar");
        CargoDaoImpl instance = new CargoDaoImpl();      
        instance.salvarCargo(aActualizar);//salvo el cargo
        Cargo aux = (Cargo)instance.buscarCargoPorNombre("cargo a actualizar");
        assertNotNull(aux);//compruebo que sea encontrado el objeto
        aux.setCargoDescripcion("cargo actualizado");
        instance.actualizarCargo(aux);
        Cargo aux2 = (Cargo)instance.buscarCargoPorNombre("cargo actualizado");
        assertNotNull(aux2);//compruebo que sea encontrado el objeto
        assertTrue(aux2.getIdCargo()==aux.getIdCargo());//comparo que el cambio se haya hecho efectivo
        instance.eliminarCargo(aux2);
        instance.eliminarCargo(aux);
        
    }
 //TODO revisar el actualizar da problemas;
    /**
     * Test of buscarCargoPorNombre method, of class CargoDaoImpl.
     */
    @Test
    public void testBuscarCargoPorNombre() throws HibernateSalvarCargoException {
        System.out.println("probando buscarCargoPorNombre");
        CargoDaoImpl instance = new CargoDaoImpl();
        Cargo expResult = new Cargo(100,"objeto prueba");
        instance.salvarCargo(expResult);
        Cargo result = instance.buscarCargoPorNombre("objeto prueba");
        assertTrue(expResult.equal(result));
        instance.eliminarCargo(expResult);
        
    }

    /**
     * Test of listaCargo method, of class CargoDaoImpl.
     */
    @Test
    public void testListaCargo() throws HibernateSalvarCargoException {

        System.out.println("probando listaCargo");
        Cargo car1 = new Cargo("prueba de lista");
        CargoDaoImpl instance = new CargoDaoImpl();
        instance.salvarCargo(car1);        
        List<Cargo> result = instance.listaCargo();
        boolean encontrado = false;
        
        for (Cargo cargo : result)
        {
            if(cargo.equal(car1)) encontrado=true;
            
        }
        assertTrue(encontrado);
     
    }

  /**
     * Test of buscarCargoPorId method, of class CargoDaoImpl.
     */
    @Test
    public void testBuscarCargoPorId() throws HibernateSalvarCargoException {
        System.out.println("probando buscarCargoPorId");
        CargoDaoImpl instance = new CargoDaoImpl();
        Cargo expResult = new Cargo(100,"objeto prueba");
        instance.salvarCargo(expResult);
        Cargo result = instance.buscarCargoPorId(expResult.getIdCargo());
        assertNotNull(result);
        instance.eliminarCargo(result);
        
        //TODO REvisar el metodo pues ya no se guarda el objeto con el id que le doy

    }



}