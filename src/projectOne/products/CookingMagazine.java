package projectOne.products;

public class CookingMagazine implements Magazine {

    private String name;

    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    @Override
    public void subscription () {
        System.out.println("Client subscribed to a cooking magazine");
    }

    @Override
    public void show () {
        System.out.println("This is a cooking magazine");
    }

    @Override
    public MagazineType getType () {
        return MagazineType.COOKING;
    }
}
