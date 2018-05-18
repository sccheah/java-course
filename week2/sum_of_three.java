import java.util.Scanner;

public class sum_of_three
{
    // Create a program that asks the user for three numbers and then prints their sum.
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);
        int sum = 0;
        int read;

        // WRITE YOUR PROGRAM HERE
        System.out.print("Type the first number: ");
        read = Integer.parseInt(reader.nextLine());

        sum += read;

        System.out.print("Type the second number: ");
        read = Integer.parseInt(reader.nextLine());

        sum += read;

        System.out.print("Type the third number: ");
        read = Integer.parseInt(reader.nextLine());

        sum += read;

        // USE ONLY THE VARIABLES sum, reader AND read!

        System.out.println("Sum: " + sum);
    }
}