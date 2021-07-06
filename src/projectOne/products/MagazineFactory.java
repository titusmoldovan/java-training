package projectOne.products;

public class MagazineFactory {
    public static Magazine getMagazine (MagazineType type) {
        switch (type) {
            case HEALTH:
                return new HealthMagazine();
            case FASHION:
                return new FashionMagazine();
            case COOKING:
                return new CookingMagazine();
            default:
                return null;
        }
    }


}
