package code._4_student_effort;

//Iterator pattern

class ArrayCustomIterator {
    private int[] array;

    public ArrayCustomIterator(int[] array) {
        this.array = array;
    }

    public boolean hasNext() {
        for (int arrayElement : array) {
            System.out.println(arrayElement + " ");
        }
        return false;
    }

    public int next() {
        for (int i = 0; i < array.length; i++) {
            return array[i + 1];
        }
        return 0;
    }
}

public class Challenge_1 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3};
        ArrayCustomIterator it = new ArrayCustomIterator(arr);
        while (it.hasNext()) {
            System.out.println(it.next());

        }
    }
}
