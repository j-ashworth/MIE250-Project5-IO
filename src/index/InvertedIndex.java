/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package index;

import io.*;
import java.util.*;
import score.TermScoringFun;
import tokenizer.*;
      
/**
 *
 * @author JulianAshworth
 */
public class InvertedIndex extends Index{
    
    private HashMap<String,HashMap<Integer,Integer>> _index = new HashMap<String,HashMap<Integer,Integer>>();
    private HashMap<String,Integer> _docFreq = new HashMap<String,Integer>();
    
    public InvertedIndex(DocSource doc_source, Tokenizer tokenizer, TermScoringFun scoring){
        super(doc_source,tokenizer,scoring);
    }
    
    public void buildIndex() {
        ArrayList<String> tokens = new ArrayList<String>();
        for(int i = 0; i < _docSource.getNumDocs() ; i++){
            tokens.addAll(_tokenizer.tokenize(_docSource.getDoc(i))); //build tolenizer for current doc 
            for(String s : tokens){
                if(!_index.containsKey(s)){ //if index does not contain the token 
                    _index.put(s, new HashMap<Integer,Integer>()); //make a new mapping to the current doc
                    _index.get(s).put(i, 1); //make tf frequency one
                    _docFreq.put(s, 1); //make frequency one in doc freq member
                }
                else{//index contains s
                    if(_index.get(s).get(i)==null){ //contains s, but has no mapping to current docuemnt
                        _index.get(s).put(i,1); //make tf freq one 
                        _docFreq.put(s,_docFreq.get(s)+1); //increase doc freq by 1
                    } 
                    else{//contains s, is already mapped ot current document, increase freq by 1 
                        int freq = _index.get(s).get(i);
                        _index.get(s).put(i,freq+1); //increase tf by 1
                    }
                }
            }
            tokens.clear(); //we've iterated through all tokens on this document, clear for next document 
        }
    }
    
    public int getDocumentFreq(String term){
        return _docFreq.get(term);
    }
   
    public ArrayList<DocScore> getSortedSearchResults(String query){

        HashMap<Integer, Double> scoreMap = new HashMap<Integer, Double>();
        ArrayList<String> tokens = new ArrayList<String>(_tokenizer.tokenize(query));
        TreeSet<DocScore> docScoresTS = new TreeSet<DocScore>();
        
        for(int i = 0 ; i < _docSource.getNumDocs(); i++){
            for(String term : tokens){
                if (_index.containsKey(term) && _index.get(term).containsKey(i)) {
                    double score = _scoring.scoreToken(term, _index.get(term).get(i));
                    if (score > 0) {
                        if (scoreMap.get(i) == null){ //no score for current document
                            scoreMap.put(i, _scoring.scoreToken(term, _index.get(term).get(i))); //set score
                        } 
                        else { //document has a score, update it 
                            double newScore = scoreMap.get(i) + _scoring.scoreToken(term, _index.get(term).get(i));
                            scoreMap.put(i, newScore); //update score , new equals old plus current score 
                        }
                    }
                }
            }
        }
        for(Integer docId : scoreMap.keySet()){ //add each element in score map to a sorted doc score 
            docScoresTS.add(new SortedDocScore(scoreMap.get(docId),docId,_docSource.getDoc(docId)));
        }
        return new ArrayList<DocScore>(docScoresTS); //return as an arraylist, already sorted 
    }
    
     public static void main(String[] args){
         //System.out.println(getDocumentFreqTest("toronto"));
         //System.out.println(getDocumentFreqTest("molecular"));
         //buildIndexTest();
     }
}





















