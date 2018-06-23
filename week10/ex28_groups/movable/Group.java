package movable;

import java.util.List;
import java.util.ArrayList;

public class Group implements Movable {
    private List<Movable> movables;

    public Group() { movables = new ArrayList<Movable>(); }

    public String toString() {
        String str = new String();

        for (Movable movable : movables) {
            str += movable.toString();
            str += "\n";
        }

        return str;
    }

    public void addToGroup(Movable movable) {
        movables.add(movable);
    }

    @Override
    public void move(int dx, int dy) {
        for (Movable movable : movables) {
            movable.move(dx, dy);
        }
    }

    public static void main(String[] args) {
        Group group = new Group();
        group.addToGroup(new Organism(73, 56));
        group.addToGroup(new Organism(57, 66));
        group.addToGroup(new Organism(46, 52));
        group.addToGroup(new Organism(19, 107));
        System.out.println(group);
    }
}