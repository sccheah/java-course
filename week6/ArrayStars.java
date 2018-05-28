/*
Implement the method public static printArrayAsStars(int[] array),
which prints a line with stars for each number in the array.
The line length is determined by the number.
 */

public class ArrayStars
{
    public static void printArrayAsStars(int[] array)
    {
        for (int i = 0; i < array.length; i++)
        {
            for (int j = 0; j < array[i]; j++)
                System.out.print("*");

            System.out.println();
        }
    }

    public static void main(String[] args)
    {
        int[] array = {5, 1, 3, 4, 2};
        printArrayAsStars(array);
    }
}