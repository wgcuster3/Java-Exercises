/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reader.criteria;

/**
 *
 * @author Wesley
 */
public class EndsWithQuestionOrExclamationMark implements Criterion {
    
    @Override
    public boolean complies(String line){
        int length = line.length() - 1;
        
        if(length < 0){
            return false;
        }
        
        switch(line.charAt(length)){
            case '!':
            case '?':    
                return true;
        }
        
        return false;
    }
    
}
