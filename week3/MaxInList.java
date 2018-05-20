import java.util.ArrayList;

/*
Create the method greatest, which receives a list of numbers (ArrayList<Integer>)
as a parameter and then returns the greatest number in the list as a return value.
 */

public class MaxInList
{
    public static int greatest(ArrayList<Integer> list)
    {
        int max = 0;

        for (Integer num : list)
        {
            if (num > max)
                max = num;
        }

        return max;
    }

    public static void main(String[] args)
    {
        ArrayList<Integer> list = new ArrayList<Integer> ();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);

        System.out.println("The greatest number is: " + greatest(list));
    }
}