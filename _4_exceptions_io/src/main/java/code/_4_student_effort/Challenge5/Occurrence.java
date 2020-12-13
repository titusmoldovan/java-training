package code._4_student_effort.Challenge5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Occurrence {
    public static String inputPath = "C:\\Users\\Acer\\IdeaProjects\\java_training_2\\_4_exceptions_io\\_test_files\\in\\a.txt";
    private static final HashMap<String, Integer> listOfWords = new HashMap<>();

    private static void getListOfWords(String inputPath) {
        List<String> signs = new ArrayList<>(Arrays.asList(".", ",", "'", "!", "?"));
        try (Scanner input = new Scanner(new BufferedReader(new FileReader(inputPath)))) {
            while (input.hasNext()) {
                String word = input.next();
                for (String sign : signs) {
                    if (word.contains(sign)) {
                        word = word.replace(sign, "");
                    }
                }
                if (listOfWords.containsKey(word)) {
                    listOfWords.put(word, listOfWords.get(word) + 1);
                } else listOfWords.put(word, 1);
            }

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    private static HashMap<String, Integer> sortWords() {
        getListOfWords(inputPath);
        List<Map.Entry<String, Integer>> list = new LinkedList<>(listOfWords.entrySet());
        list.sort(Map.Entry.comparingByValue());
        HashMap<String, Integer> temp = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> entry : list) {
            temp.put(entry.getKey(), entry.getValue());
        }
        return temp;
    }

    private static void displayTop10() {
        HashMap<String, Integer> temp = sortWords();
        int place = 0;
        for (Map.Entry<String, Integer> entry : temp.entrySet()) {
            place++;
            if (place > temp.size() - 10) {
                System.out.println(entry.getKey() + " - " + entry.getValue());
            }
        }
    }

    public static void main(String[] args) {
        displayTop10();
    }
}

