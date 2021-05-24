package code._4_student_effort._2_movie_database.model;

import java.util.List;

public class Actor {

    private String name;
    private Integer age;
    private List<Prize> prizes;

    public Actor(String name, Integer age, List<Prize> prizes) {
        this.name = name;
        this.age = age;
        this.prizes = prizes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public List<Prize> getPrizes() {
        return prizes;
    }

    public void setPrizes(List<Prize> prizes) {
        this.prizes = prizes;
    }

    @Override
    public String toString() {
        return "Actor{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", prizes=" + prizes +
                '}';
    }
}
