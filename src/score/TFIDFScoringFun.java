/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package score;
import index.*;
import java.lang.Math;

/**
 *
 * @author JulianAshworth
 */
public class TFIDFScoringFun implements TermScoringFun{
    private double numDocs;
    private Index index;
    
    public void init(Index s){
        numDocs = s.getDocSource().getNumDocs();
        index = s;
    }
    public double scoreToken(String term, int freq){
        double score = 0;
        try { //run formula for the scoring
            score = Math.log10(1.0 + (double)freq)*Math.log10((double)numDocs/(double)index.getDocumentFreq(term));
        } catch (ArithmeticException ex){
            System.out.println("bad log");
        }
        return score;
    }
}
