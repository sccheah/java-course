// returns min of parameters

public class least
{
    public static void main(String[] args)
    {
        int answer = least(2, 7);
        System.out.println("Least: " + answer);
    }

    public static int least(int num1, int num2)
    {
        if (num1 <= num2)
            return num1;
        else
            return num2;
    }
}