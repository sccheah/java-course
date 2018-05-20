// calc average of numbers

public class Average
{
    public static void main(String[] args)
    {
        double answer = average(4, 3, 6, 1);
        System.out.println("Average: " + answer);
    }

    public static double average(double num1, double num2, double num3, double num4)
    {
        return (num1 + num2 + num3 + num4) / 4;
    }
}