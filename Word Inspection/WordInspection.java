/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wordinspection;

import java.io.File;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author Wesley
 */
public class WordInspection {
    private File file;
    private Scanner reader;
    
    public WordInspection(File file){
        this.file = file;   
    }
    
    private boolean openFile(){
        //Instead of reading in this file multiple times try storing it as a 
        //list instead that can be searched.
        try{
            this.reader = new Scanner(this.file);
        } catch (Exception e){
            return false;
        }
        
        return true;
    }
    
    public int wordCount(){
        if(!openFile()){
            return 0;
        }
        
        int wordCount = 0;
        
        //Only 1 word per line in file
        while(reader.hasNextLine()){
            String word = reader.nextLine();
            wordCount++;
        }
        
        return wordCount;
    }
    
    public List<String> wordsContainingZ(){
        List<String> list = new ArrayList<String>();
        
        if(!openFile()){
            return list;
        }
        
        while(reader.hasNextLine()){
            String word = reader.nextLine();
            if(word.contains("z")){
                list.add(word);
            }
        }
        
        return list;
    }
    
    public List<String> wordsEndingInL(){
        List<String> list = new ArrayList<String>();
        
        if(!openFile()){
            return list;
        }
        
        while(reader.hasNextLine()){
            String word = reader.nextLine();
            char last = word.charAt(word.length() - 1);
            if(last == 'l'){
                list.add(word);
            }
        }
        
        return list;
    }
    
    public List<String> palindromes(){
        List<String> list = new ArrayList<String>();
        
        if(!openFile()){
            return list;
        }
        
        while(reader.hasNextLine()){
            String word = reader.nextLine();
            if(isPalindrome(word)){
                list.add(word);
            }
        }
        return list;       
    }
    
    private boolean isPalindrome(String word){
        int n = word.length();
        for(int i = 0; i < n; i++){
            if(word.charAt(i) != word.charAt(n-i-1)){
                return false;
            }
        }
        return true;
    }
    
    public List<String> wordsWhichContainAllVowels(){
        List<String> list = new ArrayList<String>();
        
        if(!openFile()){
            return list;
        }
        
        while(reader.hasNextLine()){
            String word = reader.nextLine();
            if(allVowels(word)){
                list.add(word);
            }
        }       
        return list;
    }
    
    private boolean allVowels(String word){
        if((word.contains("a")) &&
           (word.contains("e")) &&
           (word.contains("i")) &&
           (word.contains("o")) &&     
           (word.contains("u")) &&
           (word.contains("y")) &&
           (word.contains("ä")) &&
           (word.contains("ö"))) {
                return true;
        }
        return false;    
    }
}
