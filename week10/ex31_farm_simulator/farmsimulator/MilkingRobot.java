package farmsimulator;

public class MilkingRobot {
    private BulkTank bulkTank;

    public MilkingRobot() { bulkTank = null; }
    public BulkTank getBulkTank() { return bulkTank; }
    public void setBulkTank(BulkTank tank) { bulkTank = tank; }
    public void milk(Milkable milkable) {
        if (bulkTank == null)
            throw new IllegalStateException("The MilkingRobot hasn't been installed");

        bulkTank.addToTank(milkable.milk());
    }

    public static void main(String[] args) {
        MilkingRobot milkingRobot = new MilkingRobot();
        Cow cow = new Cow();
        System.out.println("");

        BulkTank tank = new BulkTank();
        milkingRobot.setBulkTank(tank);
        System.out.println("Bulk tank: " + tank);

        for(int i = 0; i < 2; i++) {
            System.out.println(cow);
            System.out.println("Living..");
            for(int j = 0; j < 5; j++) {
                cow.liveHour();
            }
            System.out.println(cow);

            System.out.println("Milking...");
            milkingRobot.milk(cow);
            System.out.println("Bulk tank: " + tank);
            System.out.println("");
        }
    }
}