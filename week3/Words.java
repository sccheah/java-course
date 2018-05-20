import java.util.Scanner;
import java.util.ArrayList;

/*
Create a program that asks the user to input words until the user types in an empty String.
Then the program prints the words the user gave.
 */

public class Words
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Type a word: ");
        String word = scanner.nextLine();
        ArrayList<String> words = new ArrayList<String>();

        while (true)
        {
            if (word.equals("")) // or could do word.isEmpty()
                break;

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