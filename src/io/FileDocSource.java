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
            BufferedReader fin = new BufferedReader(new FileReader(_files.get(id))); //read in files
            String content;
            while ((content = fin.readLine()) != null){ //read each line until end of file 
                sb.append(content); //append the content to one string 
            }
            fin.close();
        }catch (FileNotFoundException e){ 
            System.out.println("file not found");
        }
        catch(IOException e){
            System.out.println("Couldnt access file");
        }
        return sb.toString();
    }  
    
    public static void main(String[] args){ //testing 
        FileDocSource test = new FileDocSource("/Users/JulianAshworth/Desktop/Part1/awards_1990/awd_1990_00");
        System.out.print(test.getDoc(0));
    }
}
