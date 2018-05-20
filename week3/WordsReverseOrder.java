import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

/*
Create a program that asks the user to input words, until the user gives an empty string.
Then the program prints the words the user gave in reversed order, the last word is printed first etc.
 */

public class WordsReverseOrder
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

        Collections.reverse(words);

        for(String w : words)
        {
            System.out.println(w);
        }

    }
}