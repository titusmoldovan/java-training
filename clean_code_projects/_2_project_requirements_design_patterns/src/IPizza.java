public interface IPizza {
    public String getDescription();
    public double getPrice();
}
interface PizzaDecorator extends IPizza {
     @Override
     public String getDescription();

     @Override
     public double getPrice();
 }

