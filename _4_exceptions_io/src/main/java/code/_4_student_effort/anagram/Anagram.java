package code._4_student_effort.anagram;

public class Anagram {
    private final StringBuilder anagrams = new StringBuilder();

    private void findPermutations(String givenWord, String permutation) {
        if (givenWord.length() == 0)
            anagrams.append(permutation).append(" ");
        for (int i = 0; i < givenWord.length(); i++) {
            char character = givenWord.charAt(i);
            findPermutations(givenWord.substring(0, i) + givenWord.substring(i+1), permutation + character);
        }
    }

    public String getAnagramsOfWord(String word) {
        anagrams.setLength(0);
        findPermutations(word, "");
        return this.anagrams.toString();
    }

    public String getAnagramsOfTextWords(String text) {
        StringBuilder anagramsOfAllWords = new StringBuilder();
        for (String word: text.split(" ")){
            anagrams.setLength(0);
            findPermutations(word, "");
            anagramsOfAllWords.append(anagrams).append('\n');
        }
        return anagramsOfAllWords.toString();
    }
}
