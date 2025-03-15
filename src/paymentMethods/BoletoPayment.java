package paymentMethods;

import interfaces.PaymentStrategy;
import utils.RandomUtils;

public class BoletoPayment implements PaymentStrategy {

    RandomUtils randomUtils = new RandomUtils();

    public BoletoPayment() {}

    @Override
    public void processPayment(double amount) {
        System.out.println("\nBoleto payment has been processed: " + randomUtils.getRandomNumber(8));
    }
}
