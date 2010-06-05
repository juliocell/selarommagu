/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package hibernate;

import datos.Cargo;
import datos.Empleado;
import hibernate.Excepciones.HibernateLoginException;
import hibernate.Excepciones.HibernateSalvarCargoException;
import hibernate.Excepciones.UsuarioNoExisteException;
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
    public void buscarUsuarioPorLoginTest() throws UsuarioNoExisteException, HibernateSalvarCargoException, HibernateLoginException
    {   Transaction tx = HibernateUtil.getSessionFactory().getCurrentSession().beginTransaction();
        Cargo car = new Cargo("cargo VERIFICARLOGIN");
        CargoDaoImpl gesCar = new CargoDaoImpl();
        gesCar.salvarCargo(car);
        Empleado emp = new Empleado(car,"felix", "Ledezma", 25689741, "miclave", new Date(), "usuario", "fele@gmail.com");
        EmpleadoDaoImpl gestionarEmpleado = new EmpleadoDaoImpl();
        gestionarEmpleado.salvarEmpleado(emp);
        LoginDaoImpl gestionarLogin = new LoginDaoImpl();
        String resultado = gestionarLogin.buscarUsuarioPorLogin("usuario", "miclave");
        assertFalse(resultado.isEmpty()); // verifico que la respuesta no sea vacia
        
    }

    @Test
    public void getSesionTest()
    {
        LoginDaoImpl login = new LoginDaoImpl();
        assertNotNull(login.getSesion());
    }

}