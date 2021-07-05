public class Studio {
    String nume;
    Film[] filme;

    Studio(String nume, Film[] filme) {
        this.nume = nume;
        this.filme = filme;
    }

    String getNume() {
        return nume;
    }

    Film[] getFilme() {
        return filme;
    }
}
