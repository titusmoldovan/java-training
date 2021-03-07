package code._4_student_effort.Lambda;

import java.util.HashMap;
import java.util.Map;

public class ExFour {

    private Map<String,String> map = new HashMap<>();

    private StringBuilder sb = new StringBuilder();

    public ExFour() {
        populateMap();
        flatMap();
    }

    public void flatMap(){
        map.forEach((k,v)->{sb.append(k);sb.append(v);});
    }

    private void populateMap(){
        map.put("1","Football");
        map.put("2","Goal");
        map.put("3","Coach");
    }

    public String getSb() {
        return sb.toString();
    }
}
