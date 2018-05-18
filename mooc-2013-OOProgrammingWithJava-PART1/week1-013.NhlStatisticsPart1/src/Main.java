
import nhlstats.NHLStatistics;

public class Main {

    public static void main(String[] args) {
        
        // prints top ten players based on goals
        NHLStatistics.sortByGoals();
        NHLStatistics.top(10);
        
        System.out.println("");
        
        // prints top 25 players based on penalty amounts
        NHLStatistics.sortByPenalties();
        NHLStatistics.top(25);
        
        System.out.println("");
        
        // prints statistics for Sidney Crosby
        NHLStatistics.searchByPlayer("Sidney Crosby");
        
        System.out.println("");
        
        // prints stats for Philadelphia Flyers
        NHLStatistics.teamStatistics("PHI");
        
        System.out.println("");
        
        // prints the players in Anaheim Ducks ordered by points
        NHLStatistics.sortByPoints();
        NHLStatistics.teamStatistics("ANA");
    }
}
