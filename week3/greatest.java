// returns the max of three paramenters

public class greatest
{
    public static void main(String[] args)
    {
        int answer = calc_greatest(2, 7, 3);
        System.out.println("Greatest: " + answer);
    }

    public static int calc_greatest(int num1, int num2, int num3)
    {
        if (num1 >= num2 && num1 >= num3)
            return num1;
        else if (num2 >= num1 && num2 >= num3)
            return num2;
        else
            return num3;
    }
}