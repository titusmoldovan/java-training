package code._4_student_effort.ChallengeTwo;

public class Boot implements Shoe, Comparable<Boot> {
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

    @Override
    public String toString() {
        return "Boot{" +
                "color='" + color + '\'' +
                ", number=" + number +
                '}';
    }

    @Override
    public int compareTo(Boot o) {
        if (o.getNumber() > this.number) {
            return -1;
        } else if (o.getNumber() < this.number) {
            return 1;
        } else {
            return 0;
        }
    }
}
