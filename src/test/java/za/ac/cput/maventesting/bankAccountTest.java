/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.maventesting;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * @author Lukhanyo Mancede - 217139205[Group 26]
 */
public class bankAccountTest {
    
    public bankAccountTest() {
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
     * Test of getAccount_a method, of class bankAccount.
     */
    @Test
    public void testGetAccount_a() {
        System.out.println("getAccount_a");
        bankAccount instance = new bankAccount();
        String expResult = "";
        String result = instance.getAccount_a();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAccount_b method, of class bankAccount.
     */
    @Test
    public void testSetAccount_b() {
        System.out.println("setAccount_b");
        String account_b = "";
        bankAccount instance = new bankAccount();
        instance.setAccount_b(account_b);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAccount_b method, of class bankAccount.
     */
    @Test
    public void testGetAccount_b() {
        System.out.println("getAccount_b");
        bankAccount instance = new bankAccount();
        String expResult = "";
        String result = instance.getAccount_b();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class bankAccount.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        bankAccount instance = new bankAccount();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
