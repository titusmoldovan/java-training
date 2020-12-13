package code._4_student_effort.Challenge3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Anagram {
    public static String inputPath = "C:\\Users\\Acer\\IdeaProjects\\java_training_2\\_4_exceptions_io\\_test_files\\in\\small_list.txt";

    private static List<String> getListOfWords(String inputPath) {
        List<String> listOfWords = new ArrayList<>();
        try (Scanner input = new Scanner(new BufferedReader(new FileReader(inputPath)))) {
            input.nextLine();
            while (input.hasNext()) {
                listOfWords.add(input.next());
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return listOfWords;
    }

    private String swap(String word, int i, int j) {
        char temp;
        char[] lettersArray = word.toCharArray();
        temp = lettersArray[i];
        lettersArray[i] = lettersArray[j];
        lettersArray[j] = temp;
        return String.valueOf(lettersArray);
    }

    private void getAnagrams(String word, int firstLetter, int lastLetter) {
        if (firstLetter == lastLetter) {
            System.out.println(word);
        } else {
            for (int k = firstLetter; k <= lastLetter; k++) {
                word = swap(word, firstLetter, k);
                getAnagrams(word, firstLetter + 1, lastLetter);
                word = swap(word, firstLetter, k);
            }
        }
    }

    public static void main(String[] args) {

        String word = "listen";
        Anagram anagram1 = new Anagram();
        anagram1.getAnagrams(word, 0, word.length()-1);

        int listOfWordsSize = getListOfWords(inputPath).size();
        Anagram anagram2 = new Anagram();
        String randomWord = getListOfWords(inputPath).get(new Random().nextInt(listOfWordsSize));
        anagram2.getAnagrams(randomWord, 0, randomWord.length() - 1);
    }
}
