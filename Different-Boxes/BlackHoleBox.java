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
public class BlackHoleBox extends Box{
    private Collection things;
    
    public BlackHoleBox(){
        this.things = new ArrayList<Thing>();
    }
    
    @Override
    public void add(Thing thing){
        this.things.add(thing);
    }
    
    @Override
    public boolean isInTheBox(Thing thing){
        return false;
    }
}
