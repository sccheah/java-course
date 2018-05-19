import java.util.Scanner;

/*
Develop the program by adding the following feature:
the main program should ask the user how many times the text
    should be printed (meaning how many times the method is called).
 */

public class many_prints
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many? ");
        int n = Integer.parseInt(scanner.nextLine());
        int ctr = 0;

        while (ctr < n)
        {
            print_text();
            ctr++;
        }
    }

    public static void print_text()
    {
        System.out.println("In the beginning there were the swamp, the hoe and Java.");
    }
}