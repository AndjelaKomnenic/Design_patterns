package org.example.behavioral_DP.Visitor;

public class FeedingVisitor implements Visitor{
    @Override
    public void visitLion(Lion lion) {
        System.out.println("Feeding the lion.");
        lion.roar();
    }

    @Override
    public void visitElephant(Elephant elephant) {
        System.out.println("Feeding the elephant.");
        elephant.trumpet();
    }
}
