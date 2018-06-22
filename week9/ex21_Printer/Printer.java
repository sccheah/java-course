import java.util.Scanner;
import java.io.File;

public class Printer {
    private File file;

    public Printer(String fileName) throws Exception {
        file = new File(fileName);
    }

    public void printLinesWhichContain(String word) throws Exception {
        Scanner reader = new Scanner(file);
        String originalLine, lowerCaseLine;
        word.toLowerCase();

        while(reader.hasNextLine()) {
            originalLine = reader.nextLine();
            lowerCaseLine = originalLine;
            lowerCaseLine.toLowerCase();

            if (lowerCaseLine.contains(word)) {
                System.out.println(originalLine);
            }
        }
    }

    public static void main(String[] args) {
        try {
            Printer printer = new Printer("textfile.txt");
            printer.printLinesWhichContain("Väinämöinen");
            System.out.println("-----");
            printer.printLinesWhichContain("Frank Zappa");
            System.out.println("-----");
            printer.printLinesWhichContain("");
            System.out.println("-----");
        } 
        catch(Exception e) {
            System.out.println(e);
        }
    }
}