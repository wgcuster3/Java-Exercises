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
public class Not implements Criterion{
    private Criterion criterion;
    
    public Not(Criterion criterion){
        this.criterion = criterion;
    }
    
    @Override
    public boolean complies(String line){
        if(this.criterion.complies(line)){
            return false;
        }
        
        return true;
    }
}
