// Simple phonebook

public class Person
{
    private String name;
    private String phoneNumber;

    public Person(String name, String phoneNumber)
    {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() { return name; }
    public String getNumber() { return phoneNumber; }

    public void changeNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }

    public String toString()
    {
        return name + " number: " + phoneNumber;
    }

    public static void main(String[] args)
    {
        Person pekka = new Person("Pekka Mikkola", "040-123123");

        System.out.println(pekka.getName());
        System.out.println(pekka.getNumber());

        System.out.println(pekka);
        pekka.changeNumber("050-333444");
        System.out.println(pekka);
    }
}