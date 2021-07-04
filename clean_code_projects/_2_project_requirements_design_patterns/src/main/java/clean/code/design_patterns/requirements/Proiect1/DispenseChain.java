package Popeiu.Roxana.Proiect1;

public interface DispenseChain {
    void setNextChain(DispenseChain nextChain);

    boolean dispense(Currency cur);
}
