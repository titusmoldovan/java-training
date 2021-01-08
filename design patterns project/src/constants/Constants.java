package constants;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Constants used in this project
 */
public class Constants {
    // Cities
    public static final String BUCHAREST = "Bucharest";
    public static final String PLOIESTI = "Ploiesti";
    public static final String PITESTI = "Pitesti";

    //  Pizza sizes
    public static final String LARGE = "large";
    public static final String MEDIUM = "medium";
    public static final String SMALL = "small";

    //  Pizza prices (for an empty pizza so to say)
    public static final double LARGE_PRICE = 40.50;
    public static final double MEDIUM_PRICE = 30.50;
    public static final double SMALL_PRICE = 20.50;

    //  Extra cost for every type of pizza
    public static final double HAWAIIAN_ADDON = 4.50;
    public static final double RUSTICA_ADDON = 2.75;
    public static final double SUPREME_ADDON = 5.65;

    //  Pizza types
    public static final String HAWAIIAN = "Hawaiian";
    public static final String RUSTICA = "Rustica";
    public static final String SUPREME = "Supreme";

    // Ingredients
    public static final String HAM ="ham";
    public static final String MOZZARELLA = "mozzarella";
    public static final String PEPPERONI = "pepperoni";
    public static final String BACON = "bacon";
    public static final String SAUSAGE = "sausage";
    public static final String SAUCE = "tomato sauce";
    public static final String OLIVES = "olives";
    public static final String ONION = "onion";
    public static final String PEPPER = "pepper";
    public static final String CHICKEN = "chicken";
    public static final String PINEAPPLE = "pineapple";

    //  List of ingredients
    public final static List<String> HAWAIIAN_INGREDIENTS = new ArrayList<>(
            Arrays.asList(PINEAPPLE, MOZZARELLA, SAUCE, HAM)
    );
    public final static List<String> RUSTICA_INGREDIENTS = new ArrayList<>(
            Arrays.asList(MOZZARELLA, SAUCE, SAUSAGE, PEPPER, HAM, ONION, OLIVES)
    );
    public final static List<String> SUPREME_INGREDIENTS = new ArrayList<>(
            Arrays.asList(MOZZARELLA, SAUCE, SAUSAGE, PEPPER, HAM, CHICKEN, BACON, PEPPERONI)
    );

}
