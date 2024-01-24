package org.example.behavioral_DP.ChainOfResponsibility;

public class Director implements Approver{
    private Approver nextApprover;

    @Override
    public void setNextApprover(Approver nextApprover) {
        this.nextApprover = nextApprover;
    }

    @Override
    public void processRequest(PurchaseRequest purchaseRequest) {
        if (purchaseRequest.getAmount() <= 5000) {
            System.out.println("Director approves purchase request #" + purchaseRequest.getNumber());
        } else if (nextApprover != null) {
            nextApprover.processRequest(purchaseRequest);
        } else {
            System.out.println("Purchase request #" + purchaseRequest.getNumber() + " requires higher approval.");
        }
    }
}
