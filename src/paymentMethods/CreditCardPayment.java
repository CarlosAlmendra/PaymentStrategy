package paymentMethods;

import interfaces.PaymentStrategy;

import java.util.Scanner;

public class CreditCardPayment implements PaymentStrategy {

    Scanner sc = new Scanner(System.in);

    public CreditCardPayment() {}

    @Override
    public void processPayment(double amount) {
        System.out.print("\nType credit card number: ");
        sc.next();
        System.out.print("\nCredit card payment was successful, $" + amount + ".");
    }
}
