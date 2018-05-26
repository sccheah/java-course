public class Clock
{
    private BoundedCounter hours;
    private BoundedCounter minutes;
    private BoundedCounter seconds;

    public Clock(int hoursAtBeginning, int minutesAtBeginning, int secondsAtBeginning)
    {
        hours = new BoundedCounter(hoursAtBeginning, 23);
        minutes = new BoundedCounter(minutesAtBeginning, 59);
        seconds = new BoundedCounter(secondsAtBeginning, 59);
    }

    public void tick()
    {
        seconds.next();

        if (seconds.getValue() == 0)
        {
            minutes.next();

            if (minutes.getValue() == 0)
                hours.next();
        }
    }

    public String toString()
    {
        return hours + ":" + minutes + ":" + seconds;
    }

    public static void main(String[] args) {
        Clock clock = new Clock(23, 59, 50);

        int i = 0;
        while( i < 20) {
            System.out.println( clock );
            clock.tick();
            i++;
        }
    }
}