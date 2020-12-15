package code._4_student_effort.ChallengeFive;

import java.util.*;
import java.util.stream.Collectors;

public class Occurrence {

    private static HashMap<String, Integer> occurrences;

    public Occurrence(HashMap occurrences) {
        this.occurrences = occurrences;
    }

    public void topXWords2(int top) {
        int count = 1;
        Map<String, Integer> sorted =
                occurrences.entrySet().stream()
                        .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                        .limit(top).
                        collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
        for (Map.Entry<String, Integer> entry : sorted.entrySet()) {
            System.out.println(count + ": " + entry.getKey() + "->" + entry.getValue());
            count++;
        }
    }

    public void topXWords(int top) {
        //sort occurences by value
        Map<String, Integer> sortedWords = sortMapByValue(occurrences);
        int count = 0;
        for (Map.Entry<String, Integer> entry : sortedWords.entrySet()) {
            count++;
            System.out.println(count + ": " + entry.getKey() + "->" + entry.getValue());
            if (count >= top) {
                break;
            }
        }
    }

    private static TreeMap<String, Integer> sortMapByValue(Map<String, Integer> map) {
        Comparator<String> comparator = new ValueComparator(map);
        TreeMap<String, Integer> result = new TreeMap<>(comparator);
        result.putAll(map);
        return result;
    }
}
