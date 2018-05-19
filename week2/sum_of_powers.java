import java.util.Scanner;

// calculate the sum n powers with base 2

public class sum_of_powers
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Type a number: ");
        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int iter = 0;

        while (iter <= n)
        {
            sum += (int)Math.pow(2, iter);
            iter++;
        }

        System.out.println("The result is " + sum);
    }
}