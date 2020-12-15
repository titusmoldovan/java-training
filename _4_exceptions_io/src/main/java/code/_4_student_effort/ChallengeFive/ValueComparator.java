package code._4_student_effort.ChallengeFive;


import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class ValueComparator implements Comparator<String> {

    private HashMap<String, Integer> map = new HashMap<>();

    public ValueComparator(Map<String, Integer> map) {
        this.map.putAll(map);
    }

    @Override
    public int compare(String o1, String o2) {
        if (map.get(o1) >= map.get(o2)) {
            return -1;
        } else {
            return 1;
        }
    }
}
