package clean.code.design_patterns.requirements.factorypattern;

public abstract class Mail {
    public abstract Transport createTransport();

    public void deliver(){
        Transport transport=this.createTransport();
        transport.deliver();
    }
}
