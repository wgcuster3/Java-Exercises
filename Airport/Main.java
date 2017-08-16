
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
              
        String input = "1\n"  +
                       "AY-123\n"  +
                       "108\n" +
                       "2\n"  +
                       "AY-123\n"  +
                       "HEL\n"  +
                       "TXL\n"  +
                       "2\n"  +
                       "AY-123\n"  +
                       "JFK\n"  +
                       "HEL\n"  +
                       "x\n"  +               
                       "2\n"  +
                       "x\n";
        
        Scanner reader = new Scanner(input);

        TextUserInterface ui = new TextUserInterface(reader);
        ui.start();
                
    }
}
