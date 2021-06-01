package code._4_student_effort._3_anagram;

import java.io.FileWriter;
import java.io.IOException;

public class Main {

    private static final String FILE_NAME = "output.txt";
    private static FileWriter myWriter;

    public static void main(String[] args) {
        String word = "listen";
        Integer[] frequency = new Integer[findLargestLetter(word) + 1];
        for (int i = 0; i < findLargestLetter(word) + 1; i++) {
            frequency[i] = 0;
        }
        for (int i = 0; i < word.length(); i++) {
            frequency[word.charAt(i)]++;
        }
        int j = 0;
        Integer[] non0poz = new Integer[word.length()];
        for (int i = 0; i < findLargestLetter(word) + 1; i++) {
            if (frequency[i] != 0) {
                non0poz[j++] = i;
            }
        }
        try {
            myWriter = new FileWriter(FILE_NAME);
        } catch (IOException e) {
            e.printStackTrace();
        }
        generateAnagrams(j, non0poz);
        try {
            myWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void swap(Integer[] input, int a, int b) {
        Integer tmp = input[a];
        input[a] = input[b];
        input[b] = tmp;
    }

    private static void writeArrayInFile(Integer[] input) {
        try {
            for (Integer integer : input) {
                myWriter.write((char) integer.intValue());
            }
            myWriter.write("\n");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public static void generateAnagrams(int n, Integer[] elements) {

        if (n == 1) {
            writeArrayInFile(elements);
        } else {
            for (int i = 0; i < n - 1; i++) {
                generateAnagrams(n - 1, elements);
                if (n % 2 == 0) {
                    swap(elements, i, n - 1);
                } else {
                    swap(elements, 0, n - 1);
                }
            }
            generateAnagrams(n - 1, elements);
        }
    }

    public static int findLargestLetter(String word) {
        int max = word.charAt(0);
        for (int i = 1; i < word.length(); i++) {
            if (word.charAt(i) > max) {
                max = word.charAt(i);
            }
        }
        return max;
    }
}
