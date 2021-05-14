/**
 * Oana Durcau - 14.05.2021
 * Given an array of integers, find the number of pairs from the array.
 * A pair is defined as any 2 numbers added result 0.
 * Anumber involved in a pair .nnot be part of another pair.
 */
package code._4_student_effort;

import java.util.ArrayList;

public class CodeChallenge3 {

    int pairof2(ArrayList <Integer> aray)
    {
        int numberOfPairs = 0;
        int isPartOfPair = 0;
        int size = aray.size();
        int[] index = new int[size];


        for(int i = 0; i < size - 1; i++) {
            isPartOfPair = 0;
            for (int j = i + 1; j < size; j++) {
                if (aray.get(i) + aray.get(j) == 0 && index[i] == 0 && index[j] == 0)
                {
                    numberOfPairs++;
                    index[i] = 1;
                    index[j] = 1;
                }
            }
        }
        return numberOfPairs;
    }
}
