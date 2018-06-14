public class Plane {
    private String ID;
    private int capacity;

    public Plane(String ID, int capacity) {
        this.ID = ID;
        this.capacity = capacity;
    }

    public String toString() { return ID + " (" + capacity + " ppl)"; }
}