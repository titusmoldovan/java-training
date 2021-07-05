package business;
import java.io.Serial;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class CompositeProduct extends MenuItem implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    public List<MenuItem> compositeProduct;

    public CompositeProduct(){
        this.compositeProduct = new ArrayList<>();
    }

    public void addMenuItem(MenuItem mi){
        compositeProduct.add(mi);
    }
    public void removeMenuItem(MenuItem mi){
        compositeProduct.remove(mi);
    }
    public List<MenuItem> getMenuItems(){
        return compositeProduct;
    }
    public double computePrice(){
        float price=0;
        for(MenuItem mi : compositeProduct){
            price+= mi.computePrice();
        }
        return price;
    }

    @Override
    public String getTitle() {
        StringBuilder sb = new StringBuilder();
        for(MenuItem m : compositeProduct){
            sb.append(((BaseProduct)m).getTitle());
            sb.append(",");
        }
        sb.deleteCharAt(sb.length()-1);
        return sb.toString();
    }

    @Override
    public double getRating() {
     return 0;
    }

    @Override
    public double getCalories() {
        return 0;
    }

    @Override
    public double getProtein() {
        return 0;
    }

    @Override
    public double getFat() {
        return 0;
    }

    @Override
    public double getSodium() {
        return 0;
    }

}
