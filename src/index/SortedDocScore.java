/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package index;
import java.util.TreeSet;


/**
 *
 * @author JulianAshworth 
 *
 */
public class SortedDocScore extends DocScore implements Comparable{
    
    public SortedDocScore(DocScore ds){
        super(ds);
    }
    public SortedDocScore(double score, int doc_id, String content){
        super(score,doc_id,content);
    }
    
    public int compareTo(Object o){
        if(!(o instanceof DocScore)) //if not the same object return 
            return 1;
        
        DocScore ds = (DocScore)o;
        
        if(this._score > (ds._score)) //this comes before object
            return -1;
        if(this._score < (ds._score)) //this comes after object
            return 1; 
        if(!this._content.equals(ds._content)){ //strings are different 
            return this._content.compareTo(ds._content); //return the compare to of strings
        }
        return 0; //objects are equal, passed all other tests 
    }    
    
    public static void main(String[] args){ //testing
        SortedDocScore a = new SortedDocScore(1, 2, "z");
        SortedDocScore b = new SortedDocScore(1, 3, "hello");
        SortedDocScore c = new SortedDocScore(1.1, 3, "hello");
        SortedDocScore d = new SortedDocScore(10, 3, "helloooooo");
        
        TreeSet<DocScore> test = new TreeSet<DocScore>();
        test.add(a);
        test.add(b);
        test.add(c);
        test.add(d);
        System.out.println(test);
       // System.out.println(compareS);
        //TreeSet<DocScore> test = new TreeSet<DocScore>();
            
    }
}

