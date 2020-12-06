package code._4_student_effort.Iterator;

class ArrayCustomIterator{
    final private int[] arr;
    private int position;

    public ArrayCustomIterator(int[] arr) {
        this.arr = arr;
        this.position = 0;
    }

    public boolean hasNext(){
        return this.position < this.arr.length;
    }

    public int next(){
        return this.arr[this.position++];
    }
}

public class Iterator {
    public static void main(String[] args) {

        int[] arr = new int[]{1,2,3};
        ArrayCustomIterator it = new ArrayCustomIterator(arr);
        while (it.hasNext()){
            System.out.println(it.next());
        }

    }
}
