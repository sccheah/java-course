import java.util.ArrayList;

/*
Create the method variance, which receives a list of integers as a parameter
and then returns the sample variance of that list. You can check how a sample
variance is calculated in Wikipedia, under "Population variance and sample variance".
 */

public class VarianceOfList
{
    public static double average(ArrayList<Integer> list)
    {
        int sum = 0;

        for (Integer num : list)
        {
            sum += num;
        }

        return (double)sum / list.size();
    }

    public static double variance(ArrayList<Integer> list)
    {
        double avg = average(list);
        double variance = 0.0;

        for (Integer num : list)
        {
            variance += (Math.pow((num - avg), 2));
        }

        variance /= (list.size() - 1);

        return variance;

    }

    public static void main(String[] args)
    {
        ArrayList<Integer> list = new ArrayList<Integer> ();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);

        //System.out.println(average(list));

        System.out.println("The variance is: " + variance(list));
    }
}