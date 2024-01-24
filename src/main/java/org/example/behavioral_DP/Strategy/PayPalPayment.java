package org.example.behavioral_DP.Strategy;

public class PayPalPayment implements PaymentStrategy{

    private String email;

    public PayPalPayment(String email) {
        this.email = email;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing PayPal payment of $" + amount);
    }
}
