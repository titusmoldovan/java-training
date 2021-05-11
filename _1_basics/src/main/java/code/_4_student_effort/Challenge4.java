package code._4_student_effort;

import java.util.Arrays;

public class Challenge4 {
    public int pairOf3SumZero( int[] array ) {
        int pairs = 0;
        Arrays.sort(array);
        for( int i = 0; i < array.length - 2; i++ ) {
            if( i > 0 && array[i] == array[i-1] )
                continue;
            int j = i+1;
            int k = array.length - 1;
            while ( j < k ) {
                int sum = array[i] + array[j] + array[k];
                if( sum == 0 ) {
                    pairs++;
                    j++;
                    k--;
                    while ( j < k && array[j] == array[j-1] )
                        j++;
                    while ( j < k && array[k] == array[k+1] )
                        k--;
                } else {
                    if (sum > 0)
                        k--;
                    else j++;
                }
            }
        }
        return  pairs;
    }
}
