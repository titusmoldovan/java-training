package code._4_student_effort.ChallengeFive;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class Occurrence {

    private static final String INPUT_PATH = "_4_exceptions_io/_test_files/in/message.txt";
    private static final Map<String, Integer> occurrences = new HashMap<>();
    static List<String> words = new ArrayList<>();

    static {
        getWords();
    }

    public static void main(String[] args) {
        //topXWords(5);
        topXWords2(5);
    }

    private static void topXWords2(int top) {
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

    private static void topXWords(int top) {
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


    private static void getWords() {
        List<String> items = new ArrayList<>(Arrays.asList(",", ".", "'", "!", "?"));
        try (Scanner scanner = new Scanner(new BufferedReader(new FileReader(INPUT_PATH)))) {
            while (scanner.hasNext()) {
                String st = scanner.next();
                for (String item : items) {
                    if (st.contains(item)) {
                        st = st.replace(item, "");
                    }
                }
                if (occurrences.containsKey(st)) {
                    occurrences.put(st, occurrences.get(st) + 1);
                } else {
                    occurrences.put(st, 1);
                }
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
