package code._4_student_effort.movie;


public class Prize {
    private String name;
    private int year;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Prize(String n, int y) {
        name = n;
        year = y;
    }
}
