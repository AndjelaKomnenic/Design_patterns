package org.example.behavioral_DP.Composite;

import java.util.ArrayList;
import java.util.List;

public class CompositeGraphics implements Graphics{

    private List<Graphics> graphics = new ArrayList<>();

    public void add(Graphics graphic) {
        graphics.add(graphic);
    }

    @Override
    public void draw() {
        System.out.println("Drawing Composite Graphic");
        for (Graphics graphic : graphics) {
            graphic.draw();
        }
    }
}
