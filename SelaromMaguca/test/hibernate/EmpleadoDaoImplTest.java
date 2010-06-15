/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package hibernate;

import hibernate.excepciones.HibernateSalvarCargoException;
import datos.Cargo;
import datos.Empleado;
import java.util.Date;
import java.util.List;
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
public class EmpleadoDaoImplTest {

    public EmpleadoDaoImplTest() {
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

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    @Test
    public void testSalvarEmpleado() throws HibernateSalvarCargoException{
        Transaction tx = HibernateUtil.getSessionFactory().getCurrentSession().beginTransaction();
        System.out.println("probando salvarEmpleado");       
        Cargo car = new Cargo("cargo para empleado");
        CargoDaoImpl gesCar = new CargoDaoImpl();
        gesCar.salvarCargo(car);
        Empleado empleado = new Empleado(car, "felix", "Ledezma", 25689741, "miclave", new Date(), "usuario", "fele@gmail.com");
        EmpleadoDaoImpl instance = new EmpleadoDaoImpl();
        instance.salvarEmpleado(empleado);
        Empleado aux =(Empleado)instance.buscarEmpleadoPorNombre("felix");
        assertTrue(empleado.equal(aux));
        instance.eliminarEmpleado(empleado);
    }

    @Test
    public void testActualizarEmpleado() throws HibernateSalvarCargoException{
        System.out.println("probando actualizarEmpleado");
        //Transaction tx = HibernateUtil.getSessionFactory().getCurrentSession().beginTransaction();
        Cargo car = new Cargo("cargo para ACtualizar empleado");
        CargoDaoImpl gesCar = new CargoDaoImpl();
        gesCar.salvarCargo(car);
        Empleado aActualizar = new Empleado(car,"felix", "Ledezma", 25689741, "miclave", new Date(), "usuario", "fele@gmail.com");
        EmpleadoDaoImpl instance = new EmpleadoDaoImpl();
        instance.salvarEmpleado(aActualizar);//salvo el cargo
        Empleado aux = (Empleado)instance.buscarEmpleadoPorNombre("felix");
        assertNotNull(aux);//compruebo que sea encontrado el objeto
        aux.setEmpleadosNombre("FeLiXeW");
        instance.actualizarEmpleado(aux);
        Empleado aux2 = (Empleado)instance.buscarEmpleadoPorNombre("FeLiXeW");
        assertNotNull(aux2);//compruebo que sea encontrado el objeto
        assertTrue(aux2.getEmpleadosNombre().equalsIgnoreCase(aux.getEmpleadosNombre()));//comparo que el cambio se haya hecho efectivo
        instance.eliminarEmpleado(aux2);        
    }

    @Test
    public void testEliminarEmpleado() throws HibernateSalvarCargoException{
        System.out.println("probando eliminarEmpleado");
        Cargo car = new Cargo("cargo para empleado");
        CargoDaoImpl gesCar = new CargoDaoImpl();
        gesCar.salvarCargo(car);
        Empleado aBorrar =  new Empleado(car, "felix", "Ledezma", 25689741, "miclave", new Date(), "usuario", "fele@gmail.com");
        EmpleadoDaoImpl instance = new EmpleadoDaoImpl();
        instance.salvarEmpleado(aBorrar);
        boolean aux = instance.eliminarEmpleado(aBorrar);
        assertTrue(aux);
    }

    @Test
    public void testBuscarEmpleadoPorNombre() throws HibernateSalvarCargoException
    {
        System.out.println("probando buscarEmpleadoPorNombre");
        EmpleadoDaoImpl instance = new EmpleadoDaoImpl();
        Cargo car = new Cargo("cargo para empleado");
        CargoDaoImpl gesCar = new CargoDaoImpl();
        gesCar.salvarCargo(car);
        Empleado expResult = new Empleado(car, "felix333", "Ledezma", 25689741, "miclave", new Date(), "usuario", "fele@gmail.com");
        instance.salvarEmpleado(expResult);
        Empleado result = instance.buscarEmpleadoPorNombre("felix333");
        assertTrue(expResult.equal(result));
        instance.eliminarEmpleado(expResult);
    }

    @Test
    public void testBuscarEmpleadoPorId() throws HibernateSalvarCargoException{
        System.out.println("probando testBuscarEmpleadoPorId");
        EmpleadoDaoImpl instance = new EmpleadoDaoImpl();
        Cargo car = new Cargo("cargo para empleado");
        CargoDaoImpl gesCar = new CargoDaoImpl();
        gesCar.salvarCargo(car);
        Empleado expResult = new Empleado(car, "felix333", "Ledezma", 25689741, "miclave", new Date(), "usuario", "fele@gmail.com");
        instance.salvarEmpleado(expResult);
        Empleado result = instance.buscarEmpleadoPorId(expResult.getidEmpleado());
        assertNotNull(result);
        assertTrue(result.equal(expResult));
        instance.eliminarEmpleado(result);

    }

    @Test
    public void testListaEmpleado() throws HibernateSalvarCargoException{
        System.out.println("probando testListaEmpleado");
        Cargo car = new Cargo("cargo para empleado");
        CargoDaoImpl gesCar = new CargoDaoImpl();
        gesCar.salvarCargo(car);
        Empleado car1 = new Empleado(car, "felix333", "Ledezma", 25689741, "miclave", new Date(), "usuario", "fele@gmail.com");
        EmpleadoDaoImpl instance = new EmpleadoDaoImpl();
        instance.salvarEmpleado(car1);
        List<Empleado> result = instance.listaEmpleado();
        boolean encontrado = false;

        for (Empleado empleado : result)
        {
            if(empleado.equal(car1)) encontrado=true;

        }
        assertTrue(encontrado);

    }


}