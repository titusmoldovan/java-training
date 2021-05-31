package code._4_student_effort._1_iterator;

import java.util.ArrayList;
import java.util.List;

public class Repository implements Container {

    private static final List<Integer> integers = new ArrayList<>();

    @Override
    public Iterator getIterator() {
        return new ArrayCustomIterator();
    }

    private static class ArrayCustomIterator implements Iterator {

        int index;

        @Override
        public boolean hasNext() {
            return index <= integers.size() - 1;
        }

        @Override
        public Object next() {
            if (this.hasNext()) {
                return integers.get(index++);
            }
            return null;
        }
    }

    public List<Integer> getIntegers() {
        return integers;
    }
}
