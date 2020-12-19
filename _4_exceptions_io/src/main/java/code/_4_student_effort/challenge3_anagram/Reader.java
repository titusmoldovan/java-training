package code._4_student_effort.challenge3_anagram;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Reader {

    private String filePath;

    public Reader(String filePath) {
        this.filePath = filePath;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public List<String> getAnagramsFromFile(String word) {
        List<String> anagrams = new ArrayList<>();
        char[] givenWord = word.toCharArray();
        Arrays.sort(givenWord);

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))) {
            String line = bufferedReader.readLine();

            while (line != null) {
                String[] arr = line.split(" ", 6);
                for (int i = 0; i < arr.length; i++) {
                    char[] singleWord = arr[i].toCharArray();
                    Arrays.sort(singleWord);
                    if (Arrays.equals(givenWord, singleWord)) {
                        anagrams.add(arr[i]);
                    }
                }
                line = bufferedReader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return anagrams;
    }
}
