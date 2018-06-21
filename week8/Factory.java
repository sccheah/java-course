import java.util.Random;

public class Factory {

    public Item produceNew() {
        Random random = new Randon();
        int num = random.nextInt(5);

        if (!num) {
            return new CD ("Pink Floyd", "Dark Side of the Moon", 1973);
        } else if (num == 1) {
            return new CD("Wigwam", "Nuclear Nightclub", 1975);
        } else if (num == 2) {
            return new Book1("Robert Martin", "Clean Code", 1);
        } else if (num == 3) {
            return new Book1("Ken Beck", "Test Driven Development", 0.7);
        } else {
            return new ChocolateBar();
        }
    }
}