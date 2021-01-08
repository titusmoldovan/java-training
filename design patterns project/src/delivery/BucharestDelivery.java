package delivery;

/**
 * Deliver the pizza to Bucharest
 */
public class BucharestDelivery implements Delivery{
    @Override
    public void deliverPizza() {
        System.out.println("Thank you for ordering from us! Our team in Bucharest will take care of"
                + " your order. Estimated delivery time: 1 hour");
    }
}
