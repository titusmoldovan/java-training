package code._4_student_effort.challenge_2;

public class Film {

    private String nume;
    private Integer anAparitie;
    private Actor[] actori;

    public Film(String nume, Integer anAparitie, Actor[] actori) {
        this.nume = nume;
        this.anAparitie = anAparitie;
        this.actori = actori;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public Integer getAnAparitie() {
        return anAparitie;
    }

    public void setAnAparitie(Integer anAparitie) {
        this.anAparitie = anAparitie;
    }

    public Actor[] getActori() {
        return actori;
    }

    public void setActori(Actor[] actori) {
        this.actori = actori;
    }

    public boolean isPlayingAtLeastAnActorWithAgeAboveGivenNumber(Integer age) {

        for (Actor actor : actori) {
            if (actor.getVarsta() > age) {
                return true;
            }
        }
        return false;
    }
}
