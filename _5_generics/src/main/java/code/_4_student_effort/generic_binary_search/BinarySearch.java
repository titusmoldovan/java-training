package code._4_student_effort.generic_binary_search;

public class BinarySearch<T extends Comparable<T>> {
    private final T[] arr;
    private int order; //-1:ascending, 1:descending

    public BinarySearch(T[] arr) {
        this.arr = arr;
    }

    private void isSorted() throws ArrayNotSortedException {
        if (arr.length > 1) {
            this.order = arr[0].compareTo(arr[1]);
            for (int i = 1; i < arr.length - 1; i++)
                if (arr[i].compareTo(arr[i + 1]) != this.order)
                    throw new ArrayNotSortedException("The array is not sorted");
        }
    }

    private boolean executeBinarySearch(T element, int start, int end) {
        if (start == end)
            return false;
        int middle = (start + end) / 2;
        if (element.equals(arr[middle]))
            return true;
        if (arr[middle].compareTo(element) < 0)
            if (this.order == -1)
                return executeBinarySearch(element, middle + 1, end);
            else
                return executeBinarySearch(element, start, middle);
        else {
            if (this.order == -1)
                return executeBinarySearch(element, start, middle);
            else
                return executeBinarySearch(element, middle + 1, end);
        }
    }

    public boolean search(T element) throws ArrayNotSortedException {
        this.isSorted();
        return this.executeBinarySearch(element, 0, arr.length);
    }
}
