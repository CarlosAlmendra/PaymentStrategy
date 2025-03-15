package paymentMethods;

import interfaces.PaymentStrategy;
import utils.RandomUtils;

public class PixPayment implements PaymentStrategy {

    RandomUtils randomUtils = new RandomUtils();

    public PixPayment() {}

    @Override
    public void processPayment(double amount) {
        System.out.println("\nPixPayment called, code: " + randomUtils.getRandomNumber(8));
    }
}
