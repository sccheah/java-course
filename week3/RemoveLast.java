import java.util.ArrayList;
import java.util.Collections;

// create a method that removes the last item from a list

public class RemoveLast
{
    public static void remove_last(ArrayList<String> list)
    {
        list.remove(list.size() - 1);
    }

    public static void main(String[] args)
    {
        ArrayList<String> brothers = new ArrayList<String>();
        brothers.add("Dick");
        brothers.add("Henry");
        brothers.add("Michael");
        brothers.add("Bob");

        System.out.println("Brothers:");
        System.out.println(brothers);

        // sort brothers alphabetically
        Collections.sort(brothers);

        // remove last item
        remove_last(brothers);

        System.out.println(brothers);
    }
}