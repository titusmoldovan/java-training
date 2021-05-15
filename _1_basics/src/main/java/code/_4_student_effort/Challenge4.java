package code._4_student_effort;

import java.util.ArrayList;

public class Challenge4 {
    public int pairOf3(ArrayList<Integer> arrayList){
        int pairs = 0;
        int [] inPair = new int[arrayList.size()];
        for (int i = 0; i < arrayList.size() - 2 ; i++)
            for (int j = i+1 ; j <arrayList.size() - 1; j++)
                for (int k = j + 1; k < arrayList.size(); k++)
                    if(arrayList.get(i) + arrayList.get(j) + arrayList.get(k) == 0 && inPair[j] == 0 && inPair[i] == 0 && inPair[k] == 0)
                    {
                        pairs++;
                        inPair[j] = 1;
                        inPair[i] = 1;
                        inPair[k] = 1;
                    }
        return pairs;
    }
}
