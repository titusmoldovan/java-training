package code._4_student_effort;

import java.util.ArrayList;

public class Film {
    private int anAparitie;
    private String name;
    private ArrayList<Actor> actors;

    Film(int anAparitie, String name, ArrayList<Actor> actors) {
        this.anAparitie = anAparitie;
        this.name = name;
        if (actors == null) {
            this.actors = new ArrayList<>();
        } else {
            this.actors = actors;
        }
    }

    public  void addActors(Actor actor) {
        this.actors.add(actor);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setActors(ArrayList<Actor> actors) {
        this.actors = actors;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Actor> getActors() {
        return actors;
    }

    public int getAnAparitie() {
        return anAparitie;
    }
}
