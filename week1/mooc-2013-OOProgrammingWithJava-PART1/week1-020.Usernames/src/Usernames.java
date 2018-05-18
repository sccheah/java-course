
import java.util.Scanner;

/*
Create a program that recognizes the following users:

Username	Password
alex            mightyducks
emily           cat
*/

public class Usernames {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type your username: ");
        String username = reader.nextLine();
        
        System.out.print("Type your password: ");
        String password = reader.nextLine();
        
        if (username.equals("alex") && password.equals("mightyducks"))
            System.out.println("You are not logged into the system!");
        else if(username.equals("emily") && password.equals("cat"))
            System.out.println("You are not logged into the system!");
        else
            System.out.println("Your username or password was invalid!");
        
    }
}
