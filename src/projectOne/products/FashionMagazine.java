package projectOne.products;

public class FashionMagazine implements Magazine {

    private String name;

    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    @Override
    public void subscription () {
        System.out.println("Client subscribed to a fashion magazine");
    }

    @Override
    public void show () {
        System.out.println("This is a fashion magazine");
    }

    @Override
    public MagazineType getType () {
        return MagazineType.FASHION;
    }
}
