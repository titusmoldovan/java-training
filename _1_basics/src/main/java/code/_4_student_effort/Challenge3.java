package code._4_student_effort;

import java.util.Arrays;

public class Challenge3 {
    public int pairOf2SumZero( int[] array ) {
        int low = 0, high = array.length - 1;
        int pairs = 0;
        Arrays.sort(array);
        while ( low < high ) {
            if( array[low] + array[high] == 0 )
                pairs++;

            if (array[low] + array[high] < 0) {
                low++;
            } else {
                high--;
            }
        }
        return pairs;
    }
}
