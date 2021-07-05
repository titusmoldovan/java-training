package code._4_student_effort;

public class PairOf3 {
    public static int nrOfPairs(int[] array){
        int counter = 0;
        for(int i=0;i<array.length-2;i++) {
            for (int j = i + 1; j < array.length-1; j++) {
                for (int k = j + 1; k < array.length; k++) {
                    if ((array[i] + array[j] + array[k]) == 0 && array[i] != Integer.MAX_VALUE && array[j] != Integer.MAX_VALUE && array[k] != Integer.MAX_VALUE) {
                        counter++;
                        array[i] = Integer.MAX_VALUE;
                        array[j] = Integer.MAX_VALUE;
                        array[k] = Integer.MAX_VALUE;
                    }
                }
            }
        }
        return counter;
    }
}
