package code._4_student_effort._3_pair_of_2;

public class Main {

    public static void main(String[] args) {
        Integer[] array = new Integer[]{
                3, 2, -3, -2, 3, 0
        };

        System.out.println(makePairs(array));


    }

    public static Integer makePairs(Integer[] numbers) {
        Integer pairs = 0;
        Integer[] indexesIncludedInPairs = new Integer[numbers.length];
        int nrOfIndexesIncludedInPairs = 0;

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                boolean indexesIncludedInOtherPairs = false;
                for (int k = 0; k < nrOfIndexesIncludedInPairs; k++) {
                    if (indexesIncludedInPairs[k] == i || indexesIncludedInPairs[k] == j) {
                        indexesIncludedInOtherPairs = true;
                        break;
                    }
                }
                if (!indexesIncludedInOtherPairs && (numbers[i] + numbers[j] == 0)) {
                    indexesIncludedInPairs[nrOfIndexesIncludedInPairs++] = i;
                    indexesIncludedInPairs[nrOfIndexesIncludedInPairs++] = j;
                    pairs++;
                    break;
                }
            }
        }
        return pairs;
    }
}

