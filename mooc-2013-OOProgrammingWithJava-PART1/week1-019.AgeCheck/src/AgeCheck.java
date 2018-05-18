
import java.util.Scanner;

// Create a program that asks for the user's age and checks that it is 
//      reasonable (at least 0 and at most 120).
public class AgeCheck {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("How old are you? ");
        int age = Integer.parseInt(reader.nextLine());
        
        if (age >= 0 && age <= 120)
            System.out.println("OK");
        else
            System.out.println("Impossible!");
    }
}
