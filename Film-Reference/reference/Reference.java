/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reference;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import reference.comparator.FilmComparator;
import reference.domain.Film;
import reference.domain.Person;
import reference.domain.Rating;

/**
 *
 * @author Wesley
 */
public class Reference {
    private RatingRegister register;
    
    public Reference(RatingRegister register){
        this.register = register;
    }
    
    public Film recommendFilm(Person person){
        Map<Film, Rating> person1Ratings = register.getPersonalRatings(person);
        
        //If the user hasn't rated any films that the highest rated movie should be returned
        if(this.register.getPersonalRatings(person).isEmpty()){
            return findHighestRated(person);
        }
        
        List<Person> people = register.reviewers();
        
        //Remove the person we are trying to find a movie for.
        people.remove(person);
        
        int score = 0;
        int tempScore = 0;
        Person tempPerson = null;
        
        //Cycle through people's ratings to find similarities
        for (Person p : people){
            Map<Film, Rating> person2Ratings = register.getPersonalRatings(p);
            
            tempScore = 0;
            
            for(Film film : person2Ratings.keySet()){
                if(person1Ratings.containsKey(film)){
                    tempScore += person1Ratings.get(film).getValue() * person2Ratings.get(film).getValue();
                }              
            }
            
            if (tempScore > score){
                score = tempScore;
                tempPerson = p;
            }
        }
        
        //If no suitable people found just return the highest rated film
        if(tempPerson == null){
            return findHighestRated(person);
        }
        
        //Cycle through the person with the closest ratings to find a movie
        //Rewrite this section to use film comparator instead
        Map<Film, Rating> person2Ratings = register.getPersonalRatings(tempPerson);
        
        int tempRating = -6;
        Film tempFilm = null;
        
        for(Film film : person2Ratings.keySet()){
            if(!person1Ratings.containsKey(film)){
                if(person2Ratings.get(film).getValue() > tempRating){
                    tempRating = person2Ratings.get(film).getValue();
                    tempFilm = film;
                }
            }
        }
        
        return tempFilm;
    }
    
    //I can rewrite this to use the film comparator instead to find the highest rated movie
    private Film findHighestRated(Person p1){
        Map<Film, Integer> totalRatings = new HashMap<Film, Integer>();
        Map<Film, List<Rating>> movieRatings = register.filmRatings();
        
        //Add up the score for each movie and save to new HashMap
         for (Film film : movieRatings.keySet()){
            int tempRating = 0;
            
            for(Rating rating : movieRatings.get(film)){
                tempRating += rating.getValue();
            }
                
            totalRatings.put(film, tempRating);
        }
        
        Film tempFilm = null;
        int tempScore = 0;
        Map<Film, Rating> personalRatings = register.getPersonalRatings(p1);
        
        //cycle through the newly created hashmap and find the highest rated movie that the user hasn't seen yet
        for(Film film : totalRatings.keySet()){
            if(!personalRatings.containsKey(film)){
                if(totalRatings.get(film) > tempScore){
                    tempFilm = film;
                    tempScore = totalRatings.get(film);
                }
            }
        }
        
        return tempFilm;
    }
}
