public class main {
    public static void main(String args[]) {
        System.out.println("THIS IS A MOVIE DATABASE.");
        BazaDeDate bazaDeDate = new BazaDeDate();
        System.out.println("Lista studiouri cu mai mult de doua filme produse: " + bazaDeDate.studiouriCuMaiMultDeDouaFilme());
        System.out.println("Lista studiouri in care au jucat actori cu mai mult de doua oscaruri: " + bazaDeDate.studiouriInCareAuJucatActoriCuMaiMultDeDouaOscaruri());
        System.out.println("Lista filme in care au jucat actori care au mai mult de 50 de ani: " + bazaDeDate.filmeInCareAuJucatActoriCareAuCelPutin50DeAni());
    }
}
