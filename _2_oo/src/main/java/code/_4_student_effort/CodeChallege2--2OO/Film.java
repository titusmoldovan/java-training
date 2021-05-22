public class Film {
    int anAparitie;
    String nume;
    Actor[] actorii;

    Film(String nume, int anAparitie, Actor[] actorii) {
        this.nume = nume;
        this.anAparitie = anAparitie;
        this.actorii = actorii;
    }

    String getNume() {
        return nume;
    }

    int getAnAparitie() {
        return anAparitie;
    }

    Actor[] getActorii() {
        return actorii;
    }
}
