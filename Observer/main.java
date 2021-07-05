public class main {

    public static void main(String args[]) {
        System.out.println("Acest program notifica cand se primeste o scrisoare.");

        Posta postaRomana = new Posta();

        Persoana alexandruAlexandru = new Persoana("Alexandru Alexandru", "Str. Cenusii, Prejmer");
        Persoana paulPaul = new Persoana("Paul Paul", "Str. Prunului, Brasov");
        Persoana paulPaul2 = new Persoana("Paul Paul", "Str. Lacramioarei, Brasov");
        Persoana bogdanBogdan = new Persoana("Bogdan Bogdan", "Aleea Minerva, Brasov");

        postaRomana.ataseaza(alexandruAlexandru);
        postaRomana.ataseaza(paulPaul);
        postaRomana.ataseaza(paulPaul2);
        postaRomana.ataseaza(bogdanBogdan);

        Scrisoare scrisoareUnu = new Scrisoare("Alexandru Alexandru", "Str. Cenusii, Prejmer", "Mai ai 5 zile!");
        postaRomana.adaugaScrisoare(scrisoareUnu);
        postaRomana.deataseaza(alexandruAlexandru);
        Scrisoare scrisoareDoi = new Scrisoare("Paul Paul", "Str. Prunului, Brasov", "Unde sunt bani?");
        postaRomana.adaugaScrisoare(scrisoareDoi);
        postaRomana.deataseaza(paulPaul);
        Scrisoare scrisoareTrei = new Scrisoare("Paul Paul", "Str. Lacramioarei, Brasov", "Te-am gasit!");
        postaRomana.adaugaScrisoare(scrisoareTrei);
        postaRomana.deataseaza(paulPaul2);
        Scrisoare scrisoarePatru = new Scrisoare("Bogdan Bogdan", "Aleea Minerva, Brasov", "Mersi iepuras!");
        postaRomana.adaugaScrisoare(scrisoarePatru);
        postaRomana.deataseaza(bogdanBogdan);

    }
}
