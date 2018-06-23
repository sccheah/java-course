package container;

public class ProductContainerRecorder extends ProductContainer {
    private ContainerHistory containerHistory;

    public ProductContainerRecorder(String productName, double Capacity, double initialVolume) {
        super(productName, Capacity);
        containerHistory = new ContainerHistory();
        addToTheContainer(initialVolume); // can call this even though we are the grandchild
    }

    public String history() { return containerHistory.toString(); }

    @Override
    public void addToTheContainer(double amount) {
        if (amount <= 0)
            return;

        if (amount + volume > originalCapacity) 
        {
            volume = originalCapacity;
            return;
        }

        volume += amount;
        containerHistory.add(volume);
    }

    @Override
    public double takeFromTheContainer(double amount) {
        if (amount <= 0)
            return 0;

        if (amount >= volume)
        {
            containerHistory.add(0.0);
            return volume;
        }
        volume -= amount;
        containerHistory.add(volume);
        
        return amount;
    }

    public void printAnalysys() {
        System.out.println("Product: " + getName());
        System.out.println("History: " + containerHistory.toString());
        System.out.println("Greatest product amount: " + containerHistory.maxValue());
        System.out.println("Smallest product amount: " + containerHistory.minValue());
        System.out.println("Average: " + containerHistory.average());
        System.out.println("Greatest change: " + containerHistory.greatestFluctuation());
        System.out.println("Variance: " + containerHistory.variance());
    }

    public static void main(String[] args) {
        ProductContainerRecorder juice = new ProductContainerRecorder("Juice", 1000.0, 1000.0);
        juice.takeFromTheContainer(11.3);
        System.out.println(juice.getName()); // Juice
        juice.addToTheContainer(1.0);
        System.out.println(juice);           // Juice: volume = 989.7, free space 10.3
        // but now we have our history record
        System.out.println(juice.history()); // [1000.0, 988.7, 989.7]
        juice.printAnalysys();
    }

   
}