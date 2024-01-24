package org.example.structural_DP.Composite;

// Leaf
public class Circle implements Graphics{

    private String color;

    public Circle(String color) {
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println("Drawing Circle with color: " + color);
    }
}
