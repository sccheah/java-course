import java.util.ArrayList;

public class Container {
    private ArrayList<Suitcase> container;
    private double maxWeight;
    private double weight;

    public Container(double maxWeight) {
        this.container = new ArrayList<Suitcase>();
        this.maxWeight = maxWeight;
        weight = 0.0;
    }

    public void addSuitcase(Suitcase suitcase) {
        if (suitcase.totalWeight() + weight > maxWeight)
            return;

        container.add(suitcase);
        weight += suitcase.totalWeight();
    }

    public String toString() { return container.size() + " suitcases (" + weight + " kg)"; }

    public void printThings() {
        for (Suitcase suitcase : container)
            suitcase.printThings();
    }

    public static void addSuitcasesFullOfBricks(Container container) {
        Suitcase suitcase;
        Thing brick;

        for (int i = 0; i < 100; i++) {
            brick = new Thing("Brick", 1.0 + i);
            suitcase = new Suitcase(1000);
            suitcase.addThing(brick);

            container.addSuitcase(suitcase);
        }
    }

    public static void main(String[] args) {
        Thing book = new Thing("Happiness in Three Steps", 2);
        Thing mobile = new Thing("Nokia 3210", 1);
        Thing brick = new Thing("Brick", 4);

        Suitcase tomsCase = new Suitcase(10);
        tomsCase.addThing(book);
        tomsCase.addThing(mobile);

        Suitcase georgesCase = new Suitcase(10);
        georgesCase.addThing(brick);

        Container container = new Container(1000);
        container.addSuitcase(tomsCase);
        container.addSuitcase(georgesCase);

        System.out.println("There are the following things in the container suitcases:");
        container.printThings();

        container = new Container(1000);
        addSuitcasesFullOfBricks(container);
        System.out.println(container);
    }
}