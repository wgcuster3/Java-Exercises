/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boxes;

/**
 *
 * @author Wesley
 */
public class OneThingBox extends Box{
    private Thing oneThing;
    
    public OneThingBox(){
        
    }
    
    @Override
    public void add(Thing thing){
        if(this.oneThing == null){
            this.oneThing = thing;
        }
    }
    
    @Override
    public boolean isInTheBox(Thing thing){
        if(this.oneThing == null){
            return false;
        }
        return this.oneThing.equals(thing);
    }
}
