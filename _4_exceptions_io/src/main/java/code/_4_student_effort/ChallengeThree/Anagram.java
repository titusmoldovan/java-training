package code._4_student_effort.ChallengeThree;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Anagram {

    private static final String inputPath = "_4_exceptions_io/_test_files/in/small_list.txt";

    public static void main(String[] args) {
        int wordsListSize = getWordsFromFile(inputPath).size();
        getAnagrams(getWordsFromFile(inputPath).get(new Random().nextInt(wordsListSize)));
    }

    private static void getAnagrams(String word) {
        System.out.println("Word to permute: "+word);
        permute(word, 0, word.length() - 1);
    }

    private static void permute(String str, int l, int r) {
        if (l == r) {
            System.out.println(str);
        } else {
            for (int i = 1; i <= r; i++) {
                str = swap(str, l, i);
                permute(str, l + 1, r);
                str = swap(str, l, i);
            }
        }
    }

    private static String swap(String a, int i, int j) {
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }

    private static List<String> getWordsFromFile(String path) {
        List<String> words = new ArrayList<>();
        try (Scanner input = new Scanner(new BufferedReader(new FileReader(path)))) {
            input.nextLine();
            while (input.hasNext()) {
                String word = input.next();
                words.add(word);
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return words;
    }
}
