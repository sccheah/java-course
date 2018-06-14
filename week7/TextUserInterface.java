import java.util.Scanner;

public class TextUserInterface {
    private Scanner scanner;
    private Dictionary dictionary;

    public TextUserInterface(Scanner reader, Dictionary dictionary) {
        scanner = reader;
        this.dictionary = dictionary;
    }

    private void printMenu() {
        System.out.println("Statements:");
        System.out.println("    add - adds a word pair to the dictionary");
        System.out.println("    translate - asks a word and prints its translation");
        System.out.println("    quit - quits the text user interface");
    }

    public void start() {
        printMenu();

        System.out.print("\nStatement: ");
        String statement = scanner.nextLine();
        statement.toLowerCase();
        statement = statement.trim();

        String word, translation;

        while (!statement.equals("quit")) {
            if (statement.equals("add")) {
                System.out.print("In Finnish: ");
                word = scanner.nextLine();
                
                System.out.print("Translation: ");
                translation = scanner.nextLine();

                dictionary.add(word, translation);
            }

            if (statement.equals("translate")) {
                System.out.print("Give a word: ");
                word = scanner.nextLine();

                System.out.println("Translation: " + dictionary.translate(word));
            }

            System.out.print("\nStatement: ");
            statement = scanner.nextLine();
        }

        System.out.println("Cheers!");
    }

    public static void main(String[] args) {
        //Scanner reader = new Scanner(System.in);
        String input = "translate\n" + "monkey\n"  +
                   "translate\n" + "cheese\n" +
                   "add\n"  + "cheese\n" + "juusto\n" +
                   "translate\n" + "cheese\n" +
                   "quit\n";
        Scanner reader = new Scanner(input);
        Dictionary dictionary = new Dictionary();

        TextUserInterface UI = new TextUserInterface(reader, dictionary);
        UI.start();
    }
}