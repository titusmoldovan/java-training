package code._4_student_effort.challenge2_strategy;

public class MergeSort implements SortingStrategy {

    public static void merge(Integer[] result, Integer[] a, Integer[] b) {
        int i, j, k;

        i = j = k = 0;

        while (i < a.length || j < b.length) {
            if (i < a.length && j < b.length) {  // Both array have elements
                if (a[i] < b[j])
                    result[k++] = a[i++];
                else
                    result[k++] = b[j++];
            } else if (i == a.length)
                result[k++] = b[j++];     // a is empty
            else if (j == b.length)
                result[k++] = a[i++];     // b is empty
        }
    }

    public void sort(Integer[] a) {
        Integer[] left, right;

        if (a.length == 1) {
            return;
        }

        int middle = a.length / 2;

        left = new Integer[middle];

        for (int i = 0; i < middle; i++)
            left[i] = a[i];

        right = new Integer[a.length - middle];

        for (int i = 0; i < a.length - middle; i++)
            right[i] = a[i + middle];

        sort(left);
        sort(right);

        merge(a, left, right);
    }

}
