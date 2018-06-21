import java.util.ArrayList;

public class Box implements Item {
    private double maxWeight;
    private ArrayList<Item> items;

    public Box(double maxWeight) { 
        this.maxWeight = maxWeight; 
        items = new ArrayList<Item>();
    }

    public void add(Item item) { 
        if (weight() + item.weight() <= maxWeight)
            items.add(item); 
    }

    public double weight() {
        double weight = 0.0;

        for (Item item : items) {
            weight += item.weight();
        }

        return weight;
    }

    public String toString() {
        return "Box: " + items.size() + " things, total weight " + weight() + " kg";
    }
}