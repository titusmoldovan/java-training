package decorator.design.pattern;

public class Sofa extends LivingRoomDecorator {
    public Sofa(LivingRoom livingRoom) {
        super(livingRoom);
    }
    public String furnish(){
        return super.furnish() + furnishWithSofa();
    }
    private String furnishWithSofa(){
        return " with sofa";
    }
}
