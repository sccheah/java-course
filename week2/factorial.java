import java.util.Scanner;

/*
Create a program that calculates the factorial of the number n.
The factorial n! is calculated using the formula 1*2*3*...*n.
For example 4! = 1*2*3*4 = 24. Additionally, it is defined that 0! = 1.
 */

public class factorial
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Type a number: ");
        int n = Integer.parseInt(scanner.nextLine());
        int factorial = 1, iter = 1;

        if (n == 0)
        {
            System.out.println("Factorial is 1");

            return;
        }

        while (iter <= n)
        {
            factorial *= iter;

            iter++;
        }

        System.out.println("Factorial is " + factorial);

    }
}