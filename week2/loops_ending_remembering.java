import java.util.Scanner;

public class loops_ending_remembering
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Type number: ");
        int number = 0, sum = 0, ctr = 0, even_nums = 0, odd_nums = 0;

        while (true)
        {
            number = Integer.parseInt(scanner.nextLine());

            if (number == -1)
                break;

            if (number % 2 == 0)
                even_nums++;
            else
                odd_nums++;

            sum += number;
            ctr++;
        }

        System.out.println("Thank you and see you later!");
        System.out.println("The sum is " + sum);
        System.out.println("How many numbers: " + ctr);
        System.out.println("Average: " + ((double) sum / ctr));
        System.out.println("Even numbers: " + even_nums);
        System.out.println("Odd numbers: " + odd_nums);
    }
}