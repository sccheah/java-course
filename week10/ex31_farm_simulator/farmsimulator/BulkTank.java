package farmsimulator;

public class BulkTank {
    private double capacity;
    private double volume;

    public BulkTank() { this(2000); }
    public BulkTank(double capacity) { this.capacity = capacity; } 
    public double getCapacity() { return capacity; }
    public double getVolume() { return this.volume; }
    public double howMuchFreeSpace() { return capacity - volume; }

    public void addToTank(double amount) { 
        if (volume + amount >= capacity) {
            volume = capacity;
            return;
        }

        volume += amount; 
    }

    public double getFromTank(double amount) { 
        if (amount <= volume) {
            volume -= amount;
            return amount;
        }
        else {
            double vol = volume;
            volume = 0;
            return vol;
        }
    }

    public String toString() {
        return volume + "/" + capacity;
    }
    
    public static void main(String[] args) {
        BulkTank tank = new BulkTank();
        tank.getFromTank(100);
        tank.addToTank(25);
        tank.getFromTank(5);
        System.out.println(tank);

        tank = new BulkTank(50);
        tank.addToTank(100);
        System.out.println(tank);
    }
}