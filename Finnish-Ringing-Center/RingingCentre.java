/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.*;
/**
 *
 * @author Wesley
 */
public class RingingCentre {
    private Map<Bird, List<String>> observations = new HashMap<Bird, List<String>>();
    
    public void observe(Bird bird, String place){
        if(!this.observations.containsKey(findBird(bird))){
            this.observations.put(bird, new ArrayList<String>());
        }
        
        this.observations.get(findBird(bird)).add(place);
    }
    
    public void observations(Bird bird){
        Bird foundBird = findBird(bird);
        
        if(foundBird == null ){
            System.out.println(bird + " observations: 0");
        } else {
            System.out.println(bird + " observations: " + this.observations.get(foundBird).size());
            for(String place : this.observations.get(foundBird)){
                System.out.println(place);
            }
        }
    }
    
    private Bird findBird(Bird bird){
        for(Bird found : this.observations.keySet()){
            if (bird.equals(found)){
                return found;
            }
        }
        
        return null;
    }
}
