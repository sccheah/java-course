package tools;

import java.util.Map;
import java.util.HashMap;
import java.util.Set;

public class PersonalDuplicateRemover implements DuplicateRemover {
    private Map<String, Integer> duplicates;

    public PersonalDuplicateRemover() { duplicates = new HashMap<String, Integer>(); }

    @Override
    public void add(String characterString) {
        if (!duplicates.containsKey(characterString)) {
            duplicates.put(characterString, 0);
        }

        Integer count = duplicates.get(characterString);
        count++;
        duplicates.put(characterString, count);
    }

    @Override
    public int getNumberOfDetectedDuplicates() {
        int count = 0;

        for (Integer duplicate : duplicates.values()) {
            if (duplicate > 1)
                count++;
        }

        return count;
    }

    @Override 
    public Set<String> getUniqueCharacterStrings() {
        return duplicates.keySet();
    }

    @Override
    public void empty() {
        duplicates.clear();
    }

    public static void main(String[] args) {
        DuplicateRemover remover = new PersonalDuplicateRemover();
        remover.add("first");
        remover.add("second");
        remover.add("first");

        System.out.println("Current number of duplicates: " +
            remover.getNumberOfDetectedDuplicates());

        remover.add("last");
        remover.add("last");
        remover.add("new");

        System.out.println("Current number of duplicates: " +
            remover.getNumberOfDetectedDuplicates());

        System.out.println("Unique characterStrings: " +
            remover.getUniqueCharacterStrings());

        remover.empty();

        System.out.println("Current number of duplicates: " +
            remover.getNumberOfDetectedDuplicates());

        System.out.println("Unique characterStrings: " +
            remover.getUniqueCharacterStrings());
    }
}