package delivery;

/**
 * Deliver the pizza to Pitesti
 */
public class PitestiDelivery implements Delivery{
    @Override
    public void deliverPizza() {
        System.out.println("Thank you for ordering from us! Our team in Pitesti will take care of"
                + " your order. Estimated delivery time: 45 minutes");
    }
}
