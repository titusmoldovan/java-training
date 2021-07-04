package Popeiu.Roxana.Proiect1;

public class ATMResources {

    private int banknoteNr;


    public ATMResources(int banknoteNr) {
       this.banknoteNr = banknoteNr;
    }

    public int getBanknoteNr() {
        return this.banknoteNr;
    }
   public void substractBanknoteNr(int nr){
        this.banknoteNr-=nr;
   }

}
