package moving.logic;
import moving.domain.*;
import java.util.List;
import java.util.ArrayList;

public class Packer {
    private int boxesVolume;

    public Packer(int boxesVolume) {
        this.boxesVolume = boxesVolume;
    }

    public List<Box> packThings(List<Thing> things) {
        List<Box> boxes = new ArrayList<Box>();
        Box box = new Box(boxesVolume);

        for (Thing thing : things) {
            if (!box.addThing(thing)) {
                boxes.add(box);
                box = new Box(boxesVolume);
                box.addThing(thing);
            }
        }

        boxes.add(box);

        return boxes;
    }

    public static void main(String[] args) {
        // the things we want to pack
        List<Thing> things = new ArrayList<Thing>();
        things.add(new Item("passport", 2));
        things.add(new Item("toothbrash", 1));
        things.add(new Item("book", 4));
        things.add(new Item("circular saw", 8));

        // we create a packer which uses boxes whose valume is 10
        Packer packer = new Packer(10);

        // we ask our packer to pack things into boxes
        List<Box> boxes = packer.packThings( things );

        System.out.println("number of boxes: "+boxes.size());

        for (Box box : boxes) {
            System.out.println("  things in the box: "+box.getVolume()+" dm^3");
        }
    }
}