import java.util.ArrayList;

public class Team
{
    private String name;
    private ArrayList<Player> players;
    private int maxSize;


    public Team(String name)
    {
        this.name = name;
        this.maxSize = 16;
        this.players = new ArrayList<Player>();
    }

    public String getName() { return name; }

    public void addPlayer(Player player)
    {
        if (size() < maxSize)
           players.add(player);
    }

    public int size() { return players.size(); }

    public void setMaxSize(int maxSize) { this.maxSize = maxSize; }

    public int goals()
    {
        int goals = 0;

        for (Player player : players)
        {
            goals += player.getGoals();
        }

        return goals;
    }

    public void printPlayers()
    {
        for (Player player : players)
            System.out.println(player);
    }

}