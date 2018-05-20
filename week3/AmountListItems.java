import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

// create a method countItems (ArrayList<String> list) that returns the number of items in a list

public class AmountListItems
{
    public static int count_items(ArrayList<String> list)
    {
        return list.size();
    }

    public static void main(String[] args)
    {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Hallo");
        list.add("Ciao");
        list.add("Hello");

        System.out.println("There are this many items in the list: ");
        System.out.println(count_items(list));
    }
}