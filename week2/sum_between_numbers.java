import java.util.Scanner;

// sum between lower and upper bound ints. assume first int is smaller

public class sum_between_numbers
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("First: ");
        int first = Integer.parseInt(scanner.nextLine());

        System.out.print("Last: ");
        int last = Integer.parseInt(scanner.nextLine());

        int iter = first;
        int sum = 0;

        while (iter <= last)
        {
            sum += iter;

            iter ++;
        }

        System.out.println("The sum is " + sum);
    }
}