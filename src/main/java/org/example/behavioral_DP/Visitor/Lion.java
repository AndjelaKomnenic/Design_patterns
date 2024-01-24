package org.example.behavioral_DP.Visitor;

public class Lion implements Animal{
    @Override
    public void accept(Visitor visitor) {
        visitor.visitLion(this);
    }

    void roar() {
        System.out.println("The lion roars!");
    }
}
