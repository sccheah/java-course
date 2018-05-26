import java.util.Random;

public class Randomizer
{
    public static void main(String[] args)
    {
        Random randomizer = new Random();

        for (int i = 0; i < 10; i++)
        {
            System.out.println(randomizer.nextInt(10));
        }
    }
}