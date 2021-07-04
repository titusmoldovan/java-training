public enum Toppings {
    Cheese(4.5), Olives(3), Mushrooms(6), Bacon(4);
    double toppingsId;

    Toppings(double toppingsId) {
        this.toppingsId = toppingsId;
    }

    public double getToppingsId() {
        return toppingsId;
    }
}
