package movable;

public class Organism implements Movable {
    private int x, y;

    public Organism(int x, int y) {
        this.x = x; 
        this.y = y;
    }

    public String toString() {
        return "x: " + x + "; y: " + y;
    }

    @Override
    public void move(int dx, int dy) {
        x += dx;
        y += dy;
    }

    public static void main(String[] args) {
        Organism organism = new Organism(20, 30);
        System.out.println(organism);
        organism.move(-10, 5);
        System.out.println(organism);
        organism.move(50, 20);
        System.out.println(organism);
    }
}