
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

        for (int i = 0; i < 30; i++)
            bob.become_older();

        martin.become_older();

        System.out.println(bob);
        System.out.println(martin);
        System.out.println(brian);

        System.out.println();

        if ( martin.is_adult() ) {
            System.out.println(martin.get_name() + " is an adult");
        } else {
            System.out.println(martin.get_name() + " is an adult");
        }

        if ( bob.is_adult() ) {
            System.out.println(bob.get_name() + " is an adult");
        } else {
            System.out.println(bob.get_name() + " is an minor");
        }

        System.out.println();
        //////// Product
        Product product = new Product("Banana", 1.1, 13);
        product.print_product();

        /////////////////////////
        System.out.println();
        System.out.println();

        Person matti = new Person("Matti");
        Person john = new Person("John");

        matti.setHeight(180);
        matti.setWeight(86);

        john.setHeight(175);
        john.setWeight(64);

        System.out.println(matti.get_name() + ", body mass index: " + String.format("%.2f", matti.bodyMassIndex()));
        System.out.println(john.get_name() + ", body mass index: " + String.format("%.2f", john.bodyMassIndex()));
    }
}