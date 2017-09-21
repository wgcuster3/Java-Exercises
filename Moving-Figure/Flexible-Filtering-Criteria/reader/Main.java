package reader;

import reader.criteria.Criterion;
import reader.criteria.ContainsWord;
import reader.criteria.AllLines;
import reader.criteria.EndsWithQuestionOrExclamationMark;
import reader.criteria.LengthAtLeast;
import reader.criteria.Both;
import reader.criteria.Not;
import reader.criteria.AtLeastOne;

public class Main {

    public static void main(String[] args) {
        String address = "https://www.gutenberg.org/files/2554/2554-0.txt";
        GutenbergReader book = new GutenbergReader(address);

        //Criterion criterion = new ContainsWord("beer");
        //Criterion criterion = new AllLines();
        //Criterion criterion = new EndsWithQuestionOrExclamationMark();
        //Criterion criterion = new LengthAtLeast(40);
        //Criterion criterion = new Both(
        //                new EndsWithQuestionOrExclamationMark(), 
        //                new ContainsWord("beer"));
        //Criterion criterion = new Not( new LengthAtLeast(10));
        Criterion criterion = new AtLeastOne(
                          new ContainsWord("beer"),
                          new ContainsWord("milk"),
                          new ContainsWord("oil"));
        
        
        for (String line : book.linesWhichComplyWith(criterion)) {
            System.out.println(line);
        }
    }
}
