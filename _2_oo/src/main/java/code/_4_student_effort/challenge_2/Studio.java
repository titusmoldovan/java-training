package code._4_student_effort.challenge_2;

public class Studio {

    private String nume;
    private Film[] filme;

    public Studio(String nume, Film[] filme) {
        this.nume = nume;
        this.filme = filme;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public Film[] getFilme() {
        return filme;
    }

    public void setFilme(Film[] filme) {
        this.filme = filme;
    }

    public boolean hasPublishedMoreThanTwoMovies() {
        if (filme.length > 2)
            return true;
        return false;
    }

    public boolean isActorPlaying(String actorName) {
        for (Film film : filme) {
            for (Actor actor : film.getActori())
                if (actor.getNume().equals(actorName))
                    return true;
        }

        return false;
    }

}
