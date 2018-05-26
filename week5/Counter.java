/*
Make a class Counter that holds a number that can be decreased and increased.
The counter also has an optional check that prevents the counter from going below 0.
 */

public class Counter
{
    private int value;
    private boolean check;

    public Counter(int startingValue, boolean check)
    {
        value = startingValue;
        this.check = check;
    }

    public Counter(int startingValue)
    {
        this(startingValue, false);
    }

    public Counter(boolean check)
    {
        this(0, check);
    }

    public Counter()
    {
        this(0, false);
    }

    public int value() { return value; }

    public void increase() { this.increase(1); }

    public void decrease() { this.decrease(1); }

    public void increase(int increaseAmount)
    {
        if (increaseAmount >= 0)
            value += increaseAmount;
    }

    public void decrease(int decreaseAmount)
    {
        if (decreaseAmount >= 0)
            if (check)
                if (value > 0)
                    value--;
            else
                value--;
    }

}