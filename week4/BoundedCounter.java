import java.util.Scanner;


public class BoundedCounter
{
    private int value;
    private int upperBound;

    public BoundedCounter(int upperLimit)
    {
        value = 0;
        upperBound = upperLimit;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value)
    {
        this.value = value;
    }

    public void next() {
        value++;

        if (value > upperBound)
            value = 0;
    }

    public String toString() {
        if (value < 10)
            return "0" + value;

        return "" + value;
    }

    public static void main(String[] args) throws Exception {
        BoundedCounter seconds = new BoundedCounter(59);
        BoundedCounter minutes = new BoundedCounter(59);
        BoundedCounter hours = new BoundedCounter(23);

        seconds.setValue(50);
        minutes.setValue(59);
        hours.setValue(23);

        while ( true ) {
            System.out.println( hours + ":" + minutes + ":" + seconds );
            Thread.sleep(1000);
            // put here the logic to advance your clock by one second
            seconds.next();

            if (seconds.getValue() == 0)
            {
                minutes.next();

                if (minutes.getValue() == 0)
                {
                    hours.next();
                }
            }
        }
    }

    /*
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);
        BoundedCounter seconds = new BoundedCounter(59);
        BoundedCounter minutes = new BoundedCounter(59);
        BoundedCounter hours = new BoundedCounter(23);

        System.out.print("seconds: ");
        int s = Integer.parseInt(reader.nextLine()); // read the initial value of seconds from the user
        System.out.print("minutes: ");
        int m = Integer.parseInt(reader.nextLine()); // read the initial value of minutes from the user
        System.out.print("hours: ");
        int h = Integer.parseInt(reader.nextLine()); // read the initial value of hours from the user


        seconds.setValue(s);
        minutes.setValue(m);
        hours.setValue(h);

        for (int i = 0; i < 121; i++)
        {
            System.out.println(hours + ":" + minutes + ":" + seconds);

            seconds.next();

            if (seconds.getValue() == 0)
            {
                minutes.next();

                if (minutes.getValue() == 0)
                {
                    hours.next();
                }
            }
        }

    }
    */
}