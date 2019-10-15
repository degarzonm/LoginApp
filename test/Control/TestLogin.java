/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import Entidad.Usuario;
import static UI.FrameP.sistema;
import java.util.ArrayList;


/**
 *
 * @author Estudiante
 */
public class TestLogin {
    
    private static ValidarLogin validar = new ValidarLogin();
    
    private String LONG_NOMBRE_MAL = "longitud de nombre incorrecta";
    private String LONG_PASS_MAL ="longitud contraseña incorrecta";
    private String DATOS_MAL = "datos incorrectos";
    private String USUARIO_AUTORIZADO ="Bienvenido";
    
    
            
    public TestLogin() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
         ArrayList<Usuario> usuarios=new ArrayList<Usuario>();
        
        
        Usuario a = new Usuario();
        Usuario b = new Usuario();
        Usuario c = new Usuario();
        
       a.setNombre("juan");
       a.setPassword("1234");
       b.setNombre("maria");
       b.setPassword("1234");
       c.setNombre("felipe");
       c.setPassword("1234");
       
       usuarios.add(a);
       usuarios.add(b);
       usuarios.add(c);
        
       sistema.setUsuarios(usuarios);
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void testlongitudNombre() {
       Usuario x = new Usuario();
       x.setNombre("E");
       x.setPassword("123456");
       
       assertEquals(validar.verificarLogin(x), LONG_NOMBRE_MAL);
       
       x.setNombre("aurelio");
        assertEquals(validar.verificarLogin(x), LONG_NOMBRE_MAL);
       
     }
     
     @Test
     public void testlongitudPassword() {
       Usuario x = new Usuario();
       x.setNombre("juan");
       x.setPassword("1");
       
       assertEquals(validar.verificarLogin(x), LONG_PASS_MAL);
       
       x.setPassword("1234567");
        assertEquals(validar.verificarLogin(x), LONG_PASS_MAL);
       
     }
     
     @Test
     public void testnNombre() {
       Usuario x = new Usuario();
       x.setNombre("Juan");
       x.setPassword("1234");
       
       assertEquals(validar.verificarLogin(x), DATOS_MAL);
       
     }
     
      @Test
     public void testPass() {
       Usuario x = new Usuario();
       x.setNombre("juan");
       x.setPassword("12345");
       
       assertEquals(validar.verificarLogin(x), DATOS_MAL);
       
     }
     
      @Test
     public void testCorrecto() {
       Usuario x = new Usuario();
       x.setNombre("juan");
       x.setPassword("1234");
       assertEquals(validar.verificarLogin(x), USUARIO_AUTORIZADO);
       
       
       x.setNombre("maria");
       x.setPassword("1234");
       assertEquals(validar.verificarLogin(x), USUARIO_AUTORIZADO);
       
       x.setNombre("felipe");
       x.setPassword("1234");
       assertEquals(validar.verificarLogin(x), USUARIO_AUTORIZADO);
       
     }
}
