import java.util.ArrayList;

public class Changer
{
    private ArrayList<Change> changer;
    
    public Changer() { changer = new ArrayList<Change>(); }

    public void addChange(Change change)
    {
        changer.add(change);
    }

    public String change(String characterString)
    {
        String newStr = new String(characterString);

        for (Change changes : changer)
            newStr = changes.change(newStr);

        return newStr;
    }

    public static void main(String[] args)
    {
        Changer scandiesAway = new Changer();
        scandiesAway.addChange(new Change('ä', 'a'));
        scandiesAway.addChange(new Change('ö', 'o'));
        System.out.println(scandiesAway.change("ääliö älä lyö, ööliä läikkyy"));
    }
}