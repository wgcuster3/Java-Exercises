package reference;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import reference.comparator.FilmComparator;
import reference.comparator.PersonComparator;
import reference.domain.*;

public class Main {

    public static void main(String[] args) {
        //EXERCISE 46.1: PERSON AND FILM
        //Person p = new Person("Pekka");
        //Film f = new Film("Eraserhead");

        //System.out.println(p.getName() + " and " + f.getName());
        
        
        //EXERCISE 46.2: RATING
        //Rating given = Rating.GOOD;
        //System.out.println("Rating " + given + ", value " + given.getValue());
        //given = Rating.NEUTRAL;
        //System.out.println("Rating " + given + ", value " + given.getValue()); 
        
        
        //EXERCISE 46.3: RATINGREGISTER, PART 1
        //Film theBridgesOfMadisonCounty = new Film("The Bridges of Madison County");
        //Film eraserhead = new Film("Eraserhead");

        //RatingRegister reg = new RatingRegister();
        //reg.addRating(eraserhead, Rating.BAD);
        //reg.addRating(eraserhead, Rating.BAD);
        //reg.addRating(eraserhead, Rating.GOOD);

        //reg.addRating(theBridgesOfMadisonCounty, Rating.GOOD);
        //reg.addRating(theBridgesOfMadisonCounty, Rating.FINE);

        //System.out.println("All ratings: " + reg.filmRatings());
        //System.out.println("Ratings for Eraserhead: " + reg.getRatings(eraserhead));
        
        
        //EXERCISE 46.4: RATINGREGISTER, PART 2
        //RatingRegister ratings = new RatingRegister();

        //Film goneWithTheWind = new Film("Gone with the Wind");
        //Film eraserhead = new Film("Eraserhead");

        //Person matti = new Person("Matti");
        //Person pekka = new Person("Pekka");

        //ratings.addRating(matti, goneWithTheWind, Rating.BAD);
        //ratings.addRating(matti, eraserhead, Rating.FINE);

        //ratings.addRating(pekka, goneWithTheWind, Rating.GOOD);
        //ratings.addRating(pekka, eraserhead, Rating.GOOD);

        //System.out.println("Ratings for Eraserhead: " + ratings.getRatings(eraserhead));
        //System.out.println("Matti's ratings: " + ratings.getPersonalRatings(matti));
        //System.out.println("Reviewers: " + ratings.reviewers());

        
        //EXERCISE 46.5: PERSONCOMPARATOR
        //Person matti = new Person("Matti");
        //Person pekka = new Person("Pekka");
        //Person mikke = new Person("Mikke");
        //Person thomas = new Person("Thomas");

        //Map<Person, Integer> peopleIdentities = new HashMap<Person, Integer>();
        //peopleIdentities.put(matti, 42);
        //peopleIdentities.put(pekka, 134);
        //peopleIdentities.put(mikke, 8);
        //peopleIdentities.put(thomas, 82);

        //List<Person> ppl = Arrays.asList(matti, pekka, mikke, thomas);
        //System.out.println("People before sorting: " + ppl);

        //Collections.sort(ppl, new PersonComparator(peopleIdentities));
        //System.out.println("People after sorting: " + ppl);
        
        
        //EXERCISE 46.6: FILMCOMPARATOR
        //RatingRegister ratings = new RatingRegister();

        //Film goneWithTheWind = new Film("Gone with the Wind");
        //Film theBridgesOfMadisonCounty = new Film("The Bridges of Madison County");
        //Film eraserhead = new Film("Eraserhead");

        //Person matti = new Person("Matti");
        //Person pekka = new Person("Pekka");
        //Person mikke = new Person("Mikke");

        //ratings.addRating(matti, goneWithTheWind, Rating.BAD);
        //ratings.addRating(matti, theBridgesOfMadisonCounty, Rating.GOOD);
        //ratings.addRating(matti, eraserhead, Rating.FINE);

        //ratings.addRating(pekka, goneWithTheWind, Rating.FINE);
        //ratings.addRating(pekka, theBridgesOfMadisonCounty, Rating.BAD);
        //ratings.addRating(pekka, eraserhead, Rating.MEDIOCRE);

        //ratings.addRating(mikke, eraserhead, Rating.BAD);

        //Map<Film, List<Rating>> filmRatings = ratings.filmRatings();

        //List<Film> films = Arrays.asList(goneWithTheWind, theBridgesOfMadisonCounty, eraserhead);
        //System.out.println("The films before sorting: " + films);

        //Collections.sort(films, new FilmComparator(filmRatings));
        //System.out.println("The films after sorting: " + films);
        
        //EXERCISE 46.7: REFERENCE, PART 1
        //RatingRegister ratings = new RatingRegister();

        //Film goneWithTheWind = new Film("Gone with the Wind");
        //Film theBridgesOfMadisonCounty = new Film("The Bridges of Madison County");
        //Film eraserhead = new Film("Eraserhead");

        //Person matti = new Person("Matti");
        //Person pekka = new Person("Pekka");
        //Person mikke = new Person("Mikke");

        //ratings.addRating(matti, goneWithTheWind, Rating.BAD);
        //ratings.addRating(matti, theBridgesOfMadisonCounty, Rating.GOOD);
        //ratings.addRating(matti, eraserhead, Rating.FINE);

        //ratings.addRating(pekka, goneWithTheWind, Rating.FINE);
        //ratings.addRating(pekka, theBridgesOfMadisonCounty, Rating.GOOD);
        //ratings.addRating(pekka, eraserhead, Rating.MEDIOCRE);

        //Reference ref = new Reference(ratings);
        //Film recommended = ref.recommendFilm(mikke);
        //System.out.println("The film recommended to Michael is: " + recommended);
        
        
        //EXERCISE 46.8: REFERENCE, PART 2
        RatingRegister ratings = new RatingRegister();

        Film goneWithTheWind = new Film("Gone with the Wind");
        Film theBridgesOfMadisonCounty = new Film("The Bridges of Madison County");
        Film eraserhead = new Film("Eraserhead");
        Film bluesBrothers = new Film("Blues Brothers");

        Person matti = new Person("Matti");
        Person pekka = new Person("Pekka");
        Person mikke = new Person("Mikael");
        Person thomas = new Person("Thomas");
        Person arto = new Person("Arto");

        ratings.addRating(matti, goneWithTheWind, Rating.BAD);
        ratings.addRating(matti, theBridgesOfMadisonCounty, Rating.GOOD);
        ratings.addRating(matti, eraserhead, Rating.FINE);

        ratings.addRating(pekka, goneWithTheWind, Rating.FINE);
        ratings.addRating(pekka, eraserhead, Rating.BAD);
        ratings.addRating(pekka, bluesBrothers, Rating.MEDIOCRE);

        ratings.addRating(mikke, eraserhead, Rating.BAD);

        ratings.addRating(thomas, bluesBrothers, Rating.GOOD);
        ratings.addRating(thomas, theBridgesOfMadisonCounty, Rating.GOOD);

        Reference ref = new Reference(ratings);
        System.out.println(thomas + " recommendation: " + ref.recommendFilm(thomas));
        System.out.println(mikke + " recommendation: " + ref.recommendFilm(mikke));
        System.out.println(matti + " recommendation: " + ref.recommendFilm(matti));
        System.out.println(arto + " recommendation: " + ref.recommendFilm(arto));
    }
}
