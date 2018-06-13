/*
Create the class Thing whose objects can represent different kinds of things. 
The information to store are the thing's name and weight (kg).
*/
 
public class Thing {
    private String name;
    private double weight;

    public Thing(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() { return this.name; }
    public double getWeight() { return this.weight; }
    public String toString() { return name + " (" + weight + " kg)"; }

    public static void main(String[] args) {
        Thing book = new Thing("Happiness in Three Steps", 2);
        Thing mobile = new Thing("Nokia 3210", 1);

        System.out.println("Book name: " + book.getName());
        System.out.println("Book weight: " + book.getWeight());

        System.out.println("Book: " + book);
        System.out.println("Mobile: " + mobile);
    }
}