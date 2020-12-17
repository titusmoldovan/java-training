package code._4_student_effort.Challange2_pair;

public class Heels implements Shoe{
    private String color;
    private Integer size;

    public Heels(String color, Integer size)
    {
        this.color = color;
        this.size = size;
    }
    @Override
    public String getColor() {
        return color;
    }

    @Override
    public Integer getSize() {
        return size;
    }
}
