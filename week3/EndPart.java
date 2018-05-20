import java.util.Scanner;

// output the n chars from the end

public class EndPart
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Type a word: ");
        String word = scanner.nextLine();

        System.out.print("Length of the end part: ");
        int n = Integer.parseInt(scanner.nextLine());

        System.out.println("Result: " + word.substring(word.length() - n));
    }
}