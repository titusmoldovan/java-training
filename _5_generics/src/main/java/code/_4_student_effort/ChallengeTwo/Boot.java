package code._4_student_effort.ChallengeTwo;

public class Boot implements Shoe {
    private String color;
    private int number;

    public Boot(String color, int number) {
        this.color = color;
        this.number = number;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public int getNumber() {
        return number;
    }
}
