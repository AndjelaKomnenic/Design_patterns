package org.example.behavioral_DP.Visitor;

public class Elephant implements Animal{
    @Override
    public void accept(Visitor visitor) {
        visitor.visitElephant(this);
    }

    void trumpet() {
        System.out.println("The elephant trumpets!");
    }
}
