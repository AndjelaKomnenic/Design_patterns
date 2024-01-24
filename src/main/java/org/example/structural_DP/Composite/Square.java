package org.example.structural_DP.Composite;

// Leaf
public class Square implements Graphics{
    private String color;

    public Square(String color) {
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println("Drawing Square with color: " + color);
    }
}
