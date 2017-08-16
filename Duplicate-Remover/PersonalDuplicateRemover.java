/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

import java.util.Set;
import java.util.HashSet;

/**
 *
 * @author Wesley
 */
public class PersonalDuplicateRemover implements DuplicateRemover{
    private Set<String> words;
    private int duplicates;
    
    public PersonalDuplicateRemover(){
        this.words = new HashSet<String>();
        this.duplicates = 0;
    }
    
    @Override
    public void add(String characterString){
        if(this.words.contains(characterString)){
            this.duplicates++;
        } else {
            words.add(characterString);
        }
    }
    
    @Override
    public int getNumberOfDetectedDuplicates(){
        return this.duplicates;
    }
    
    @Override
    public Set<String> getUniqueCharacterStrings(){
        return this.words;
    }
    
    @Override
    public void empty(){
        this.words.clear();
        this.duplicates = 0;
    }
}
