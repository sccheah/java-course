import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

/*
Create a similar program as the reverse word order one,
but in which the words are printed in alphabetical order.
 */

public class WordsAlphabeticalOrder
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

        Collections.sort(words);

        for(String w : words)
        {
            System.out.println(w);
        }

    }
}