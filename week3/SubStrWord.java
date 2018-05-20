import java.util.Scanner;

// tells if second word is substr of first word
public class SubStrWord
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Type the first word: ");
        String firstWord = scanner.nextLine();

        System.out.print("Type the second word: ");
        String secondWord = scanner.nextLine();

        if (firstWord.indexOf(secondWord) == -1)
            System.out.println("The word " + secondWord + " is not found in the word " + firstWord);
        else
            System.out.println("The word " + secondWord + " is found in the word " + firstWord);
    }
}