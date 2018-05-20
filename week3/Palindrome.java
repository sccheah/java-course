import java.util.ArrayList;
import java.util.Scanner;

/*
Create the method palindrome that checks if a string is a palindrome (reads the same forward and backward).
 */

public class Palindrome
{
    public static boolean is_palindrome(String text)
    {
        String revText = new String();

        for (int i = text.length() - 1; i >= 0; i--)
            revText += text.charAt(i);

        return text.equals(revText);
    }

    public static void main(String[] arg)
    {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type a text: ");
        String text = reader.nextLine();

        if (is_palindrome(text))
            System.out.println("The text is a palindrome!");
        else
            System.out.println("The text is not a palindrome");
    }
}