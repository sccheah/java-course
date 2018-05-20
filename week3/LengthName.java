import java.util.Scanner;

// output length of user name

public class LengthName
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Type your name: ");
        String name = scanner.nextLine();

        System.out.println("Number of characters: " + name.length());
    }
}