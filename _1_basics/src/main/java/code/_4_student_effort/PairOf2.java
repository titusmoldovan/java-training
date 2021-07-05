package code._4_student_effort;
public class PairOf2 {
    public static int nrOfPairs(int[] array){
        int counter = 0;
        for(int i=0;i<array.length-1;i++){
            for(int j=i+1;j<array.length;j++){
                if((array[i]+array[j])==0 && array[i]!=Integer.MAX_VALUE && array[j]!=Integer.MAX_VALUE){
                    counter++;
                    array[i] = Integer.MAX_VALUE;
                    array[j] = Integer.MAX_VALUE;
                }
            }
        }
        return counter;
    }
}
