import java.util.ArrayList;

public class Persoana implements Observer {
    String nume;
    String adresa;

    public Persoana(String nume, String adresa) {
        this.nume = nume;
        this.adresa = adresa;
    }

    public void verificaScrisori(ArrayList<Scrisoare> s) {
        for (int i = 0; i < s.size(); i++) {
            if (nume.compareTo(s.get(i).destinatar) == 0 && adresa.compareTo(s.get(i).adresa) == 0)
                System.out.println(nume+"(" +adresa+ ") a primit o scrisoare cu urmatorul continut: " + s.get(i).continut);

        }
    }

    public void update(Object o) {
        if (o instanceof Posta) {
            Posta posta = (Posta) o;
            verificaScrisori(((Posta) o).getScrisori());
        }
    }
}
