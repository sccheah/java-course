import java.util.ArrayList;
import java.util.Scanner;

/*
Create the method moreThanOnce that gets a list of integers and an integer (i.e. number) as parameter.
If the number appears on the list more than once the method returns true and otherwise false.
 */
public class DuplicateNumber
{
    public static boolean more_than_once(ArrayList<Integer> list, int number)
    {
        int ctr = 0;

        for (Integer num : list)
        {
            if (num == number)
                ctr++;
        }

        return ctr > 1;
    }

    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);

        System.out.print("Type a number: ");
        int number = Integer.parseInt(reader.nextLine());

        if (more_than_once(list, number))
            System.out.println(number + " appears more than once.");
        else
            System.out.println(number + " does not appear more than once.");


    }
}