import java.util.HashMap;
import java.util.Set;

public class Storehouse {
    private HashMap<String, Integer> prices;
    private HashMap<String, Integer> stocks;

    public Storehouse() {
        prices = new HashMap<String, Integer>();
        stocks = new HashMap<String, Integer>();
    }

    public void addProduct(String product, int price, int stock) {
        prices.put(product, price);
        stocks.put(product, stock);
    }

    public int price(String product) {
        Integer price = prices.get(product);

        if (price == null)
            return -99;

        return price;
    }

    public int stock(String product) {
        Integer stock = stocks.get(product);

        if (stock == null)
            return 0;
        
        return stock;
    }

    public boolean take(String product) {
        Integer stock = stocks.get(product);

        if (stock == null || stock == 0)
            return false;
        
        stocks.put(product, --stock);

        return true;
    }

    public Set<String> products() {
        return stocks.keySet();
    }

    public static void main(String[] args) {
        Storehouse store = new Storehouse();
        store.addProduct("milk", 3, 10);
        store.addProduct("coffee", 5, 7);

        System.out.println("prices:");
        System.out.println("milk:  " + store.price("milk"));
        System.out.println("coffee:  " + store.price("coffee"));
        System.out.println("sugar: " + store.price("sugar"));

        store.addProduct("coffee", 5, 1);

        System.out.println("stocks:");
        System.out.println("coffee:  " + store.stock("coffee"));
        System.out.println("sugar: " + store.stock("sugar"));

        System.out.println("we take a coffee " + store.take("coffee"));
        System.out.println("we take a coffee " + store.take("coffee"));
        System.out.println("we take sugar " + store.take("sugar"));

        System.out.println("stocks:");
        System.out.println("coffee:  " + store.stock("coffee"));
        System.out.println("sugar: " + store.stock("sugar"));
    }
}