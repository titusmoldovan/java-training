package decorator.design.pattern;

public abstract class LivingRoomDecorator implements LivingRoom{
    private LivingRoom livingRoom;

    public LivingRoomDecorator(LivingRoom livingRoom) {
        this.livingRoom = livingRoom;
    }

    @Override
    public String furnish() {
        return livingRoom.furnish();
    }
}
