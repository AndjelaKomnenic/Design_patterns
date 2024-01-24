package org.example.structural_DP.Flyweight;

// Concrete Flyweight
public class PineTree implements Tree{
    private String color;  // Intrinsic state

    public PineTree(String color) {
        this.color = color;
    }

    @Override
    public void draw(int x, int y) {
        System.out.println("Drawing a " + color + " pine tree at position (" + x + ", " + y + ")");
    }
}
