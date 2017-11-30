/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package index;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author JulianAshworth
 */
public class SortedDocScoreTest {
    
    public SortedDocScoreTest() {
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
     * Test of compareTo method, of class SortedDocScore.
     */
    @Test
    public void testCompareToOne() {
        System.out.println("compareTo");
        Object o = new SortedDocScore(3,2,"ok"); //larger score
        SortedDocScore instance = new SortedDocScore(1,2,"ok");//smaller score
        int expResult = 1; //thus compare to should return 1
        int result = instance.compareTo(o);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    /**
     * Test of compareTo method, of class SortedDocScore.
     */
    @Test
    public void testCompareToTwo() {
        System.out.println("compareTo");
        Object o = new SortedDocScore(0.7,2,"ok"); //smaller score
        SortedDocScore instance = new SortedDocScore(1,2,"ok");//larger score
        int expResult = -1; //thus compare to should return -1
        int result = instance.compareTo(o);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    
}
