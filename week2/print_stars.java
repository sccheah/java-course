import java.util.Scanner;

// Create a method printStars that prints the given amount of stars and a line break.
public class print_stars
{
    public static void main(String[] args)
    {
        printStars(5);
        printStars(3);
        printStars(9);

        System.out.println("");

        printSquare(4);

        System.out.println("");

        printRectangle(17, 3);

        System.out.println("");

        printTriangle(4);
    }

    // print n amount of stars
    public static void printStars(int count)
    {
        for (int i = 0; i < count; i++)
        {
            System.out.print("*");
        }

        System.out.println("");
    }

    public static void printSquare(int count)
    {
        for (int i = 0; i < count; i++)
        {
            printStars(count);
        }
    }

    public static void printRectangle(int width, int height)
    {
        for (int i = 0; i < height; i++)
        {
            printStars(width);
        }
    }

    public static void printTriangle(int count)
    {
        for (int i = 1; i <= count; i++)
        {
            printStars(i);
        }
    }
}