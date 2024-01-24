package org.example.behavioral_DP.ChainOfResponsibility;

public interface Approver {
    void processRequest(PurchaseRequest purchaseRequest);
    void setNextApprover(Approver nextApprover);
}
