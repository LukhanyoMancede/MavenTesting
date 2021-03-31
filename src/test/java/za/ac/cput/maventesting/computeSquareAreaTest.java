
package za.ac.cput.maventesting;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Timeout;


/**
 *
 * @author Mthobeli Makaluza - 219002851
 */
public class computeSquareAreaTest {
    
    private computeSquareArea sqa1;
    private computeSquareArea sqa2;
    private computeSquareArea sqa3;
    private computeSquareArea sqa4;
   
    
    
    @BeforeEach
    public void setUp() {
        
        sqa1 = new computeSquareArea();
        sqa2 = new computeSquareArea();
        sqa3 = sqa1;
        
    }
    
    /*
    This test will test if the declared methods are equal or not...
    */
    @Test
    void testEquality(){
        /*This test case will fail because area of square with 20 units sides
        is not equal to area of square with 10 units sides....But if we change them both into the same
        unit it should pass
        */
        assertEquals(sqa1.computeSqureArea(20),sqa3.computeSqureArea(10));
    
    }
    @Test
    void testIdentity(){
        /*
        The following test case will pass just only because no parameters are passed
        */
        assertSame(sqa1,sqa3);
    
    }
    
    @AfterEach
    public void tearDown() {
    }

    
    @Test
    public void testAdd() {
        System.out.println("add");
        int a = 0;
        int b = 0;
        computeSquareArea instance = new computeSquareArea();
        int expResult = 0;
        int result = instance.add(a, b);
        assertEquals(expResult, result);
        //This Test is going to automatically fail Even though logically it should pass
        fail("The test case is a will delebaretley fail.");
    }
    /**
     * Test of computeSqureArea method, of class computeSquareArea.
     */
    
    @Test
    @Disabled
    void disableTest(){
        assertTrue(sqa1.computeSqureArea(0) == sqa3.computeSqureArea(0));
        
        /*
        This test will be skipped because it is disabled from being tested by jUnit5
        */
    }

    /**
     *
     */
    @Test()
    void loopTest(){
        sqa4.Loop(20);
    /*
      This was suppose to be my timeout test but my timeout does not work  
     */
    }
    

}
