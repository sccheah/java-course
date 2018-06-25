package farmsimulator;

import java.util.Collection;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Barn {
    private BulkTank tank;
    private MilkingRobot milkingRobot;

    public Barn(BulkTank tank) {
        this.tank = tank;
    }

    public BulkTank getBulkTank() { return tank; }
    public void installMilkingRobot(MilkingRobot milkingRobot) { 
        this.milkingRobot = milkingRobot; 
        this.milkingRobot.setBulkTank(tank);
    }
    public void takeCareOf(Cow cow) { 
        if (milkingRobot == null)
            throw new IllegalStateException("Milking Robot has not been installed.");
        
        milkingRobot.milk(cow);
    }

    public void takeCareOf(Collection<Cow> cows) {
        if (milkingRobot == null)
            throw new IllegalStateException("Milking Robot has not been installed.");

        for (Cow cow : cows) 
            milkingRobot.milk(cow);
    }

    public String toString() {
        return tank.toString();
    }

    public static void main(String[] args) {
        Barn barn = new Barn(new BulkTank());
        System.out.println("Barn: " + barn);

        MilkingRobot robot = new MilkingRobot();
        barn.installMilkingRobot(robot);

        Cow ammu = new Cow();
        ammu.liveHour();
        ammu.liveHour();

        barn.takeCareOf(ammu);
        System.out.println("Barn: " + barn);

        LinkedList<Cow> cowList = new LinkedList<Cow>();
        cowList.add(ammu);
        cowList.add(new Cow());

        for(Cow cow: cowList) {
            cow.liveHour();
            cow.liveHour();
        }

        barn.takeCareOf(cowList);
        System.out.println("Barn: " + barn);
    }

}