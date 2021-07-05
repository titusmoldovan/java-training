package data;

import business.BaseProduct;
import business.MenuItem;

import java.io.*;
import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReadProducts implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    public ReadProducts() throws IOException, ClassNotFoundException {
        File f = new File("products.ser");
        if (f.exists()) {
            f.delete();
        } else {
            String fileName = "src\\main\\java\\data\\products.csv";
            List<BaseProduct> products;
            try (Stream<String> stream = Files.lines(Paths.get(fileName))) {
                List<BaseProduct> readAux = new ArrayList<>();
                stream.filter(lines -> !lines.startsWith("Title")).forEach(lines -> {
                    String[] elements = lines.split(",");
                    float rating = Float.parseFloat(elements[1]);
                    float calories = Float.parseFloat(elements[2]);
                    float protein = Float.parseFloat(elements[3]);
                    float fat = Float.parseFloat(elements[4]);
                    float sodium = Float.parseFloat(elements[5]);
                    float price = Float.parseFloat(elements[6]);
                    BaseProduct b = new BaseProduct(elements[0], rating, calories, protein, fat, sodium, price);
                    readAux.add(b);
                });
                products = readAux.stream().filter(distinctByKey(BaseProduct::getTitle)).collect(Collectors.toList());
            }
            List<MenuItem> menuItems = new ArrayList<>(products);
            Serializator.productsSerialization(menuItems);
        }
    }
    public static <T> Predicate<T> distinctByKey(Function<? super T, ?> keyExtractor) {
        Set<Object> seen = ConcurrentHashMap.newKeySet();
        return t -> seen.add(keyExtractor.apply(t));
    }

}
