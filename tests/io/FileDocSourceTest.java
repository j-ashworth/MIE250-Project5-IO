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
public class FileDocSourceTest {
    
    public FileDocSourceTest() {
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
     * Test of getNumDocs method, of class FileDocSource.
     */
    @Test
    public void testGetNumDocs() {
        System.out.println("getNumDocs");
        FileDocSource instance = new FileDocSource("/Users/JulianAshworth/Desktop/Part1/Testing");
        int expResult = 3;
        int result = instance.getNumDocs();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getDoc method, of class FileDocSource.
     */
    @Test
    public void testGetDoc() {
        System.out.println("getDoc");
        int id = 1;
        FileDocSource instance = new FileDocSource("/Users/JulianAshworth/Desktop/Part1/Testing");;
        String expResult = "my dogs name is mona";
        String result = instance.getDoc(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class FileDocSource.
     */

    
}
