package code._4_student_effort._5_occurence;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    private static final String FILE_NAME = "_4_exceptions_io\\_test_files\\in\\a.txt";

    public static void main(String[] args) throws FileNotFoundException {
        List<String> words = readWords();
        List<WordOccurrence> uniqueWords = countAppearances(words);

        sortWordAppearances(uniqueWords);
        displayFirst10(uniqueWords);
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
            WordOccurrence wordOccurrence = existsInUniqueList(uniqueWords, word);
            if (wordOccurrence != null) {
                wordOccurrence.increaseOccurrence();
            } else {
                uniqueWords.add(new WordOccurrence(word));
            }
        }
        return uniqueWords;
    }

    private static WordOccurrence existsInUniqueList(List<WordOccurrence> uniqueWords, String word) {
        for (WordOccurrence wordOccurrence : uniqueWords) {
            if (wordOccurrence.getWord().equals(word)) {
                return wordOccurrence;
            }
        }
        return null;
    }

    private static void sortWordAppearances(List<WordOccurrence> uniqueWords) {
        uniqueWords.sort((o1, o2) -> o2.getOccurrence().compareTo(o1.getOccurrence()));
    }

    private static void displayFirst10(List<WordOccurrence> uniqueWords) {
        for (int i = 0; i < 10; i++) {
            System.out.println(uniqueWords.get(i).getOccurrence() + " - " + uniqueWords.get(i).getWord());
        }
    }
}
