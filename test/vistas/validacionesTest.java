/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Alumnos
 */
public class validacionesTest {

    public validacionesTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of isNumber method, of class validaciones.
     */
    @Test
    public void testIsNumber() {
        System.out.println("isNumber");
        String n = "8";
        boolean expResult = true;
        boolean result = validaciones.isNumber(n);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of isNumber method, of class validaciones.
     */
    @Test
    public void testIsNumber2() {
        System.out.println("isNumber");
        String n = "";
        boolean expResult = false;
        boolean result = validaciones.isNumber(n);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    /**
     * Test of isFloat method, of class validaciones.
     */
    @Test
    public void testIsFloat() {
        System.out.println("isFloat");
        String n = "2.6";
        boolean expResult = true;
        boolean result = validaciones.isFloat(n);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of isFloat method, of class validaciones.
     */
    @Test//(expected = NumberFormatException.class)
    public void testIsFloat2() {
        System.out.println("isFloat");
        String n = "jj";
        boolean expResult = false;
        boolean result = validaciones.isFloat(n);
        assertEquals(expResult, result);
    }

    /**
     * Test of isFloat method, of class validaciones.
     */
    @Test
    public void testIsFloat3() {
        System.out.println("isFloat");
        String n = "";
        boolean expResult = false;
        boolean result = validaciones.isFloat(n);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of isEmail method, of class validaciones.
     */
    @Test
    public void testIsEmail() {
        System.out.println("isEmail");
        String n = "leo@gmail.com";
        boolean expResult = true;
        boolean result = validaciones.isEmail(n);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of isEmpty method, of class validaciones.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        String n = "";
        boolean expResult = true;
        boolean result = validaciones.isEmpty(n);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of isEmpty method, of class validaciones.
     */
    @Test
    public void testIsEmpty2() {
        System.out.println("isEmpty");
        String n = "aaa";
        boolean expResult = false;
        boolean result = validaciones.isEmpty(n);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

     /**
     * Test of isEmpty method, of class validaciones.
     */
    @Test
    public void testIsEmpty3() {
        System.out.println("isEmpty");
        String n = " ";
        boolean expResult = true;
        boolean result = validaciones.isEmpty(n);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    /**
     * Test of isString method, of class validaciones.
     */
    @Test
    public void testIsString() {
        System.out.println("isString");
        String n = "LLLLL";
        boolean expResult = true;
        boolean result = validaciones.isString(n);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testIsString1() {
        System.out.println("isString");
        String n = "";
        boolean expResult = false;
        boolean result = validaciones.isString(n);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testIsString2() {
        System.out.println("isString");
        String n = "!";
        boolean expResult = false;
        boolean result = validaciones.isString(n);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testIsString3() {
        System.out.println("isString");
        String n = "#";
        boolean expResult = false;
        boolean result = validaciones.isString(n);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testIsString4() {
        System.out.println("isString");
        String n = "$";
        boolean expResult = false;
        boolean result = validaciones.isString(n);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testIsString5() {
        System.out.println("isString");
        String n = "%";
        boolean expResult = false;
        boolean result = validaciones.isString(n);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testIsString6() {
        System.out.println("isString");
        String n = "&";
        boolean expResult = false;
        boolean result = validaciones.isString(n);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testIsString7() {
        System.out.println("isString");
        String n = "*";
        boolean expResult = false;
        boolean result = validaciones.isString(n);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testIsString8() {
        System.out.println("isString");
        String n = "/";
        boolean expResult = false;
        boolean result = validaciones.isString(n);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testIsString9() {
        System.out.println("isString");
        String n = "=";
        boolean expResult = false;
        boolean result = validaciones.isString(n);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testIsString10() {
        System.out.println("isString");
        String n = "?";
        boolean expResult = false;
        boolean result = validaciones.isString(n);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testIsString11() {
        System.out.println("isString");
        String n = "¡";
        boolean expResult = false;
        boolean result = validaciones.isString(n);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testIsString12() {
        System.out.println("isString");
        String n = "123";
        boolean expResult = false;
        boolean result = validaciones.isString(n);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}
