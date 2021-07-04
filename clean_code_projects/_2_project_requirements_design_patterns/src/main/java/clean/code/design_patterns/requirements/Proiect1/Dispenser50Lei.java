package Popeiu.Roxana.Proiect1;

public class Dispenser50Lei implements DispenseChain {
    private DispenseChain chain;
    private ATMResources lei50BanknoteNr;

    public Dispenser50Lei(ATMResources lei50BanknoteNr) {
        this.lei50BanknoteNr = lei50BanknoteNr;
    }

    @Override
    public void setNextChain(DispenseChain nextChain) {
        this.chain=nextChain;
    }

    @Override
    public boolean dispense(Currency cur) {
        boolean ok=false;
        int num=0;
        if(cur.getAmount() >= 50) {

            num = Math.min(cur.getAmount() / 50, lei50BanknoteNr.getBanknoteNr() );
            int remainder = cur.getAmount() - (num * 50);

            if (remainder != 0) {
                ok= this.chain.dispense(new Currency(remainder));

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
        if (ok && num!=0)
        {
            System.out.println("Primeste " + num + (num == 1 ? " bancnota" : " bancnote") + " de 50 lei ");
            lei50BanknoteNr.substractBanknoteNr(num);
        }
        if(!ok)
        {
            ok=this.chain.dispense(cur);
        }
        return ok;

    }
}
