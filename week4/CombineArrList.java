import java.util.ArrayList;

/*
Create the method public static void combine(ArrayList<Integer> first, ArrayList<Integer> second)
    that inserts the items in a list called second to a list called first.
The order of the items can be anything and the same item can appear in the list more than once.
 */

public class CombineArrList
{
    public static void combine(ArrayList<Integer> l1, ArrayList<Integer> l2)
    {
        for(Integer num : l2)
            l1.add(num);
    }

    public static void main(String[] args)
    {
        ArrayList<Integer> list1 = new ArrayList<Integer> ();
        ArrayList<Integer> list2 = new ArrayList<Integer> ();

        list1.add(4);
        list1.add(3);

        list2.add(5);
        list2.add(10);
        list2.add(7);

        combine(list1, list2);

        System.out.println(list1);  // [4, 3, 5, 10, 7]
        System.out.println(list2);  // [5, 10, 7]
    }
}