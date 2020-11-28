package code._4_student_effort;

import java.util.HashMap;
import java.util.Map;

public class MyFooBarQix {
    private Map<Integer, String> associatedWord = new HashMap<>();

    public MyFooBarQix() {
        associatedWord.put(3, "Foo");
        associatedWord.put(5, "Bar");
        associatedWord.put(7, "Qix");
    }

    private int reverse(int nr) {
        int reversed = 0;
        while (nr != 0) {
            reversed = reversed * 10 + nr % 10;
            nr /= 10;
        }
        return reversed;
    }

    public String compute(int nr) {
        StringBuilder word = new StringBuilder();
        for (Integer key : associatedWord.keySet())
            if (nr % key == 0)
                word.append(associatedWord.get(key));
        int reversedNr = reverse(nr);
        while (reversedNr != 0) {
            if (associatedWord.containsKey(reversedNr % 10))
                word.append(associatedWord.get(reversedNr % 10));
            reversedNr /= 10;
        }
        if (word.length() == 0)
            return String.valueOf(nr);
        return word.toString();
    }

    public String compute2(int nr) {
        boolean remainsNr = true;
        StringBuilder word = new StringBuilder();
        for (Integer key : associatedWord.keySet())
            if (nr % key == 0) {
                remainsNr = false;
                word.append(associatedWord.get(key));
            }
        int reversedNr = reverse(nr);
        while (reversedNr != 0) {
            if (associatedWord.containsKey(reversedNr % 10)) {
                word.append(associatedWord.get(reversedNr % 10));
            }
            else if (reversedNr % 10 == 0)
                word.append('*');
            reversedNr /= 10;
        }
        if (remainsNr) {
            word.delete(0, word.length());
            reversedNr = reverse(nr);
            while (reversedNr != 0) {
                if (reversedNr % 10 == 0)
                    word.append('*');
                else
                    word.append(reversedNr % 10);
                reversedNr /= 10;
            }
        }
        return word.toString();
    }
}
