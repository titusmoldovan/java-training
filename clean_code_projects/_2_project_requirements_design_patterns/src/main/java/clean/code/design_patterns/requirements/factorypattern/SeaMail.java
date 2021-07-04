package clean.code.design_patterns.requirements.factorypattern;

public class SeaMail extends Mail {
    @Override
    public Transport createTransport() {
        return (Transport)(new Ship());
    }
}
