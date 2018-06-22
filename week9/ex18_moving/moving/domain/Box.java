package moving.domain;
import java.util.List;
import java.util.ArrayList;

public class Box implements Thing {
    private int maximumCapacity;
    private List<Thing> things;

    // receives the box maximum capacity
    public Box(int maximumCapacity) {
        this.maximumCapacity = maximumCapacity;
        things = new ArrayList<Thing>();
    }

    @Override
    public int getVolume() {
        int volume = 0;

        for (Thing thing : things) {
            volume += thing.getVolume();
        }

        return volume;
    }

    // adds an item which implements the interface Thing to the box
    public boolean addThing(Thing thing) {
        if (getVolume() + thing.getVolume() <= maximumCapacity) {
            things.add(thing);
            
            return true;
        }

        return false;
    }

}