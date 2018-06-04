import java.util.Scanner;
import java.util.ArrayList;

public class BirdWatchers
{
    private ArrayList<Bird> birds;

    public BirdWatchers()
    {
        birds = new ArrayList<Bird>();
    }

    public void addBird(String birdName, String latinName)
    {
        birds.add(new Bird(birdName, latinName));
    }

    public void obersvedBird(String birdName)
    {
        boolean birdFound = false;

        for (Bird bird : birds)
        {
            if (bird.getBirdName().equals(birdName))
            {
                birdFound = true;
                bird.incrementObservation();
            }
        }

        if (!birdFound)
            System.out.println("Is not a bird!");
    }

    public static void getStatistics(BirdWatchers birdWatchers)
    {
        // can access private variable even though static method bc same class
        for (Bird bird : birdWatchers.birds)
            System.out.println(bird);
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        BirdWatchers birdWatchers = new BirdWatchers();

        System.out.print("? ");
        String command = scanner.nextLine();
        String birdName = "";
        String latinName = "";
        String observation = "";

        command = command.toLowerCase();
        command = command.trim();

        while (!command.equals("quit"))
        {
            if (command.equals("add"))
            {
                System.out.print("Name: ");
                birdName = scanner.nextLine();

                System.out.print("Latin Name: ");
                latinName = scanner.nextLine();

                birdWatchers.addBird(birdName, latinName);
            }

            if (command.equals("observation"))
            {
                System.out.print("What was observed? ");
                observation = scanner.nextLine();

                birdWatchers.obersvedBird(observation);
            }

            if (command.equals("statistics"))
            {
                getStatistics(birdWatchers);
            }

            System.out.print("? ");
            command = scanner.nextLine();
            command = command.toLowerCase();
            command = command.trim();
        }
    }
}