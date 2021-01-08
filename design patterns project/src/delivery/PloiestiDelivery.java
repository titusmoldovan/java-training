package delivery;

/**
 * Deliver the pizza to Ploiesti
 */
public class PloiestiDelivery implements Delivery{
    @Override
    public void deliverPizza() {
        System.out.println("Thank you for ordering from us! Our team in Ploiesti will take care of"
                + " your order. Estimated delivery time: 1 hour and 10 minutes");
    }
}
