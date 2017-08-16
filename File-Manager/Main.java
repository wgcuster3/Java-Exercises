
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        FileManager t = new FileManager();

        //for (String line : t.read("src/testinput1.txt")) {
        //    System.out.println(line);
        //}
        
        
        //t.save("src/testinput2.txt", "test");
        
        
        ArrayList<String> list = new ArrayList<String>();
        list.add("I am writing to the file.");
        list.add("Each sentence should be on a separate line.");
        list.add("I hope this will work.");
        
        t.save("src/testinput2.txt", list);
    }
}
