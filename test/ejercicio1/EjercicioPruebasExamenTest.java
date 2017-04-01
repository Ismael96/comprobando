/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author user
 */
public class EjercicioPruebasExamenTest {

    public EjercicioPruebasExamenTest() {
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
     * Test of sumarHasta method, of class EjercicioPruebasExamen.
     */
    @Test
    public void testSumarHasta() {
        try {
            System.out.println("sumarHasta");
            int numero_tope = 60;
            int expResult = 0;
            int result = EjercicioPruebasExamen.sumarHasta(numero_tope);
            assertEquals(expResult, result);
        } catch (Exception e) {

            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of masaCorporal method, of class EjercicioPruebasExamen.
     */
    @Test
    public void testMasaCorporal() {
        try {
            System.out.println("masaCorporal");
            double peso = 80;
            double altura_metros = 1.8;
            int expResult = 0;
            int result = EjercicioPruebasExamen.masaCorporal(peso, altura_metros);
            assertEquals(expResult, result);
        } catch (Exception e2) {
            // TODO review the generated test code and remove the default call to fail.
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of calcularSegundos method, of class EjercicioPruebasExamen.
     */
    @Test
    public void testCalcularSegundos() {
        try {
            System.out.println("calcularSegundos");
            int horas = 2;
            int minutos = 26;
            int segundos = 200;
            int expResult = 0;
            int result = EjercicioPruebasExamen.calcularSegundos(horas, minutos, segundos);
            assertEquals(expResult, result);
        } catch (Exception e3) {
            // TODO review the generated test code and remove the default call to fail.
            fail("The test case is a prototype.");
        }
    }
}
