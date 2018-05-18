import java.util.Scanner;

public class up_to_number
{
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);

        System.out.print("Up to what number? ");
        int num = Integer.parseInt(reader.nextLine());
        int ctr = 1;

        while (ctr <= num)
        {
            System.out.println(ctr);
            ctr++;
        }

    }
}