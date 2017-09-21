/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reference.comparator;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import reference.domain.Film;
import reference.domain.Rating;

/**
 *
 * @author Wesley
 */
public class FilmComparator implements Comparator<Film>{
    private Map<Film, List<Rating>> ratings;
    
    public FilmComparator(Map<Film, List<Rating>> ratings){
        this.ratings = ratings;
    }
    
    @Override
    public int compare(Film f1, Film f2){
        int f1Avg = filmAverage(f1);
        int f2Avg = filmAverage(f2);
        
        return f2Avg - f1Avg;
    }
    
    private int filmAverage(Film film){
        int avg = 0;
        
        for(Rating rating : this.ratings.get(film)){
            avg += rating.getValue();
        }    
        
        return avg/this.ratings.get(film).size();
    }
}
