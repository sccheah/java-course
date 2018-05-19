import java.util.Scanner;

/*
Create a program that asks the user for the first number and the last
    number and then prints all numbers between those two.
 */

public class lower_upper_limit
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("First: ");
        int first = Integer.parseInt(scanner.nextLine());

        System.out.print("Last: ");
        int last = Integer.parseInt(scanner.nextLine());

        while(first <= last)
        {
            System.out.println(first);

            first++;
        }
    }
}