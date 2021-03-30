/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.maventesting;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author mthob
 */
public class computeSquareAreaTest {
    
    public computeSquareAreaTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of add method, of class computeSquareArea.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        int a = 0;
        int b = 0;
        computeSquareArea instance = new computeSquareArea();
        int expResult = 0;
        int result = instance.add(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of computeSqureArea method, of class computeSquareArea.
     */
    @Test
    public void testComputeSqureArea() {
        System.out.println("computeSqureArea");
        double side = 0.0;
        computeSquareArea instance = new computeSquareArea();
        double expResult = 0.0;
        double result = instance.computeSqureArea(side);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
