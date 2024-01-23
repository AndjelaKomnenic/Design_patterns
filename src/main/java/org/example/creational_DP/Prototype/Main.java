package org.example.creational_DP.Prototype;

public class Main {
    public static void main(String[] args) {
        ShapeManager shapeManager = new ShapeManager();

        shapeManager.addShapePrototype("cyanCircle", new Circle("cyan"));
        shapeManager.addShapePrototype("redSquare", new Square("red"));

        Shape customCircle = shapeManager.getShapeClone("cyanCircle");
        customCircle.draw();

        Shape customSquare = shapeManager.getShapeClone("redSquare");
        customSquare.draw();

        Shape originalCyanCircle  = shapeManager.getShapeClone("cyanCircle");
        originalCyanCircle.draw();
    }
}
