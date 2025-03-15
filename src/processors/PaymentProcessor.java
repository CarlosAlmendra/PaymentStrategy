package processors;

import interfaces.PaymentStrategy;
import paymentMethods.BoletoPayment;
import paymentMethods.CreditCardPayment;
import paymentMethods.PixPayment;

import java.util.Map;

public class PaymentProcessor {

    private final Map<Integer, PaymentStrategy> mapStrategy = Map.of(
            1, new PixPayment(),
            2, new CreditCardPayment(),
            3, new BoletoPayment()
    );

    public PaymentProcessor() {}

    public void selectPaymentStrategy(Integer option, Double value) {
        PaymentStrategy strategy = mapStrategy.get(option);

        if (strategy == null) {
            System.out.println("\nInvalid option. Please select a valid payment method.");
            return;
        }

        strategy.processPayment(value);
    }

}
