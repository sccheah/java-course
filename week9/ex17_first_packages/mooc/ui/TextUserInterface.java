package mooc.ui;
//import mooc.ui.UserInterface; dont need to import this because we are in the same package already

public class TextUserInterface implements UserInterface {
    public void update() {
        System.out.println("Updating the user interface");
    }
}