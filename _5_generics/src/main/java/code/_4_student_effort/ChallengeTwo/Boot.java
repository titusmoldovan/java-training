package code._4_student_effort.ChallengeTwo;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Boot boot = (Boot) o;
        return number == boot.number && Objects.equals(color, boot.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, number);
    }
}
