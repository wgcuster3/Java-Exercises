/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reference;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import reference.domain.Film;
import reference.domain.Person;
import reference.domain.Rating;

/**
 *
 * @author Wesley
 */
public class RatingRegister {
    private Map<Person, Map<Film, Rating>> personalRatings;
    private Map<Film, List<Rating>> filmRatings;
    
    public RatingRegister(){
        this.personalRatings = new HashMap<Person, Map<Film, Rating>>();
        this.filmRatings = new HashMap<Film, List<Rating>>();
    }
    
    public void addRating(Film film, Rating rating){
        if(!this.filmRatings.containsKey(film)){
            this.filmRatings.put(film, new ArrayList<Rating>());
        }
        
        this.filmRatings.get(film).add(rating);
    }
    
    public void addRating(Person person, Film film, Rating rating){
        //Check that person is in the hashmap, if not add it
        if(!this.personalRatings.containsKey(person)){
            this.personalRatings.put(person, new HashMap<Film, Rating>());
        }
        
        this.personalRatings.get(person).put(film, rating);
        addRating(film, rating);
    }
    
    public Rating getRating(Person person, Film film){
        if(this.personalRatings.get(person).containsKey(film)){
            return this.personalRatings.get(person).get(film);
        }
        
        return Rating.NOT_WATCHED;
    }
    
    public Map<Film, Rating> getPersonalRatings(Person person){
        if(!this.personalRatings.containsKey(person)){
            this.personalRatings.put(person, new HashMap<Film, Rating>());
            return this.personalRatings.get(person);
        }
        
        return this.personalRatings.get(person);            
    }
    
    public List<Person> reviewers(){
        List reviewers = new ArrayList<Person>();
        
        for(Person person : personalRatings.keySet()){
            reviewers.add(person);
        }
        
        return reviewers;
    }
    
    public List<Rating> getRatings(Film film){
        return this.filmRatings.get(film);
    }
    
    public Map<Film, List<Rating>> filmRatings(){
        return this.filmRatings;
    }
    
    
}
