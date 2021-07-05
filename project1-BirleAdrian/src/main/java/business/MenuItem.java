package business;

import data.Serializator;
import org.bouncycastle.jcajce.provider.symmetric.ARC4;

import java.io.Serial;
import java.io.Serializable;

public abstract class MenuItem implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    public abstract double computePrice();
    public abstract String getTitle();
    public abstract double getRating();
    public abstract double getCalories();
    public abstract double getProtein();
    public abstract double getFat();
    public abstract double getSodium();

}
