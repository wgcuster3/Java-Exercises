/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boxes;

import java.util.Collection;
import java.util.ArrayList;

/**
 *
 * @author Wesley
 */
public class MaxWeightBox extends Box{
    private int maxWeight;
    private Collection<Thing> things;
    
    public MaxWeightBox(int maxWeight){
        this.maxWeight = maxWeight;
        this.things = new ArrayList<Thing>();
    }
    
    @Override
    public void add(Thing thing){
        int weight = thing.getWeight();
        for(Thing t : this.things){
            weight += t.getWeight();
        }
        
        if(weight <= this.maxWeight){
            this.things.add(thing);      
        }
    }
    
    @Override
    public boolean isInTheBox(Thing thing){
        for(Thing t : this.things){
            if(t.equals(thing)){
                return true;
            }
        }
        
        return false;    
    }
}
