package projectOne.products;

public class HealthMagazine implements Magazine {

    private String name;

    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    @Override
    public void subscription () {
        System.out.println("Client subscribed to a health magazine");
    }

    @Override
    public void show () {
        System.out.println("This is a health magazine");
    }

    @Override
    public MagazineType getType () {
        return MagazineType.HEALTH;
    }
}
