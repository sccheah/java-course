package file;
import java.io.File;
import java.util.Scanner;

public class Analysis {
    private File file;

    public Analysis(File file) throws Exception {
        this.file = file;
    }

    // returns the number of lines in the file
    public int lines() throws Exception {
        Scanner reader = new Scanner(file);
        int numOfLines = 0;
        
        while (reader.hasNextLine()) {
            reader.nextLine();
            numOfLines++;
        }

        return numOfLines;
    }

    // returns the number of characters in the file
    public int characters() throws Exception {
        Scanner reader = new Scanner(file);
        String line;
        int numOfChars = 0;

        while (reader.hasNextLine()) {
            line = reader.nextLine();
            numOfChars += line.length();
        }

        return numOfChars;
    }

    public static void main(String[] args) {
        try {
            File file = new File("file/testFile.txt");
            Analysis analysis = new Analysis(file);
            System.out.println("Lines: " + analysis.lines());
            System.out.println("Characters: " + analysis.characters());
        } 
        catch (Exception e) {
            System.out.println(e);
            return;
        }
    }
}