package org.example.structural_DP.Flyweight;

public class Main {
    public static void main(String[] args) {
        System.out.println("Without Flyweight (Before):");
        long beforeMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        testTrees();
        long afterMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        System.out.println("Memory used: " + (afterMemory - beforeMemory) + " bytes\n");

        System.out.println("With Flyweight (After):");
        beforeMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        testTreesWithFlyweight();
        afterMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        System.out.println("Memory used: " + (afterMemory - beforeMemory) + " bytes");
    }

    private static void testTrees() {
        Tree pineTree1 = new PineTree("Green");
        Tree pineTree2 = new PineTree("Green");
        Tree oakTree = new OakTree("Brown");

        pineTree1.draw(0, 0);
        pineTree2.draw(10, 0);
        oakTree.draw(20, 0);
    }

    private static void testTreesWithFlyweight() {
        Tree pineTree1 = TreeFactory.getTree("Pine", "Green");
        Tree pineTree2 = TreeFactory.getTree("Pine", "Green");
        Tree oakTree = TreeFactory.getTree("Oak", "Brown");

        pineTree1.draw(0, 0);
        pineTree2.draw(10, 0);
        oakTree.draw(20, 0);
    }
}
