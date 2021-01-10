package decorator.design.pattern;

public class TV extends LivingRoomDecorator {
    public TV(LivingRoom livingRoom) {
        super(livingRoom);
    }
    public String furnish(){
        return super.furnish() + furnishWithTv();
    }
    private String furnishWithTv(){
        return " with TV";
    }
}
