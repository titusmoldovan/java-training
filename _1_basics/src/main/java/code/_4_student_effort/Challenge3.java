package code._4_student_effort;

import java.util.ArrayList;

public class Challenge3 {
    public int pairOf2(ArrayList<Integer> arrayList ){
        int pairs = 0;
        int [] inPair = new int[arrayList.size()];
        for (int i = 0; i < arrayList.size() - 1 ; i++)
            for (int j = i+1 ; j <arrayList.size(); j++)
                if(arrayList.get(i) + arrayList.get(j) == 0 && inPair[j] == 0 && inPair[i] == 0)
                {
                    pairs++;
                    inPair[j] = 1;
                    inPair[i] = 1;
                }

        return pairs;
    }
}
