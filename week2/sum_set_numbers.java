import java.util.Scanner;

// Create a program that calculates the sum 1+2+3+…+n where n is a number entered by the user.

public class sum_set_numbers
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Until what number? ");
        int sum = 0;
        int n = Integer.parseInt(scanner.nextLine());
        int ctr = 1;

        while (ctr <= n)
        {
            sum += ctr;
            ctr++;
        }

        System.out.println("Sum is " + sum);
    }
}