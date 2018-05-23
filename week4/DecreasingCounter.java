public class DecreasingCounter
{
    private int value;
    private int initial;

    public DecreasingCounter(int value)
    {
        this.initial = value;
        this.value = value;
    }

    public void printValue()
    {
        System.out.println("value: " + this.value);
    }

    public void decrease()
    {
        if (this.value == 0)
            return;

        this.value--;
    }

    public void reset()
    {
        this.value = 0;
    }

    public void set_initial()
    {
        this.value = this.initial;
    }

    public static void main(String[] args)
    {
        DecreasingCounter counter = new DecreasingCounter(200);

        counter.printValue();

        counter.decrease();
        counter.printValue();

        counter.decrease();
        counter.printValue();

        counter.decrease();
        counter.printValue();

        System.out.println();

        counter.printValue();

        counter.reset();
        counter.printValue();

        counter.decrease();
        counter.printValue();

        counter.set_initial();
        counter.printValue();
    }
}