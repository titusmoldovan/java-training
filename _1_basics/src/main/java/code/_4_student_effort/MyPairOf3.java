package code._4_student_effort;

public class MyPairOf3 {
    private boolean isInArray(int nr, Integer[] array, int length) {
        for (int i = 0; i < length; i++)
            if (array[i] == nr)
                return true;
        return false;
    }

    public int countPairs(Integer[] array) {
        Integer[] usedPositions = new Integer[array.length];
        int lengthUsedPositions = 0;
        int nrPairs = 0;
        for (int i = 0; i < array.length - 2; i++)
            for (int j = i + 1; j < array.length - 1; j++)
                for (int k = j + 1; k < array.length; k++)
                    if (array[i] + array[j] + array[k] == 0 && !isInArray(i, usedPositions, lengthUsedPositions) && !isInArray(j, usedPositions, lengthUsedPositions) && !isInArray(k, usedPositions, lengthUsedPositions)) {
                        nrPairs++;
                        usedPositions[lengthUsedPositions++] = i;
                        usedPositions[lengthUsedPositions++] = j;
                        usedPositions[lengthUsedPositions++] = k;
                    }
        return nrPairs;
    }
}
