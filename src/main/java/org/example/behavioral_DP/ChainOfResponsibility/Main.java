package org.example.behavioral_DP.ChainOfResponsibility;

public class Main {
    public static void main(String[] args) {
        Approver manager = new Manager();
        Approver director = new Director();
        Approver vicePresident = new VicePresident();

        manager.setNextApprover(director);
        director.setNextApprover(vicePresident);

        PurchaseRequest request1 = new PurchaseRequest(1, 800);
        PurchaseRequest request2 = new PurchaseRequest(2, 3500);
        PurchaseRequest request3 = new PurchaseRequest(3, 10000);

        manager.processRequest(request1);
        manager.processRequest(request2);
        manager.processRequest(request3);
    }
}
