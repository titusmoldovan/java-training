package code._4_student_effort.generic_binary_search;

public class Main {
    public static void main(String[] args) {
        Integer[] arr1 = new Integer[]{1, 2, 3, 4};
        Integer[] arr2 = new Integer[]{4, 3, 2, 1};
        Integer[] arr3 = new Integer[]{4, 2, 3, 1};
        BinarySearch<Integer> binarySearch1 = new BinarySearch<>(arr1);
        BinarySearch<Integer> binarySearch2 = new BinarySearch<>(arr2);
        BinarySearch<Integer> binarySearch3 = new BinarySearch<>(arr3);

        try {
            System.out.println(binarySearch1.search(3));
            System.out.println(binarySearch1.search(5));
            System.out.println(binarySearch2.search(3));
            System.out.println(binarySearch2.search(5));
            System.out.println(binarySearch3.search(1));

        } catch (ArrayNotSortedException e) {
            System.out.println(e.getMessage());
        }
    }
}
