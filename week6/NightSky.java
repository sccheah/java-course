import java.util.Random;

/*
Create the class NightSky, that has three object variables: density (double),
width (int), and height (int). The class should have 3 constructors:

public NightSky(double density) creates a NightSky object with the given
    star density. Width gets the value 20 and height the value 10.
public NightSky(int width, int height) creates a NightSky object with
    the given width and height. Density gets the value 0.1.
public NightSky(double density, int width, int height) creates a
    NightSky-object with the given density, width and height
 */

public class NightSky
{
    private double density;
    private int height;
    private int width;
    private int numOfStars;

    // creates a NightSky obj w/ given star densite
    // width gets 20 and height gets 10
    public NightSky(double density) { this(density, 20, 10); }

    // creates NightSky obj with given width & height. Density is 0.1
    public NightSky(int width, int height) { this(0.1, width, height); }

    public NightSky(double density, int width, int height)
    {
        this.density = density;
        this.width = width;
        this.height = height;
        this.numOfStars = 0;
    }

    public void printLine()
    {
        Random probability = new Random();

        for (int i = 0; i < width; i++)
        {
            if (probability.nextDouble() <= density)
            {
                System.out.print("*");
                numOfStars++;
            }
            else
                System.out.print(" ");
        }

        System.out.println();
    }

    public void print()
    {
        numOfStars = 0;

        for (int i = 0; i < height; i++)
            printLine();
    }

    public int starsInLastPrint()
    {
        return numOfStars;
    }

    public static void main(String[] args)
    {
        NightSky nightSky = new NightSky(0.1, 40, 10);
        nightSky.printLine();

        System.out.println("_________________________________________");

        NightSky NightSky = new NightSky(8, 4);
        NightSky.print();

        System.out.println("_________________________________________");

        NightSky = new NightSky(8, 4);
        NightSky.print();
        System.out.println("Number of stars: " + NightSky.starsInLastPrint());
        System.out.println("_________________________________________");

        NightSky.print();
        System.out.println("Number of stars: " + NightSky.starsInLastPrint());
//        NightSky nightSky = new NightSky(0.1, 40, 10);
//        nightSky.print();
//
//        System.out.println("Number of stars: " + nightSky.starsInLastPrint());
//        System.out.println();
//
//        nightSky = new NightSky(0.2, 15, 6);
//        nightSky.print();
//        System.out.println("Number of stars: " + nightSky.starsInLastPrint());
    }
}