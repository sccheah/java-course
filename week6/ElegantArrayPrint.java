/*
Implement the method public static int printElegantly(int[] array),
which prints the numbers in the array on the same row.
In the printout all the numbers should be separated with comma and
whitespace and there should not be a comma trailing the last number.
 */

public class ElegantArrayPrint
{
    public static void printElegantly(int[] array)
    {
        if (array.length == 1)
        {
            System.out.println(array[0]);
            return;
        }

        for (int i = 0; i < array.length - 1; i++)
            System.out.print(array[i] + ", ");

        System.out.println(array[array.length - 1]);

    }
    public static void main(String[] args)
    {
        int[] array = {5, 1, 3, 4, 2};
        printElegantly(array);
    }
}