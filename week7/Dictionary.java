import java.util.HashMap;
import java.util.ArrayList;

public class Dictionary {
    private HashMap<String, String> dictionary;

    public Dictionary() { dictionary = new HashMap<String, String>(); }

    public String translate(String word) {
        return dictionary.get(word);
    }

    public void add(String word, String translation) {
        dictionary.put(word, translation);
    }

    public int amountOfWords() { return dictionary.size(); }

    public ArrayList<String> translationList() {
        ArrayList<String> translation = new ArrayList<String>();
        String mapping;

        for (String key : dictionary.keySet()) {
            mapping = key + " = " + dictionary.get(key);
            translation.add(mapping);
        }

        return translation;
    }

    public static void main(String[] args) {
        Dictionary dictionary = new Dictionary();
        dictionary.add("apina", "monkey");
        dictionary.add("banaani", "banana");
        dictionary.add("cembalo", "harpsichord");

        System.out.println(dictionary.translate("apina"));
        System.out.println(dictionary.translate("porkkana"));
        System.out.println(dictionary.amountOfWords());

        ArrayList<String> translations = dictionary.translationList();
        for(String translation: translations) {
            System.out.println(translation);
        }
    }
}