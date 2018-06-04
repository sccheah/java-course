public class Bird
{
    private String birdName;
    private String latinName;
    private int observedCount;

    public Bird(String birdName, String latinName)
    {
        this(birdName, latinName, 0);
    }

    public Bird(String birdName, String latinName, int observedCount)
    {
        this.birdName = birdName;
        this.latinName = latinName;
        this.observedCount = observedCount;
    }

    public String getBirdName() { return birdName; }

    public void incrementObservation() { observedCount++; }

    public String toString()
    {
        return birdName + " (" + latinName + "): " + observedCount + " observations";
    }

}