//calculates the sum of numbers the method receives as parameters.

public class sum_numbers
{
    public static void main(String[] args)
    {
        int answer = sum(4, 3, 6, 1);
        System.out.println("sum: " + answer);
    }

    public static int sum(int num1, int num2, int num3, int num4)
    {
        return num1 + num2 + num3 + num4;
    }
}