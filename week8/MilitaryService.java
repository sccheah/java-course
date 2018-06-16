public class MilitaryService implements NationalService {
    private int daysLeft;

    public MilitaryService(int daysLeft) { this.daysLeft = daysLeft; }

    @Override 
    public int getDaysLeft() { return daysLeft; }

    @Override
    public void work() { daysLeft -= 1; }
}