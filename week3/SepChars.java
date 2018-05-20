import java.util.Scanner;

// output characters of string on a newline per char

public class SepChars
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Type your name: ");
        String name = scanner.nextLine();

        print_chars(name);
    }

    public static void print_chars(String name)
    {
        for (int i = 0; i < name.length(); i++)
        {
            System.out.println((i + 1) + ". character: " + name.charAt(i));
        }
    }
}