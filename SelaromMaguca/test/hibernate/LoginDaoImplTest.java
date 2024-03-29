/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package hibernate;

import datos.Cargo;
import datos.Empleado;
import hibernate.excepciones.HibernateLoginException;
import hibernate.excepciones.HibernateSalvarCargoException;
import hibernate.excepciones.HibernateSalvarEmpleadoException;
import hibernate.excepciones.UsuarioNoExisteException;
import java.util.Date;
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
public class LoginDaoImplTest {

    public LoginDaoImplTest() {
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
    public void tearDown()
    {
        
    }

    @Test
    public void buscarUsuarioPorLoginTest() throws UsuarioNoExisteException, HibernateSalvarCargoException, HibernateLoginException, HibernateSalvarEmpleadoException
    {
        
        Cargo car = new Cargo("cargo VERIFICARLOGIN");
        CargoDaoImpl gesCar = new CargoDaoImpl();
        gesCar.salvarCargo(car);
        Empleado emp = new Empleado(car,"felix", "Ledezma", 25689741, "12345", new Date(), "felix", "fele@gmail.com");
        EmpleadoDaoImpl gestionarEmpleado = new EmpleadoDaoImpl();
        gestionarEmpleado.salvarEmpleado(emp);
        LoginDaoImpl gestionarLogin = new LoginDaoImpl();
        String resultado = gestionarLogin.buscarUsuarioPorLogin("usuario", "miclave");
        assertFalse(resultado.isEmpty()); // verifico que la respuesta no sea vacia
        gestionarEmpleado.eliminarEmpleado(emp);
        gesCar.eliminarCargo(car);
        
    }

    @Test
    public void getSesionTest()
    {
        LoginDaoImpl login = new LoginDaoImpl();
        assertNotNull(login.getSesion());
    }

}