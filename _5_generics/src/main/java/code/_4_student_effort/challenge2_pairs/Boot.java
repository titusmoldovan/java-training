package code._4_student_effort.challenge2_pairs;

public class Boot implements Shoe {

    private String color;
    private double size;

    public Boot(String color, double size) {
        this.color = color;
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }
}
