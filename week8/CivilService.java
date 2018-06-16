public class CivilService implements NationalService {
    private int daysLeft;

    public CivilService(int daysLeft) { this.daysLeft = daysLeft; }
    
    @Override
    public int getDaysLeft() { return daysLeft; }

    @Override
    public void work() { daysLeft -= 1; }
}