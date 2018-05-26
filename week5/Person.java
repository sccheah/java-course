public class Person
{
    private String name;
    private int height;
    private int weight;
    private MyDate birthMyDate;

    public Person(String initialName)
    {
        this(initialName, 0);   // call the other constructor
    }

    public Person(String name, int age)
    {
        this.name = name;
        this.age = age;
        this.weight = 0;
        this.height = 0;
    }

    public Person(String name, int day, int month, int year)
    {
        this.name = name;
        this.weight = 0;
        this.height = 0;
        this.birthMyDate = new MyDate(day, month, year);
    }


    public void print_person()
    {
        System.out.println(this.name + ", age " + this.age + " years");
    }

    public void become_older()
    {
        this.become_older(1);
    }

    public void become_older(int years) { this.age += years; }

    public boolean is_adult()
    {
        return this.age >= 18;
    }

    public String get_name()
    {
        return this.name;
    }

    public void setHeight(int newHeight)
    {
        this.height = newHeight;
    }

    public void setWeight(int newWeight)
    {
        this.weight = newWeight;
    }

    public double bodyMassIndex()
    {
        double heightDividedByHundred = this.height / 100.0;
        return this.weight / (heightDividedByHundred * heightDividedByHundred);
    }

    public boolean olderThan(Person compared)
    {
        // can still access age in compared.age bc private variables can be read in all
        //      methods that the class in question contains
        if (this.age > compared.age)
            return true;

        return false;
    }

    // with this, we can just call something like System.out.println(bob);
    public String toString()
    {
        return this.name + ", born " + this.birthMyDate;
    }

    public static void main(String[] args) {
        Person martin = new Person("Martin", 24, 4, 1983);

        Person juhana = new Person("Juhana", 17, 9, 1985);

        System.out.println( martin );
        System.out.println( juhana );
    }
}