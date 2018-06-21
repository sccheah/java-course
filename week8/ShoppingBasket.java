import java.util.Map;
import java.util.HashMap;

public class ShoppingBasket {
    Map<String, Purchase> items;

    public ShoppingBasket() { items = new HashMap<String, Purchase>(); }

    public void add(String product, int price) {
        Purchase item = items.get(product);

        // if it was not already in the shopping basket, then add it
        if (items.get(product) == null) {
            item = new Purchase(product, 1, price);
            items.put(product, item);
        }
        else {
            // if it already exists in shopping basket, increase the amount
            item.increaseAmount();
        }
    }

    // calc the price of all items in basket
    public int price() {
        int price = 0;

        for (Purchase item : items.values()) {
            price += (item.price() * item.amount());
        }

        return price;
    }

    public void print() {
        for (Purchase item : items.values()) {
            System.out.println(item);
        } 
    }

    public static void main(String[] args) {
        ShoppingBasket basket = new ShoppingBasket();
        basket.add("milk", 3);
        basket.print();
        System.out.println("basket price: " + basket.price() +"\n");

        basket.add("buttermilk", 2);
        basket.print();
        System.out.println("basket price: " + basket.price() +"\n");

        basket.add("milk", 3);
        basket.print();
        System.out.println("basket price: " + basket.price() +"\n");

        basket.add("milk", 3);
        basket.print();
        System.out.println("basket price: " + basket.price() +"\n");
    }
}