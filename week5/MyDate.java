// class that can represent dates

public class MyDate
{
    private int day;
    private int month;
    private int year;

    public MyDate(int day, int month, int year)
    {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String toString()
    {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean earlier(MyDate compared)
    {
        if (this.year < compared.year)
            return true;

        if (this.year == compared.year && this.month < compared.month)
            return true;

        if (this.year == compared.year && this.month == compared.month &&
                    this.day < compared.day)
            return true;

        return false;
    }

    public static void main(String[] args) {
        MyDate p1 = new MyDate(14, 2, 2011);
        MyDate p2 = new MyDate(21, 2, 2011);
        MyDate p3 = new MyDate(1, 3, 2011);
        MyDate p4 = new MyDate(31, 12, 2010);

        System.out.println( p1 + " earlier than " + p2 + ": " + p1.earlier(p2));
        System.out.println( p2 + " earlier than " + p1 + ": " + p2.earlier(p1));

        System.out.println( p2 + " earlier than " + p3 + ": " + p2.earlier(p3));
        System.out.println( p3 + " earlier than " + p2 + ": " + p3.earlier(p2));

        System.out.println( p4 + " earlier than " + p1 + ": " + p4.earlier(p1));
        System.out.println( p1 + " earlier than " + p4 + ": " + p1.earlier(p4));
    }
}