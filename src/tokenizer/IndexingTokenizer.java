/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tokenizer;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import io.*;

/**
 *
 * @author JulianAshworth
 */
public class IndexingTokenizer implements Tokenizer {
    
    public IndexingTokenizer(){  
    }
    
    public ArrayList<String> tokenize(String s){
        
        ArrayList<String> ret = new ArrayList<String>();
        Pattern p = Pattern.compile("(\\w-*)+");
        Matcher m = p.matcher(s);
        while(m.find()){
            ret.add(m.group().toLowerCase());
        }
        return ret;
    }
    
    public TreeSet<String> treeToken(ArrayList<String> arr){
        TreeSet<String> a = new TreeSet<String>(arr);
        return a;
    }
    
    //testing!!
    public static void main(String[] args) throws Exception{
        IndexingTokenizer i = new IndexingTokenizer();
        String s = "SoftBank is buying a chunk of Uber and it's state-of-the-art Taxi-hailing system for $10 billion the the the";
        //System.out.println(i.tokenize(s));
        //System.out.println(i.treeToken(i.tokenize(s)));
        FileDocSource files = new FileDocSource("/Users/JulianAshworth/Desktop/Part1/awards_1990/awd_1990_00");
        System.out.println(i.tokenize(files.getDoc(0)));
    }
}
