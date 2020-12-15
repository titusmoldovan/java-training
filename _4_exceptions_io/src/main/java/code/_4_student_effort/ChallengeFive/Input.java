package code._4_student_effort.ChallengeFive;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;

public class Input {

    private String inputPath;
    private static HashMap<String, Integer> occurrences = new HashMap<>();
    private static Scanner scanner;

    public Input(String inputPath) throws FileNotFoundException {
        this.inputPath = inputPath;
        getWords();
    }

    public HashMap<String, Integer> getOccurrences() {
        return occurrences;
    }

    private void getWords() throws FileNotFoundException {
        List<String> items = new ArrayList<>(Arrays.asList(",", ".", "'", "!", "?"));
        while (getScanner().hasNext()) {
            String st = getScanner().next();
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
        if (getScanner() != null) {
            getScanner().close();
        }
    }

    public Scanner getScanner() throws FileNotFoundException {
        if (scanner == null) {
            synchronized (Scanner.class) {
                if (scanner == null) {
                    scanner = new Scanner(new BufferedReader(new FileReader(inputPath)));
                }
            }
        }
        return scanner;
    }
}
