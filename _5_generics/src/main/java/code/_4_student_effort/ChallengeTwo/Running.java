package code._4_student_effort.ChallengeTwo;

public class Running implements Shoe, Comparable<Shoe> {
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

    @Override
    public String toString() {
        return "Running{" +
                "color='" + color + '\'' +
                ", number=" + number +
                '}';
    }

    @Override
    public int compareTo(Shoe o) {
        if (o.getNumber() > this.number) {
            return -1;
        } else if (o.getNumber() < this.number) {
            return 1;
        } else {
            return 0;
        }
    }
}
