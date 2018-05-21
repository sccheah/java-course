
public class Main
{
    public static void main(String [] args)
    {
        Person bob = new Person("Bob");
        Person martin = new Person("Martin");
        Person brian = new Person("Brian");

        bob.print_person();
        martin.print_person();
        brian.print_person();

        System.out.println();

        bob.become_older();
        bob.become_older();
        martin.become_older();

        bob.print_person();
        martin.print_person();
        brian.print_person();

        System.out.println();
        //////// Product
        Product product = new Product("Banana", 1.1, 13);
        product.print_product();
    }
}