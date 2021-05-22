package code._4_student_effort;

import java.util.ArrayList;

public class Studio {
    private String name;
    private ArrayList<Film> films;

    Studio(String name, ArrayList<Film> films) {
        this.name = name;
        if (films == null) {
            this.films = new ArrayList<>();
        } else {
            this.films = films;
        }
    }

    public void addFilm(Film film) {
        this.films.add(film);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Film> getFilms() {
        return films;
    }
}
