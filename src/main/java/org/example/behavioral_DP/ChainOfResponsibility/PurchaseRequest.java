package org.example.behavioral_DP.ChainOfResponsibility;

public class PurchaseRequest {
    private int number;
    private double amount;

    public PurchaseRequest(int number, double amount) {
        this.number = number;
        this.amount = amount;
    }

    public int getNumber() {
        return number;
    }

    public double getAmount() {
        return amount;
    }
}
