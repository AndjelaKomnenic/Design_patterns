package org.example.behavioral_DP.Visitor;

public class HealthCheckVisitor implements Visitor{
    @Override
    public void visitLion(Lion lion) {
        System.out.println("Performing health check on the lion.");
        lion.roar();
    }

    @Override
    public void visitElephant(Elephant elephant) {
        System.out.println("Performing health check on the elephant.");
        elephant.trumpet();
    }
}
