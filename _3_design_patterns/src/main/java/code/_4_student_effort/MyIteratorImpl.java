package code._4_student_effort;

import javax.lang.model.element.Element;
import java.util.ArrayList;
import java.util.List;

public class MyIteratorImpl implements MyIterator {
    private int[] arr;
    private int currentIndex;

    public MyIteratorImpl(int arr[]) {
        this.arr = arr;
        this.currentIndex = 0;
    }

    public boolean hasNext() {
        return this.currentIndex < this.arr.length;
    }

    public int next() {
        return this.arr[this.currentIndex++];
    }
}
