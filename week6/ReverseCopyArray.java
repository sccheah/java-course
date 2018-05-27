/*
Implement the method public static int[] copy(int[] array) that creates a copy
of the parameter. Tip: since you are supposed to create a copy of the parameter,
the method should create a new array where the contents of the parameter is copied.
 */

import java.util.Arrays;

public class ReverseCopyArray
{
    public static int[] reverseCopy(int[] array)
    {
        int[] copy = new int[array.length];

        for (int i = array.length - 1; i >= 0; i--)
        {
            copy[array.length  - i - 1] = array[i];
        }

        return copy;
    }

    public static int[] copy(int[] array)
    {
        int[] copy = new int[array.length];

        for(int i = 0; i < array.length; i++)
            copy[i] = array[i];

        return copy;
    }
    public static void main(String[] args)
    {
        int[] original = {1, 2, 3, 4};
        int[] reverse = reverseCopy(original);

        // print both
        System.out.println( "original: " +Arrays.toString(original));
        System.out.println( "reversed: " +Arrays.toString(reverse));
    }
}