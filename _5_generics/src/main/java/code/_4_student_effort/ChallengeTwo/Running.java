package code._4_student_effort.ChallengeTwo;

public class Running implements Shoe {
    private String color;
    private int number;

    @Override
    public String getColor() {
        return this.color;
    }

    @Override
    public int getNumber() {
        return this.number;
    }

    public Running(String color, int number) {

        this.color = color;
        this.number = number;
    }
}
