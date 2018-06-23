package container;

public class Container {
    protected double originalCapacity;
    protected double volume;

    public Container(double capacity) {

        volume = 0;

        if (capacity <= 0) {
            this.originalCapacity = 0;
            return;
        }

        this.originalCapacity = capacity;
    }

    public double getVolume() { return volume; }
    public double getOriginalCapacity() { return originalCapacity; }
    public double getCurrentCapacity() { return originalCapacity - volume; }
    
    public void addToTheContainer(double amount) {
        if (amount <= 0)
            return;

        if (amount + volume > originalCapacity) 
        {
            volume = originalCapacity;
            return;
        }

        volume += amount;
    }

    public double takeFromTheContainer(double amount) {
        if (amount <= 0)
            return 0;

        if (amount >= volume)
            return volume;

        volume -= amount;
        return amount;
    }

    public String toString() {
        return "volume = " + volume + ", free space " + (originalCapacity - volume);
    }
}