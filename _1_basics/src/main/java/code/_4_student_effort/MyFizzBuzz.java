package code._4_student_effort;

import java.util.HashMap;
import java.util.Map;

public class MyFizzBuzz {
    private Map<Integer, String> associatedWord = new HashMap<>();

    public String fizzBuzz(int nr) {
        associatedWord.put(3, "Fizz");
        associatedWord.put(5, "Buzz");
        StringBuilder word = new StringBuilder();
        for (Integer key : associatedWord.keySet())
            if (nr % key == 0)
                word.append(associatedWord.get(key));
        if (word.length() == 0)
            return String.valueOf(nr);
        return word.toString();
    }

    public String fizzBuzz2(int nr) {
        associatedWord.put(7, "Rizz");
        associatedWord.put(11, "Jazz");
        return fizzBuzz(nr);
    }
}
