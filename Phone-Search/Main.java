import phonesearch.PhoneSearch;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        PhoneSearch search = new PhoneSearch(reader);
        search.start();
        
    }
}
