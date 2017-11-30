/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package index;

import io.DocSource;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import score.TermScoringFun;
import tokenizer.Tokenizer;

/**
 *
 * @author JulianAshworth
 */
public class IndexTest {
    
    public IndexTest() {
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
     * Test of getTokenizer method, of class Index.
     */
    @Test
    public void testGetTokenizer() {
        System.out.println("getTokenizer");
        Index instance = null;
        Tokenizer expResult = null;
        Tokenizer result = instance.getTokenizer();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDocSource method, of class Index.
     */
    @Test
    public void testGetDocSource() {
        System.out.println("getDocSource");
        Index instance = null;
        DocSource expResult = null;
        DocSource result = instance.getDocSource();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTermScoringFun method, of class Index.
     */
    @Test
    public void testGetTermScoringFun() {
        System.out.println("getTermScoringFun");
        Index instance = null;
        TermScoringFun expResult = null;
        TermScoringFun result = instance.getTermScoringFun();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buildIndex method, of class Index.
     */
    @Test
    public void testBuildIndex() {
        System.out.println("buildIndex");
        Index instance = null;
        instance.buildIndex();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDocumentFreq method, of class Index.
     */
    @Test
    public void testGetDocumentFreq() {
        System.out.println("getDocumentFreq");
        String term = "";
        Index instance = null;
        int expResult = 0;
        int result = instance.getDocumentFreq(term);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSortedSearchResults method, of class Index.
     */
    @Test
    public void testGetSortedSearchResults() {
        System.out.println("getSortedSearchResults");
        String query = "";
        Index instance = null;
        ArrayList<DocScore> expResult = null;
        ArrayList<DocScore> result = instance.getSortedSearchResults(query);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class IndexImpl extends Index {

        public IndexImpl() {
            super(null, null, null);
        }

        public void buildIndex() {
        }

        public int getDocumentFreq(String term) {
            return 0;
        }

        public ArrayList<DocScore> getSortedSearchResults(String query) {
            return null;
        }
    }
    
}
