package projectOne.entities;

import projectOne.exceptions.TypeNotFoundException;
import projectOne.products.Magazine;
import projectOne.products.MagazineFactory;
import projectOne.products.MagazineType;

import java.util.List;

public class Admin {

    private static Admin admin = new Admin();

    private Admin () {
    }

    public static Admin getInstance () {
        return admin;
    }

    private Magazine createMagazine (String type) throws TypeNotFoundException {

        return MagazineFactory.getMagazine(translateType(type));
    }

    public void addToStock (String type, List<Magazine> stock) throws TypeNotFoundException {
        stock.add(createMagazine(type));
    }

    public void showStock (List<Magazine> stock) {
        int i = 1;
        for (Magazine magazine : stock){
            System.out.println(i + ". " + magazine.getType().toString() + " magazine");
            i++;
        }

    }

    public void deleteFromStock(String type, String index, List<Magazine> stock){
        int buff = Integer.parseInt(index);
        try {
            deleteFromStockHelper(type, buff, stock);
        } catch (TypeNotFoundException e) {
            System.out.println(e.toString());
        }

    }

    private void deleteFromStockHelper (String type, int index, List<Magazine> stock) throws TypeNotFoundException {
        int counter = 0;

        for (Magazine magazine : stock) {
            if (magazine.getType().equals(translateType(type))) {
                if (counter == index) {
                    stock.remove(magazine);
                }
                else {
                    counter++;
                }
            }
        }

    }

    public MagazineType translateType(String type) throws TypeNotFoundException {
        switch (type.toLowerCase()) {
            case "health" -> {
                return MagazineType.HEALTH;
            }
            case "fashion" -> {
                return MagazineType.FASHION;
            }
            case "cooking" -> {
                return MagazineType.COOKING;
            }
            default -> throw new TypeNotFoundException("This type does not exist");
        }
    }

}
