package clean.code.design_patterns.requirements.factorypattern;

public class AirMail extends Mail {
    @Override
    public Transport createTransport() {
        return (Transport)(new Plane());
    }
}
