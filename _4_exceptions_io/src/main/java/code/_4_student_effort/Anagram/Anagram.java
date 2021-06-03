package code._4_student_effort.Anagram;

public class Anagram {
    public static void main(String[] args) {
        String anagram = "listen";
        int n = anagram.length();
        generateAnagram(anagram, 0, n-1);
    }

    static void generateAnagram( String str, int start, int end ) {
        if( start == end )
            System.out.println(str);
        else {
            for (int i = start; i <= end ; i++) {
                str = swap( str, end, i );
                generateAnagram(str, start + 1, end);
                str = swap(str, start, i);
            }
        }
    }

    static String swap( String str, int i, int j ) {
        char temp;
        char[] charArray = str.toCharArray();
        temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }
}
