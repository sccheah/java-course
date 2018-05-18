import java.util.Scanner;

/*
Create a program that reads numbers from the user and prints their sum.
The program should stop asking for numbers when user enters the number 0.
 */

public class sum_many_numbers
{
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);
        int sum = 0;

        while (true)
        {
            System.out.print("Enter a number: ");
            int input = Integer.parseInt(reader.nextLine());

            if (input == 0)
                break;

            sum += input;

            System.out.println("Sum now: " + sum);
        }

        System.out.println("Sum in the end: " + sum);
    }
}