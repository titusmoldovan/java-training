package clean.code.design_patterns.requirements.factorypattern;

public class Ship implements Transport {
    @Override
    public void deliver() {
        System.out.println("The mail is being delivered using ship with ID: "+this);
    }
}
