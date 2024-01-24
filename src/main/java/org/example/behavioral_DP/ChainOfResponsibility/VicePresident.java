package org.example.behavioral_DP.ChainOfResponsibility;

public class VicePresident implements Approver{
    @Override
    public void setNextApprover(Approver nextApprover) {

    }

    @Override
    public void processRequest(PurchaseRequest purchaseRequest) {
        System.out.println("Vice President approves purchase request #" + purchaseRequest.getNumber());

    }
}
