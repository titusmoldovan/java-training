package code._4_student_effort.Challange2_pair;

public class ShoePair <S extends Shoe> {
    private S first;
    private S second;
    public ShoePair(S first, S second)
    {
        this.first = first;
        this.second = second;
        match();
    }
    public Object getFirst()
    {
        return first;
    }
    public Object getSecond()
    {
        return second;
    }
    void match()
    {
        if(first.getSize() != second.getSize())
            throw new SizeDoesntMatchException("Wrong Size");
        if(first.getColor() != second.getColor())
            throw new ColorDoesntMatchException("Wrong Color");
    }
}
