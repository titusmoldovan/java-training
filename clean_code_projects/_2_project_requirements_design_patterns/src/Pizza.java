public class Pizza implements IPizza {
doughType crust;
pizzaSize sizeOfPizza;
pizzaName name;
double price;

    public Pizza(doughType crust, pizzaSize sizeOfPizza, pizzaName name, double price) {
        this.crust = crust;
        this.sizeOfPizza = sizeOfPizza;
        this.name = name;
        this.price = price;
    }

    @Override
    public String getDescription() {

        return sizeOfPizza.name() +" Pizza " +name.toString()+" with "+crust.toString()+" dough";


    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "crust=" + crust.toString() +
                ", sizeOfPizza=" + sizeOfPizza.name() +
                ", name=" + name +
                ", price=" + price +
                '}';
    }

}
