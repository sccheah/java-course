
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String password = "carrot"; // Use carrot as password when running tests.

        // Write your code here
        System.out.print("Type the password: ");
        String passInput = reader.nextLine();
        
        while (!passInput.equals(password))
        {
            System.out.println("Wrong!");
            System.out.print("Type the password: ");
            passInput = reader.nextLine();
        }
        
        System.out.println("Right!\n");
        System.out.println("The secret is: jryy qbar!");
    }
}
