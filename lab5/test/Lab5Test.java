/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import lab5.Cube;
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
public class Lab5Test {
    
    public Lab5Test() {
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
     public void squareSuccess01() {
     double a = 2;
     double x = 24;
     Cube cube = new Cube(2);
     double g = cube.square();
     Assert.assertEquals(x, g, 0.1);
     }
     
     @Test
     public void vSuccess02() {
        Cube cube = new Cube(2);
     double a = 2;
     double x = 8;
     double g = cube.v();
     Assert.assertEquals(x, g, 0.1);
     }
     
     @Test
     public void LengthSuccess02() {
        Cube cube = new Cube(2);
     double a = 2;
     double x = 3;
     double g = cube.length();
     Assert.assertEquals(x, g, 0.5);
     }
}
