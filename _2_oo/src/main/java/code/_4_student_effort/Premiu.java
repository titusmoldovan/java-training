package code._4_student_effort;

public class Premiu {
    private String name;
    private int year;

    Premiu(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public String getName() {
        return name;
    }
}
