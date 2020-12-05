package code._4_student_effort.ChallengeTwo;

public class MergeSort implements SortingStrategy {
    @Override
    public void sort(Integer[] list) {
        int length = list.length;
        if (length < 2) {
            return;
        }
        int mid = length / 2;
        Integer[] leftArr = new Integer[mid];
        Integer[] rightArr = new Integer[length - mid];

        for (int i = 0; i < mid; i++) {
            leftArr[i] = list[i];
        }

        for (int i = mid; i < length; i++) {
            rightArr[i - mid] = list[i];
        }
        sort(leftArr);
        sort(rightArr);

        merge(list, leftArr, rightArr, mid, length - mid);

    }

    private void merge(Integer[] list, Integer[] leftArr, Integer[] rightArr, int left, int right) {

        int i = 0, j = 0, k = 0;

        while (i < left && j < right) {
            if (leftArr[i] <= rightArr[j]) {
                list[k++] = leftArr[i++];
            } else {
                list[k++] = rightArr[j++];
            }
        }
        while (i < left) {
            list[k++] = leftArr[i++];
        }
        while (j < right) {

            list[k++] = rightArr[j++];
        }

    }
}
