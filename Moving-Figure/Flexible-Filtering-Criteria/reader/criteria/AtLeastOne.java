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
public class AtLeastOne implements Criterion{
    private Criterion[] criteria;
    
    public AtLeastOne(Criterion... criteria){
        this.criteria = criteria;
    }
    
    @Override
    public boolean complies(String line){
        //If at least one criterion complies return true
        for(Criterion c : this.criteria){
            if(c.complies(line)){
                return true;
            }
        }
        
        return false;
    }
}
