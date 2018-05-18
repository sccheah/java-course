
import java.util.Scanner;

public class Divider {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Implement your program here. Remember to ask the input from user.
        System.out.print("Type a number: ");
        double num1 = Integer.parseInt(reader.nextLine());
        System.out.print("Type another number: ");
        double num2 = Integer.parseInt(reader.nextLine());
        
        System.out.println("Division: " + num1 + " / " + num2 + " = " + (num1 / num2));
    }
}
