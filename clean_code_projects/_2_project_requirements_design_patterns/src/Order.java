import java.util.Objects;
enum OrderStatus{
    ready(2), in_process(1), delivering(3), completed(4);
    int statusId;

    OrderStatus(int statusId) {
        this.statusId = statusId;
    }

    public int getStatusId() {
        return statusId;
    }

    public void setStatusId(int statusId) {
        this.statusId = statusId;
    }
}

public class Order {
    Pizza pizza;
    Client client;
    double finalPrice;
    int id;
    OrderStatus status;
    PizzaWithToppings pizzaWithToppings;
    public Order(Pizza pizza, Client client, double finalPrice, int id, OrderStatus status) {
        this.pizza = pizza;
        this.client = client;
        this.finalPrice = finalPrice;
        this.id = id;
        this.status = status;
    }

    public Order(Client client, double finalPrice, int id, OrderStatus status, PizzaWithToppings pizzaWithToppings) {
        this.client = client;
        this.finalPrice = finalPrice;
        this.id = id;
        this.status = status;
        this.pizzaWithToppings = pizzaWithToppings;
    }

    public Pizza getPizza() {
        return pizza;
    }

    public Client getClient() {
        return client;
    }

    public double getFinalPrice() {
        return finalPrice;
    }

    public int getId() {
        return id;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setPizza(Pizza pizza) {
        this.pizza = pizza;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void setFinalPrice(double finalPrice) {
        this.finalPrice = finalPrice;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return id == order.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
