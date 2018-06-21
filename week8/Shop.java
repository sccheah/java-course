import java.util.Scanner;

public class Shop {
    private Storehouse store;
    private Scanner reader;

    public Shop(Storehouse store, Scanner reader) {
        this.store = store;
        this.reader = reader;
    }

    // method to deal with a customer in a shop
    public void manage(String customer) {
        ShoppingBasket basket = new ShoppingBasket();
        System.out.println("Welcome to our shop " + customer);
        System.out.println("Below is our sale offer:");

        for (String product : store.products()) {
            System.out.println(product);
        }

        while(true) {
            System.out.print("What do you want to buy (press enter to pay): ");
            String product = reader.nextLine();

            if (product.isEmpty())
                break;

            if (store.take(product)) {
                basket.add(product, store.price(product));
            }
        }

        System.out.println("Your purchases are:");
        basket.print();
        System.out.println("basket price: " + basket.price());
    }

    public static void main(String[] args) {
        Storehouse store = new Storehouse();
        store.addProduct("coffee", 5, 10);
        store.addProduct("milk", 3, 20);
        store.addProduct("milkbutter", 2, 55);
        store.addProduct("bread", 7, 8);

        Shop shop = new Shop(store, new Scanner(System.in));
        shop.manage("Pekka");
    }
}