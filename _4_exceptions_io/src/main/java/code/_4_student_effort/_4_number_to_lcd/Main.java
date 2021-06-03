package code._4_student_effort._4_number_to_lcd;

import java.io.*;
import java.util.*;

public class Main {
    private static final String INPUT_FILE = "_4_exceptions_io\\_test_files\\in\\input_number.txt";
    private static final String OUTPUT_FILE = "_4_exceptions_io\\_test_files\\out\\output_number.txt";

    public static void main(String[] args) {
        String[] numbersFromFile = new String[0];
        try {
            numbersFromFile = readListOfWords();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        for (String number : numbersFromFile) {
            int numberOfChars = number.length();
            writeInFile(getNumberRepresentation(number), numberOfChars);
            System.out.println(1);
        }
    }

    private static List<String> getNumberRepresentation(String number) {

        List<String> chars = new ArrayList<>();
        for (Character character : number.toCharArray()) {
            chars.add(TypeMapper.compute(character - '0'));
        }

        return chars;
    }

    private static String[] readListOfWords() throws FileNotFoundException {
        String[] words = new String[0];
        Scanner s = null;
        int wordCount = 0;
        try {
            s = new Scanner(new BufferedReader(new FileReader(Main.INPUT_FILE)));
            s.useLocale(Locale.US);
            while (s.hasNext()) {
                words = Arrays.copyOf(words, words.length + 1);
                words[wordCount++] = s.next();
            }
        } finally {
            if (s != null) s.close();
        }

        String[] appropriateLengthWordsArray = new String[wordCount];
        System.arraycopy(words, 0, appropriateLengthWordsArray, 0, wordCount);
        return appropriateLengthWordsArray;
    }

    private static void writeInFile(List<String> chars, int numberOfChars) {
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(Main.OUTPUT_FILE));
            copy(chars, numberOfChars, bufferedWriter);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void copy(List<String> chars, int numberOfChars, BufferedWriter writer) throws IOException {
        try {
            int i, j, k;
            for (j = 0; j < 3; j++) {
                for (i = 0; i < numberOfChars; i++) {
                    for (k = 0; k < 3; k++) {
                        String certain = chars.get(i);
                        if (certain.charAt(j) == '1') {
                            if (k == 1) writer.write("_");
                            else writer.write("|");
                        } else {
                            writer.write(" ");
                        }
                    }
                    writer.write(" ");
                }
                writer.write("\n");
            }
        } finally {
            if (writer != null) writer.close();
        }
    }
}
