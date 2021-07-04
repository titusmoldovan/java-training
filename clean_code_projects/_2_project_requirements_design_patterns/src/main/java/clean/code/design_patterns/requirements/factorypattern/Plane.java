package clean.code.design_patterns.requirements.factorypattern;

public class Plane implements Transport {
    @Override
    public void deliver() {
        System.out.println("The mail is being delivered using airplane with ID: "+this);
    }
}
