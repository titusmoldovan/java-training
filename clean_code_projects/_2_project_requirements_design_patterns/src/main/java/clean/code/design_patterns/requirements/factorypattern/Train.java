package clean.code.design_patterns.requirements.factorypattern;

public class Train implements Transport {
    @Override
    public void deliver() {
        System.out.println("The mail is being delivered using the train with ID: "+this);
    }
}
