package moving.domain;
import java.lang.Comparable;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

// implement interface Thing

public class Item implements Thing, Comparable<Thing> {
    private String name;
    private int volume;

    public Item(String name, int volume) {
        this.name = name;
        this.volume = volume;
    }

    @Override
    public int getVolume() { return volume; }

    @Override 
    public int compareTo(Thing other) {
        return this.volume - other.getVolume();
    }

    public String getName() { return name; }
    public String toString() {
        return name + " (" + volume + " dm^3)";
    }

    public static void main(String[] args) {
        List<Item> items = new ArrayList<Item>();
        items.add(new Item("passport", 2));
        items.add(new Item("toothbrash", 1));
        items.add(new Item("circular saw", 100));

        Collections.sort(items);
        System.out.println(items);
    }
}