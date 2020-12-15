package code._4_student_effort.occurrence;

import code._2_challenge._5_occurence.WordOccurrence;

import java.util.*;

public class Occurrence {
    private HashMap<String, Integer> countOccurrences(String text) {
        HashMap<String, Integer> occurrences = new HashMap<>();
        String[] words = text.split(" ");
        for (String word : words) {
            if (occurrences.containsKey(word))
                occurrences.replace(word, occurrences.get(word) + 1);
            else
                occurrences.put(word, 1);
        }
        return occurrences;
    }

    public Map<String, Integer> getTop10Occurrences(String text) {
        Map<String, Integer> occurrences = countOccurrences(text);
        ArrayList<Map.Entry<String, Integer>> listEntries = new ArrayList<>(occurrences.entrySet());
        listEntries.sort(new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> entry1, Map.Entry<String, Integer> entry2) {
                return entry2.getValue().compareTo(entry1.getValue());
            }
        });
        occurrences = new LinkedHashMap<>();
        for (int i = 0; i < 10; i++)
            occurrences.put(listEntries.get(i).getKey(), listEntries.get(i).getValue());
        return occurrences;
    }
}
