/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io;

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
public class StaticDocSourceTest {
    
    public StaticDocSourceTest() {
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
     * Test of getNumDocs method, of class StaticDocSource.
     */
    @Test
    public void testGetNumDocs() {
        System.out.println("getNumDocs");
        StaticDocSource instance = new StaticDocSource();
        int expResult = 10;
        int result = instance.getNumDocs();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getDoc method, of class StaticDocSource.
     */
    @Test
    public void testGetDoc() {
        System.out.println("getDoc");
        int id = 0;
        StaticDocSource instance = new StaticDocSource();
        String expResult = "Qualcomm draws up plans to rebuff Broadcom's $103 billion offer: sources";
        String result = instance.getDoc(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
