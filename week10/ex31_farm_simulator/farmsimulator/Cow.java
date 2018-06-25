package farmsimulator;

import java.util.Random;

public class Cow implements Milkable, Alive{
    private static final String[] NAMES = new String[]{
        "Anu", "Arpa", "Essi", "Heluna", "Hely",
        "Hento", "Hilke", "Hilsu", "Hymy", "Ihq", "Ilme", "Ilo",
        "Jaana", "Jami", "Jatta", "Laku", "Liekki",
        "Mainikki", "Mella", "Mimmi", "Naatti",
        "Nina", "Nyytti", "Papu", "Pullukka", "Pulu",
        "Rima", "Soma", "Sylkki", "Valpu", "Virpi"};

    private String name;
    private int udderCapacity;
    private double milkVolume;

    public Cow() {
        this(NAMES[new Random().nextInt(NAMES.length)]);
    }

    public Cow(String name) {
        this.name = name;
        udderCapacity = new Random().nextInt(26) + 15;
        milkVolume = 0.0;
    }

    public String getName() { return name; }
    public double getCapacity() { return udderCapacity; }
    public double getAmount() { return milkVolume; }

    public String toString() {
        return name + " " + milkVolume + "/" + udderCapacity;
    }

    @Override // from Milkable
    public double milk() {
        double milk = milkVolume;
        milkVolume = 0.0;

        return milk;
    }

    @Override // from Alive interface
    public void liveHour() {
        milkVolume += new Random().nextDouble() * (2.0 - 0.7) + 0.7;
    }

    public static void main(String[] args) {
        Cow cow = new Cow();
        System.out.println(cow);


        Alive livingCow = cow;
        livingCow.liveHour();
        livingCow.liveHour();
        livingCow.liveHour();
        livingCow.liveHour();

        System.out.println(cow);

        Milkable milkingCow = cow;
        milkingCow.milk();

        System.out.println(cow);
        System.out.println("");

        cow = new Cow("Ammu");
        System.out.println(cow);
        cow.liveHour();
        cow.liveHour();
        System.out.println(cow);
        cow.milk();
        System.out.println(cow);
    }
}