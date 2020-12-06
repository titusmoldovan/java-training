package code._4_student_effort.Challange1;

public class ArrayCustomIterator {
    private int[] vec;
    private int position;
    public ArrayCustomIterator(int[] vec){
        this.vec = vec;
        position = 0;
    }

    public boolean hasNext() {
        if (position < vec.length)
            return true;
        else
            return false;
    }

    public int next()
    {
        return vec[position++];
    }
}
