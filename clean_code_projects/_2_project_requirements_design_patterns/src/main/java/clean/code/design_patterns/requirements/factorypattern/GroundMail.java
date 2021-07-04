package clean.code.design_patterns.requirements.factorypattern;

public class GroundMail extends Mail {
    @Override
    public Transport createTransport() {
        return (Transport) (new Train());
    }
}
