package farmsimulator;

import java.util.*;

public class Farm implements Alive{
    private String ownerName;
    private Barn barn;
    private List<Cow> cows;

    public Farm(String ownerName, Barn barn) {
        this.ownerName = ownerName;
        this.barn = barn;
        cows = new ArrayList<Cow>();
    }

    public String getOwner() { return ownerName; }
    public void addCow(Cow cow) { cows.add(cow); }

    public void manageCows() {
        barn.takeCareOf(cows);
    }

    public String toString() { 
        if (cows.size() == 0)
            return "Farm owner: " + ownerName + "\n" +
                    "Barn bulk tank: " + barn.toString() + "\n" +
                    "No cows.";
        
        String cowStr = "";

        for (Cow cow : cows) {
            cowStr += "        " + cow.toString() + "\n";
        }

        return "Farm owner: " + ownerName + "\n" +
                "Barn bulk tank: " + barn.toString() + "\n" +
                "Animals:\n" + cowStr;
    }

    public void installMilkingRobot(MilkingRobot robot) { barn.installMilkingRobot(robot); }

    @Override
    public void liveHour() {
        for (Cow cow : cows) 
            cow.liveHour();
    }

    public static void main(String[] args) {
        // Farm farm = new Farm("Esko", new Barn(new BulkTank()));
        // farm.addCow(new Cow());
        // farm.addCow(new Cow());
        // farm.addCow(new Cow());
        // farm.liveHour();
        // farm.liveHour();
        // System.out.println(farm);

        Farm farm = new Farm("Esko", new Barn(new BulkTank()));
        MilkingRobot robot = new MilkingRobot();
        farm.installMilkingRobot(robot);

        farm.addCow(new Cow());
        farm.addCow(new Cow());
        farm.addCow(new Cow());


        farm.liveHour();
        farm.liveHour();

        farm.manageCows();

        System.out.println(farm);
    }
}