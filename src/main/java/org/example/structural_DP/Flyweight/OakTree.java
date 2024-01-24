package org.example.structural_DP.Flyweight;

// Concrete Flyweight
public class OakTree implements Tree{
    private String color;  // Intrinsic state

    public OakTree(String color) {
        this.color = color;
    }

    @Override
    public void draw(int x, int y) {
        System.out.println("Drawing a " + color + " oak tree at position (" + x + ", " + y + ")");
    }
}
