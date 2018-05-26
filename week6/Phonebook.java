import java.util.ArrayList;

public class Phonebook
{
    private ArrayList<Person> contacts;

    public Phonebook() { contacts = new ArrayList<Person>(); }

    public void add(String name, String number)
    {
        Person contact = new Person(name, number);
        contacts.add(contact);
    }

    public void printAll()
    {
        for (Person contact : contacts)
        {
            System.out.println(contact);
        }
    }

    public String searchNumber(String name)
    {
        for (Person contact : contacts)
        {
            if (contact.getName().equals(name))
                return contact.getNumber();
        }

        return "nubmer not known";
    }

    public static void main(String[] args) {
        Phonebook phonebook = new Phonebook();
        phonebook.add("Pekka Mikkola", "040-123123");
        phonebook.add("Edsger Dijkstra", "045-456123");
        phonebook.add("Donald Knuth", "050-222333");

        String number = phonebook.searchNumber("Pekka Mikkola");
        System.out.println( number );

        number = phonebook.searchNumber("Martti Tienari");
        System.out.println( number );
    }
}