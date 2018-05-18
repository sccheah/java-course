
import java.util.Scanner;

public class Temperatures {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        // Write your code here. 

        System.out.print("Type a number (or type \"quit\"): ");
        String input = reader.nextLine();
        Double number; 
        
        while (true)
        {
            if (input.equals("quit"))
                break;
            
            number = Double.parseDouble(reader.nextLine());
            // temp below -30 deg or over 40 deg are ignored
            if ((number > -30.0) && (number < 40.0))
                Graph.addNumber(number);
            
            System.out.print("Type a number (or type \"quit\"): ");
            input = reader.nextLine();
        }
        
        // Graph is used as follows:
//        Graph.addNumber(7);
//        double value = 13.5;
//        Graph.addNumber(value);
//        value = 3;
//        Graph.addNumber(value);
        // Remove or comment out these lines above before trying to run the tests.
    }
}
