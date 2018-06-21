public class Main {
    public static void main(String[] args) {
        // Book1 book1 = new Book1("Fedor Dostojevski", "Crime and Punishment", 2);
        // Book1 book2 = new Book1("Robert Martin", "Clean Code", 1);
        // Book1 book3 = new Book1("Kent Beck", "Test Driven Development", 0.5);

        // CD cd1 = new CD("Pink Floyd", "Dark Side of the Moon", 1973);
        // CD cd2 = new CD("Wigwam", "Nuclear Nightclub", 1975);
        // CD cd3 = new CD("Rendezvous Park", "Closer to Being Here", 2012);

        // System.out.println(book1);
        // System.out.println(book2);
        // System.out.println(book3);
        // System.out.println(cd1);
        // System.out.println(cd2);
        // System.out.println(cd3);

        Box box = new Box(10);

        box.add( new Book1("Fedor Dostojevski", "Crime and Punishment", 2) ) ;
        box.add( new Book1("Robert Martin", "Clean Code", 1) );
        box.add( new Book1("Kent Beck", "Test Driven Development", 0.7) );

        box.add( new CD("Pink Floyd", "Dark Side of the Moon", 1973) );
        box.add( new CD("Wigwam", "Nuclear Nightclub", 1975) );
        box.add( new CD("Rendezvous Park", "Closer to Being Here", 2012) );

        System.out.println( box );

        Box box1 = new Box(20);
        box1.add(box);
        box1.add(new Book1("gayle", "Cracking the Coding Interview", 5));
        System.out.println(box1); 
    }
}