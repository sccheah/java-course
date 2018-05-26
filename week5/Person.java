public class Person
{
    private String name;
    private int age;
    private int height;
    private int weight;

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

    public void print_person()
    {
        System.out.println(this.name + ", age " + this.age + " years");
    }

    public void become_older()
    {
        this.age++;
    }

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

    // with this, we can just call something like System.out.println(bob);
    public String toString()
    {
        return this.name + ", age " + this.age + " years";
    }
}