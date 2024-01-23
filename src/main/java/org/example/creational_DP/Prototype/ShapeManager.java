package org.example.creational_DP.Prototype;

import java.util.HashMap;
import java.util.Map;

public class ShapeManager {
    private Map<String, Shape> shapePrototypes = new HashMap<>();

    public void addShapePrototype(String key, Shape prototype) {
        shapePrototypes.put(key, prototype);
    }

    public Shape getShapeClone(String key) {
        return shapePrototypes.get(key).clone();
    }
}
