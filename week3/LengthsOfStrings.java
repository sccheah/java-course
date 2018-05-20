import java.util.ArrayList;

public class LengthsOfStrings
{
    public static ArrayList<Integer> lengths(ArrayList<String> list)
    {
        ArrayList<Integer> lengths = new ArrayList<Integer> ();

        for(String str : list)
        {
            lengths.add(str.length());
        }

        return lengths;
    }

    public static void main(String[] args)
    {
        ArrayList<String> list = new ArrayList<String> ();
        list.add("Hallo");
        list.add("Moi");
        list.add("Benvenuto!");
        list.add("Badger badger badger badger");

        ArrayList<Integer> lengths = lengths(list);

        System.out.println("The lengths of the Strings: " + lengths);
    }
}