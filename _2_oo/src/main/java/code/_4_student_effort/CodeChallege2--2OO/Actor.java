import java.util.*;
public class Actor {
    String nume;
    int varsta;
    Premiu[] premii;

    Actor(String nume, int varsta, Premiu[] premii) {
        this.nume = nume;
        this.varsta = varsta;
        this.premii = premii;
    }

    String getNume() {
        return nume;
    }

    int getVarsta()
    {
        return  varsta;
    }

    Premiu[] getPremii()
    {
        return premii;
    }
}
