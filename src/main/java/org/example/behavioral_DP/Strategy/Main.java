package org.example.behavioral_DP.Strategy;

public class Main {
    public static void main(String[] args) {
        PaymentProcessor paymentProcessor = new PaymentProcessor(new CreditCardPayment("1234-5678-9012-3456", "12/23"));

        paymentProcessor.checkout(100.0);

        paymentProcessor.setPaymentStrategy(new PayPalPayment("john.doe@example.com"));
        paymentProcessor.checkout(50.0);
    }
}
