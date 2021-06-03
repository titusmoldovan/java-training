package code._4_student_effort._5_occurence;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;

public class Main {

    private static final String FILE_NAME = "_4_exceptions_io\\_test_files\\in\\a.txt";

    public static void main(String[] args) throws FileNotFoundException {
        List<String> words = readWords();
        List<WordOccurrence> uniqueWords = countAppearances(words);
        uniqueWords.sort(new Sorter().reversed());
        uniqueWords.forEach(System.out::println);
    }

    private static List<String> readWords() throws FileNotFoundException {
        List<String> words = new ArrayList<>();
        try (Scanner s = new Scanner(new BufferedReader(new FileReader(FILE_NAME)))) {
            s.useLocale(Locale.US);
            while (s.hasNext()) {
                words.add(s.next());
            }
        }
        return words;
    }

    private static List<WordOccurrence> countAppearances(List<String> words) {
        List<WordOccurrence> uniqueWords = new ArrayList<>();
        for (String word : words) {
            Optional<WordOccurrence> wordOccurrence = existsInUniqueList(uniqueWords, word);
            if (!wordOccurrence.equals(Optional.empty())) {
                wordOccurrence.get().increaseOccurrence();
            } else {
                uniqueWords.add(new WordOccurrence(word));
            }
        }
        return uniqueWords;
    }

    private static Optional<WordOccurrence> existsInUniqueList(List<WordOccurrence> uniqueWords, String word) {
        return uniqueWords.stream()
                .filter(wordOccurrence -> wordOccurrence.getWord().equals(word))
                .findAny();
    }
}
