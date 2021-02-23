package code._4_student_effort;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MyLambda {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("ana", "are", "mere");
        //1
        StringBuilder str = new StringBuilder();
        words.forEach(w -> str.append(w.charAt(0)));
        System.out.println(str);
        //2
        List<String> evenLengthWords = words.stream()
                .filter(w -> w.length() % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(evenLengthWords);
        //3
        List<String> upperWords = words.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(upperWords);
        //4
        Map<String, String> stringMap = new HashMap<>();
        stringMap.put("ana", "ana");
        stringMap.put("are", "era");
        stringMap.put("mere", "erem");
        StringBuilder strMap = new StringBuilder();
        stringMap.forEach((key, val) -> strMap.append(key).append(val));
        System.out.println(strMap);
        //5
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        new Thread(() -> numbers.forEach(System.out::print)).start();
    }
}
