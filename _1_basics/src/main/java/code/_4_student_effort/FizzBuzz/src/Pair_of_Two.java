public class Pair_of_Two {
    Pair_of_Two(){

    }

    public int pair(int[] given_pair){
        int count = 0;
        for(int i = 0; i < given_pair.length;i++){
            for(int j = i+1; j < given_pair.length; j++){
                if (given_pair[i]+given_pair[j] == 0){
                    System.out.println("Pereche: "+given_pair[i]+" si "+given_pair[j]);
                    count++;

                }

            }
        }
        System.out.println("Numarul de perechi = "+count);
        return count;

    }
}
