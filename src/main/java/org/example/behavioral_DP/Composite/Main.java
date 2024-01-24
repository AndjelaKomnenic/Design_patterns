package org.example.behavioral_DP.Composite;

public class Main {
    public static void main(String[] args) {
        Circle redCircle = new Circle("red");
        Square blueSquare = new Square("blue");

        CompositeGraphics compositeGraphic = new CompositeGraphics();
        compositeGraphic.add(redCircle);
        compositeGraphic.add(blueSquare);

        compositeGraphic.draw();
    }
}
