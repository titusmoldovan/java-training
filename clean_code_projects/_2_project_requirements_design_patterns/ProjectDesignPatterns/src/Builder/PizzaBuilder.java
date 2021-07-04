package Builder;

public abstract class PizzaBuilder {

    protected Pizza pizza;

    public Pizza getPizza() {
        return pizza;
    }

    public void createNewPizza() {
        pizza = new Pizza();
    }

    public abstract void buildCrust();

    public abstract void buildSauce();

    public abstract void buildToppings();
}
