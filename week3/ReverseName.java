import java.util.Scanner;

// output users name in reverse

public class ReverseName
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Type your name: ");
        String name = scanner.nextLine();

        print_reverse(name);
    }

    public static void print_reverse(String name)
    {
        System.out.print("In reverse order: ");

        for (int i = name.length() - 1; i >= 0; i--)
        {
            System.out.print(name.charAt(i));
        }
        System.out.println();
    }
}