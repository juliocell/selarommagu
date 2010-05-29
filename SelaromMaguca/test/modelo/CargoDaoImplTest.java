/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo;

import ControladorBaseDatos.ProductoCategoria;
import datos.Cargo;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import probador.ProbarHibernate;
import static org.junit.Assert.*;

/**
 *
 * @author isak
 */
public class CargoDaoImplTest {

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
    public void testSalvarCargo() {
        System.out.println("probando salvarCargo");        
        Cargo elCargo = new Cargo(18,"test cajero");
        CargoDaoImpl instance = new CargoDaoImpl();
        probador.ProbarHibernate pro = new ProbarHibernate();
        pro.asociarSession();
        instance.salvarCargo(elCargo,pro);
        Cargo aux =(Cargo)instance.buscarCargoPorNombre("test cajero",pro);
        Cargo elCargo2 = new Cargo(64,"cajero");        
        assertTrue(elCargo.equal(aux));
        //assertTrue(elCargo.equal(elCargo2));
        //TODO: poner unique al campo de nombre de la categoria
       // assertEquals(elCargo2, aux);// comparo con un cargo distinto a ver si sirve

    }

    /**
     * Test of eliminarCargo method, of class CargoDaoImpl.
    */
    @Test
    public void testEliminarCargo() {
        System.out.println("eliminarCargo");
        Cargo aBorrar =  new Cargo(15, "obrero");
        CargoDaoImpl instance = new CargoDaoImpl();
        probador.ProbarHibernate pro = new ProbarHibernate();
        pro.asociarSession();
        instance.salvarCargo(aBorrar, pro);
        boolean aux =  instance.eliminarCargo(aBorrar);
        assertTrue(aux);
        
//TODO: hacer las pruebas de actualizar, buscar y listarCargo

    }
     

    /**
     * Test of actualizarCargo method, of class CargoDaoImpl.
    
    @Test
    public void testActualizarCargo() {
        System.out.println("actualizarCargo");
        Cargo aActualizar = null;
        CargoDaoImpl instance = new CargoDaoImpl();
        instance.actualizarCargo(aActualizar);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
 */
    /**
     * Test of buscarCargoPorNombre method, of class CargoDaoImpl.
    
    @Test
    public void testBuscarCargoPorNombre() {
        System.out.println("buscarCargoPorNombre");
        int nombre = 25;
        CargoDaoImpl instance = new CargoDaoImpl();
        Cargo expResult = null;
        Cargo result = instance.buscarCargoPorNombre("nombre",new ProbarHibernate());
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
 */
    /**
     * Test of listaCargo method, of class CargoDaoImpl.
    
    @Test
    public void testListaCargo() {
        System.out.println("listaCargo");
        CargoDaoImpl instance = new CargoDaoImpl();
        List expResult = null;
        List result = instance.listaCargo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    } */

}