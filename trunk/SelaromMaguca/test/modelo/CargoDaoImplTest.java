/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo;


import hibernate.CargoDaoImpl;
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
            
        assertTrue(elCargo.equal(aux));
        instance.eliminarCargo(elCargo, pro);
      
        //assertTrue(elCargo.equal(elCargo2));
        //TODO: poner unique al campo de nombre de la categoria
       // assertEquals(elCargo2, aux);// comparo con un cargo distinto a ver si sirve

    }

    /**
     * Test of eliminarCargo method, of class CargoDaoImpl.
    */
    @Test
    public void testEliminarCargo() {
        System.out.println("probando eliminarCargo");
        Cargo aBorrar =  new Cargo(15, "obrero");
        CargoDaoImpl instance = new CargoDaoImpl();
        probador.ProbarHibernate pro = new ProbarHibernate();
        pro.asociarSession();
        instance.salvarCargo(aBorrar, pro);
        boolean aux =  instance.eliminarCargo(aBorrar, pro);
        assertTrue(aux);
        
    }
     

    /**
     * Test of actualizarCargo method, of class CargoDaoImpl.
    */
    @Test
    public void testActualizarCargo(){
        System.out.println("probando actualizarCargo");
        Cargo aActualizar = new Cargo("cargo a actualizar");
        CargoDaoImpl instance = new CargoDaoImpl();
        probador.ProbarHibernate pro = new ProbarHibernate();
        pro.asociarSession();
        instance.salvarCargo(aActualizar,pro);//salvo el cargo
        Cargo aux = (Cargo)instance.buscarCargoPorNombre("cargo a actualizar" , pro);
        assertNotNull(aux);//compruebo que sea encontrado el objeto
        aux.setCargoDescripcion("cargo actualizado");
        instance.actualizarCargo(aux, pro);
        Cargo aux2 = (Cargo)instance.buscarCargoPorNombre("cargo actualizado", pro);
        assertNotNull(aux2);//compruebo que sea encontrado el objeto
        assertTrue(aux2.getIdCargo()==aux.getIdCargo());//comparo que el cambio se haya hecho efectivo
        instance.eliminarCargo(aux2, pro);
        instance.eliminarCargo(aux, pro);
        
    }
 //TODO revisar el actualizar da problemas;
    /**
     * Test of buscarCargoPorNombre method, of class CargoDaoImpl.
     */
    @Test
    public void testBuscarCargoPorNombre() {
        System.out.println("probando buscarCargoPorNombre");
        probador.ProbarHibernate pro = new ProbarHibernate();
        pro.asociarSession();
        CargoDaoImpl instance = new CargoDaoImpl();
        Cargo expResult = new Cargo(100,"objeto prueba");
        instance.salvarCargo(expResult, pro);
        Cargo result = instance.buscarCargoPorNombre("objeto prueba",pro);
        assertTrue(expResult.equal(result));
        instance.eliminarCargo(expResult, pro);
        
    }

    /**
     * Test of listaCargo method, of class CargoDaoImpl.
     */
    @Test
    public void testListaCargo() {

        System.out.println("probando listaCargo");
        Cargo car1 = new Cargo(500, "car1");
        Cargo car2 = new Cargo(600, "car2");
        Cargo car3 = new Cargo(700, "car3");
        probador.ProbarHibernate pro = new ProbarHibernate();
        pro.asociarSession();
        CargoDaoImpl instance = new CargoDaoImpl();
        instance.salvarCargo(car1, pro);
        instance.salvarCargo(car2, pro);
        instance.salvarCargo(car3, pro);
        List<Cargo> result = instance.listaCargo(pro);
        int x=0;
        Cargo arreglo[]= new Cargo[3];
        for (Cargo cargo : result) {
            arreglo[x]=cargo;
            x++;
        }
        assertTrue(arreglo[0].equal(car1));
        assertTrue(arreglo[1].equal(car2));
        assertTrue(arreglo[2].equal(car3));
        instance.eliminarCargo(car1, pro);
        instance.eliminarCargo(car2, pro);
        instance.eliminarCargo(car3, pro);
     //TODO revisar la lista pues da problemas de antes del otro metodo no se borra el asiento
    }

  /**
     * Test of buscarCargoPorId method, of class CargoDaoImpl.
     */
    @Test
    public void testBuscarCargoPorId() {
        System.out.println("probando buscarCargoPorNombre");
        probador.ProbarHibernate pro = new ProbarHibernate();
        pro.asociarSession();
        CargoDaoImpl instance = new CargoDaoImpl();
        Cargo expResult = new Cargo(100,"objeto prueba");
        instance.salvarCargo(expResult, pro);
        Cargo result = instance.buscarCargoPorId(100,pro);
        assertTrue(expResult.equal(result));
        instance.eliminarCargo(result, pro);
        //TODO REvisar el metodo pues ya no se guarda el objeto con el id que le doy
    }



}