import java.util.Arrays;

// sort array using selection sort

public class Sorting
{
    // get the min value in array
    public static int smallest(int[] array)
    {
        if (array.length == 0)
        {
            System.out.println("Array is empty!");
            return -1;
        }

        int min = array[0];

        for (int i = 0; i < array.length; i++)
        {
            if (array[i] < min)
                min = array[i];
        }

        return min;
    }

    // get index of min values
    public static int indexOfSmallest(int[] array)
    {
        int minValue = smallest(array);

        for (int i = 0; i < array.length; i++)
        {
            if (minValue == array[i])
                return i;
        }

        return -1;
    }

    // get index at the smallest at end of array starting @index
    public static int indexOfSmallestStartingFrom(int[] array, int index)
    {
        if (index >= array.length || index < 0)
        {
            System.out.println("index is out of bounds");
            return -1;
        }

        int[] subArray = new int[array.length - index];

        // copy end portion of array into @subArray
        for (int i = index; i < array.length; i++)
            subArray[i - index] = array[i];

        int min = smallest(subArray);
        int smallestIndex = indexOfSmallest(subArray);

        // take into account offset for array
        smallestIndex += index;

        return smallestIndex;
    }

    public static void swap(int[] array, int index1, int index2)
    {
        int temp = array[index1];

        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void sort(int[] array)
    {
        if (array.length == 0) {
            System.out.println("Array is empty");
            return;
        }

        int smallestIndex = 0;

        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length; i++)
        {
            smallestIndex = indexOfSmallestStartingFrom(array, i);
            swap(array, i, smallestIndex);
            System.out.println(Arrays.toString(array));
        }
    }

    public static void main(String[] args)
    {
        int[] values = {6, 5, 8, 7, 11};
        System.out.println("smallest: " + smallest(values));
        System.out.println("index of smallest: " + indexOfSmallest(values));

        int[] values1 = {-1, 6, 9, 8, 12};
        System.out.println(indexOfSmallestStartingFrom(values1, 1));
        System.out.println(indexOfSmallestStartingFrom(values1, 2));
        System.out.println(indexOfSmallestStartingFrom(values1, 4));


        int[] values3 = {3, 2, 5, 4, 8};

        System.out.println( Arrays.toString(values3) );

        swap(values3, 1, 0);
        System.out.println( Arrays.toString(values3) );

        swap(values3, 0, 3);
        System.out.println( Arrays.toString(values3) );

        int[] values4 = {8, 3, 7, 9, 1, 2, 4};
        sort(values4);
    }
}