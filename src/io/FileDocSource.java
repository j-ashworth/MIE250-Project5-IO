/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io;
import java.util.*;
import java.io.*;


/**
 *
 * @author JulianAshworth
 */
public class FileDocSource extends DocSource {
    private ArrayList<File> _files = new ArrayList<File>();
    
    public FileDocSource(String s){
        for(File f : FileFinder.GetAllFiles(s)){
            _files.add(f);
        }
    }
    public int getNumDocs(){ 
        return _files.size();
    }
    public String getDoc(int id) {
        StringBuilder sb = new StringBuilder();
        try{
            BufferedReader fin = new BufferedReader(new FileReader(_files.get(id)));
            String content;
            while ((content = fin.readLine()) != null) {
                sb.append(content);
            }
            fin.close();
        }catch (Exception e){
            System.out.println("error reading file");
        }
        return sb.toString();
    }  
    
    public static void main(String[] args){
        FileDocSource test = new FileDocSource("/Users/JulianAshworth/Desktop/Part1/awards_1990/awd_1990_00");
        System.out.print(test.getDoc(0));
    }
}
