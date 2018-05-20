import java.util.Scanner;

// tells if second word is substr of first word
public class ReverseString
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Type in your text: ");
        String text = scanner.nextLine();
        System.out.println("In reverse order: " + reverse(text));
    }

    public static String reverse(String text)
    {
        String reverse = new String();

        for (int i = text.length() - 1; i >= 0; i--)
        {
            reverse += text.charAt(i);
        }

        return reverse;
    }
}