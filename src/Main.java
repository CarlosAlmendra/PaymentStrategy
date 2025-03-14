import processors.PaymentProcessor;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        PaymentProcessor paymentProcessor = new PaymentProcessor();

        System.out.print("Selecione um meio de pagamento:\n1- PIX\n2- CARTAO DE CRÉDITO\n3- BOLETO\nR:");
        Integer option = sc.nextInt();
        System.out.print("\nDigite o valor da transação: \nR:");
        Double value = sc.nextDouble();

        paymentProcessor.selectPaymentStrategy(option, value);
        sc.close();
    }
}