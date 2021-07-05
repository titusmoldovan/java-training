import java.lang.reflect.Array;
import java.util.ArrayList;

public class Pair_of_Three {
    Pair_of_Three(){

    }

    public int pair(int[] givenPair){
        int count = 0;
        ArrayList<Integer> indexPairTaken = new ArrayList<>();

        int n = givenPair.length;
        for (int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                for(int k = 0; k < n; k++){
                    if((givenPair[i]+givenPair[j]+givenPair[k] == 0) && !indexPairTaken.contains(i) &&
                            !indexPairTaken.contains(j) && !indexPairTaken.contains(k)){
                        System.out.println("Pereche: "+givenPair[i]+", "+givenPair[j]+" si " + givenPair[k]);
                        count++;
                        indexPairTaken.add(i);
                        indexPairTaken.add(j);
                        indexPairTaken.add(k);
                    }
                }
            }
        }
        System.out.println("Numarul de perechi = "+count);
    return count;
    }
}
