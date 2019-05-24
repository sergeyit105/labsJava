/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import lab4.Lab4;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 1710515
 */
public class Lab4Test {
    
    public Lab4Test() {
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

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void checkSuccess01() {
        double x = 20;
        int r = 23;
        int g = Lab4.check(20);
        Assert.assertEquals(r, g);
    
    }
      @Test
    public void checkSuccess02() {
        double x = 25;
        int r = 2;
        int g = Lab4.check(25);
        Assert.assertEquals(r, g);
    
    }
          @Test
    public void checkCrash01() {
        double x = 24;
        int r = 27;
        int g = Lab4.check(24);
        Assert.assertEquals(r, g);
    
    }
}
