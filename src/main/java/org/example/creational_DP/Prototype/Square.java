package org.example.creational_DP.Prototype;

public class Square implements Shape{
    private String color;

    public Square(String color) {
        this.color = color;
    }

    @Override
    public Shape clone() {
        return new Square(this.color);
    }

    @Override
    public void draw() {
        System.out.println("Drawing Square with color: " + color);
    }
}
