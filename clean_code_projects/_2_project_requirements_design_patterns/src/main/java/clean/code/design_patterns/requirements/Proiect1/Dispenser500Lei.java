package Popeiu.Roxana.Proiect1;

public class Dispenser500Lei implements DispenseChain{
    private DispenseChain chain;
    private ATMResources lei500BanknoteNr;

    public Dispenser500Lei(ATMResources lei500BanknoteNr) {
        this.lei500BanknoteNr = lei500BanknoteNr;
    }

    @Override
    public void setNextChain(DispenseChain nextChain) {
        this.chain=nextChain;

    }

    @Override
    public boolean dispense(Currency cur) {
        boolean ok=false;
        int num=0;
        if(cur.getAmount() >= 500) {

             num = Math.min(cur.getAmount() / 500, lei500BanknoteNr.getBanknoteNr() );//calculeaza nr de bancnote date de aparat
            int remainder = cur.getAmount() - (num * 500);//calculeaza suma ramasa de dat

            if (remainder != 0) {
                ok= this.chain.dispense(new Currency(remainder));// verifica daca aparatul a acoperit total suma

            }
            else
            {
               ok=true;
            }
        }
        if (cur.getAmount()==0)
        {
           ok=true;
        }
        if (ok && num!=0)//verifica daca aparatul returneaza vreo bancnota de 500 e lei
        {
            System.out.println("Primeste " + num + (num == 1 ? " bancnota" : " bancnote") + " de 500 lei ");
            lei500BanknoteNr.substractBanknoteNr(num);
        }
        if(!ok)
        {
            ok=this.chain.dispense(cur);//trimite suma la restul bancnotelor
        }
          return ok;

    }
}
