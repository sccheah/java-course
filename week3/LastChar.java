import java.util.Scanner;

// output last char of string

public class LastChar
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Type your name: ");
        String name = scanner.nextLine();

        System.out.println("Last character: " + name.charAt(name.length() - 1));
    }
}