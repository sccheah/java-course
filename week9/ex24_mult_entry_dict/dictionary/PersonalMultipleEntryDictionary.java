package dictionary;

import java.util.Map;
import java.util.Set;
import java.util.HashSet;
import java.util.HashMap;

public class PersonalMultipleEntryDictionary implements MultipleEntryDictionary {
    private Map<String, Set<String>> dictionary;

    public PersonalMultipleEntryDictionary() { dictionary = new HashMap<String, Set<String>>(); }

    @Override
    public void add(String word, String entry) {
        if (!dictionary.containsKey(word)) {
            dictionary.put(word, new HashSet<String>());
        }

        Set<String> list = dictionary.get(word);
        list.add(entry);
    }

    @Override
    public Set<String> translate(String word) { return dictionary.get(word); }

    @Override
    public void remove(String word) {
        dictionary.remove(word);
    }

    public static void main(String[] args) {
        MultipleEntryDictionary dict = new PersonalMultipleEntryDictionary();
        dict.add("kuusi", "six");
        dict.add("kuusi", "spruce");

        dict.add("pii", "silicon");
        dict.add("pii", "pi");

        System.out.println(dict.translate("kuusi"));
        dict.remove("pii");
        System.out.println(dict.translate("pii"));
    }

}