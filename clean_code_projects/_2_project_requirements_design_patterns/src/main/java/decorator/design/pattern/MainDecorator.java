package decorator.design.pattern;

/*
Consider we have a living room that we want to furnish.
We want to buy and bring in a sofa and a TV that will fit in the allocated space so as not to redesign and rebuild the living room.
 */

public class MainDecorator {
    public static void main(String[] args) {
        LivingRoom livingRoom = new Sofa(new TV(new LivingRoomImpl()));

        System.out.println(livingRoom.furnish());
    }
}
