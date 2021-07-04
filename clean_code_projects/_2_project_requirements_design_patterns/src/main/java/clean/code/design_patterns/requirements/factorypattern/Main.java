package clean.code.design_patterns.requirements.factorypattern;

public class Main {
    public static void main(String[] args) {
            SeaMail logistic=new SeaMail();
            logistic.deliver();
            GroundMail logistic1=new GroundMail();
            logistic1.deliver();
            AirMail logistic2=new AirMail();
            logistic2.deliver();
    }
}
