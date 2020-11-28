package _4_student_effort;

public class Actor {
    private String name;
    private int age;
    Premiu[] premii;

    public Actor(String name, int age, Premiu[] premii){
        this.name = name;
        this.age = age;
        this.premii = premii;
    }
    public String getName(){
        return  name;
    }
    public int getAge(){
        return age;
    }
    public Premiu[] getPremii(){
        return premii;
    }

}
