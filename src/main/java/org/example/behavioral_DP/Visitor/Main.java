package org.example.behavioral_DP.Visitor;

public class Main {
    public static void main(String[] args) {
        Lion lion = new Lion();
        Elephant elephant = new Elephant();

        Visitor feedingVisitor = new FeedingVisitor();
        Visitor healthCheckVisitor = new HealthCheckVisitor();

        lion.accept(feedingVisitor);
        elephant.accept(feedingVisitor);

        System.out.println("-------------------------");

        lion.accept(healthCheckVisitor);
        elephant.accept(healthCheckVisitor);
    }
}
