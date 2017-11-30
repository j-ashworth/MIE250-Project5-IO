/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package index;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import tokenizer.*;
import score.*;
import io.*;

/**
 *
 * @author JulianAshworth
 */
public class InvertedIndexTest {
    private Tokenizer tk = new IndexingTokenizer();
    private TermScoringFun score = new TFScoringFun();
    private DocSource ds = new FileDocSource("/Users/JulianAshworth/Desktop/Part1/Testing/");
    
    public InvertedIndexTest() {
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
     * Test of buildIndex method, of class InvertedIndex.
     */
    /*
    @Test
    public void testBuildIndex() {
        System.out.println("buildIndex");
        InvertedIndex instance = null;
        instance.buildIndex();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    */

    /**
     * Test of getDocumentFreq method, of class InvertedIndex.
     */
    
    @Test
    public void testGetDocumentFreq() {
        System.out.println("getDocumentFreq");
        String term = "toronto";
        InvertedIndex instance = new InvertedIndex(ds,tk, score);
        int expResult = 1;
        int result = instance.getDocumentFreq(term);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getSortedSearchResults method, of class InvertedIndex.
     */
    /*
    @Test
    public void testGetSortedSearchResults() {
        System.out.println("getSortedSearchResults");
        String query = "";
        InvertedIndex instance = null;
        ArrayList<DocScore> expResult = null;
        ArrayList<DocScore> result = instance.getSortedSearchResults(query);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");

    }
*/
}
