import java.util.Scanner;
import java.util.ArrayList;

/*
Create a program that asks the user to input words until the user gives the same word twice.
Use an ArrayList structure in your program.
 */

public class RecurringWord
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();

        System.out.print("Type a word: ");
        String word = scanner.nextLine();

        while (true)
        {
            if (word.isEmpty())
                break;

            if (words.contains(word))
            {
                System.out.println("You gave the word " + word + " twice");
                return;
            }

            words.add(word);

            System.out.print("Type a word: ");
            word = scanner.nextLine();
        }

        System.out.println("You typed the following words: ");

        for(String w : words)
        {
            System.out.println(w);
        }

    }
}