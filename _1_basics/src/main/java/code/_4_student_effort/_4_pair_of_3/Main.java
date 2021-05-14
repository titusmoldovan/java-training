package code._4_student_effort._4_pair_of_3;

public class Main {

    public static void main(String[] args) {
        Integer[] array = new Integer[]{
                -1, -1, -1, 2
        };

        System.out.println(countPairs(array));
    }

    public static Integer countPairs(Integer[] numbers) {
        Integer pairs = 0;
        Integer[] indexesIncludedInPairs = new Integer[numbers.length];
        int nrOfIndexesIncludedInPairs = 0;
        for (int i = 0; i < numbers.length - 2; i++) {
            for (int j = i + 1; j < numbers.length - 1; j++) {
                for (int k = j + 1; k < numbers.length; k++) {
                    boolean indexesIncludedInOtherPairs = false;
                    for (int p = 0; p < nrOfIndexesIncludedInPairs; p++) {
                        if (indexesIncludedInPairs[p] == i || indexesIncludedInPairs[p] == j || indexesIncludedInPairs[p] == k) {
                            indexesIncludedInOtherPairs = true;
                            break;
                        }
                    }
                    if (!indexesIncludedInOtherPairs && (numbers[i] + numbers[j] + numbers[k] == 0)) {
                        indexesIncludedInPairs[nrOfIndexesIncludedInPairs++] = i;
                        indexesIncludedInPairs[nrOfIndexesIncludedInPairs++] = j;
                        indexesIncludedInPairs[nrOfIndexesIncludedInPairs++] = k;
                        pairs++;
                        //System.out.println(numbers[i] + " + " + numbers[j] + " + " + numbers[k] + " = " + sum);
                        break;
                    }
                }
            }
        }
        return pairs;
    }
}


