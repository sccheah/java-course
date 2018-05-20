import java.util.Scanner;

// output the first n chars of word

public class FirstPart
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Type a word: ");
        String word = scanner.nextLine();

        System.out.print("Length of the first part: ");
        int n = Integer.parseInt(scanner.nextLine());

        // if n is greater than length of word, print entire word
        if (n > word.length())
        {
            System.out.println("Result: " + word);

            return;
        }

        System.out.println("Result: " + word.substring(0, n));

    }
}