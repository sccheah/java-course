import java.util.ArrayList;

/*
Create the class Suitcase. 
Suitcase has things and a maximum weight limit, 
    which defines the greatest total allowed weight of the things contained within the Suitcase object.
*/

public class Suitcase {
    private ArrayList<Thing> things;
    private double weightLimit;
    private double weight;

    public Suitcase(double weightLimit) {
        things = new ArrayList<Thing>(); 
        this.weight = 0.0;
        this.weightLimit = weightLimit; 
    }

    public void addThing(Thing thing) {
        things.add(thing);
        weight += thing.getWeight();
    }

    public String toString() { 
        if (things.size() == 0)
            return "empty";
        else if (things.size() == 1)
            return "1 thing (" + weight + " kg)";
        else   
            return things.size() + " things (" + weight + " kg)"; 
    }

    public void printThings()
    {
        for (Thing thing : things)
            System.out.println(thing);
    }

    public double totalWeight() {
        return weight;
    }

    public Thing heaviestThing() {
        if (things.size() == 0)
            return null;

        Thing heaviestThing = things.get(0);

        for (Thing thing : things) {
            if (heaviestThing.getWeight() < thing.getWeight())
                heaviestThing = thing;
        }

        return heaviestThing;
    }

    public static void main(String[] args) {
        Thing book = new Thing("Happiness in Three Steps", 2);
        Thing mobile = new Thing("Nokia 3210", 1);
        Thing brick = new Thing("Brick", 4);

        Suitcase suitcase = new Suitcase(10);
        suitcase.addThing(book);
        suitcase.addThing(mobile);
        suitcase.addThing(brick);

        Thing heaviest = suitcase.heaviestThing();
        System.out.println("The heaviest thing: " + heaviest);
    }
}