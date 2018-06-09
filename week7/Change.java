import java.lang.StringBuilder;
import java.lang.String;

/*
create a character string changer, which consists of two classes. 
The class Changer turns a single character to another one. 
The Changer holds a number of Changes and changes character strings with the 
    help of Change objects it holds.
*/

public class Change
{
    private char fromCharacter, toCharacter;

    public Change(char fromCharacter, char toCharacter)
    {
        this.fromCharacter = fromCharacter;
        this.toCharacter = toCharacter;
    }

    public String change(String characterString)
    {
        // uses StringBuilder class
        // StringBuilder newString = new StringBuilder(characterString);

        // for (int i = 0; i < newString.length(); i++)
        // {
        //     if (newString.charAt(i) == fromCharacter)
        //         newString.setCharAt(i, toCharacter);
        // }

        // return newString.toString();

        String newString = "";

        for (int i = 0; i < characterString.length(); i++)
        {
            if (characterString.charAt(i) == fromCharacter)
                newString += toCharacter;
            else
                newString += characterString.charAt(i);
        }

        return newString;
    }

    public static void main(String[] args)
    {
        String word = "carroa";
        Change change1 = new Change('a', 'b');
        word = change1.change(word);

        System.out.println(word);

        Change Change2 = new Change('r', 'x');
        word = Change2.change(word);

        System.out.println(word);
    }
}