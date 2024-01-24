package org.example.structural_DP.Flyweight;

import java.util.HashMap;
import java.util.Map;

// Flyweight Factory
public class TreeFactory {
    private static final Map<String, Tree> treeCache = new HashMap<>();

    public static Tree getTree(String type, String color) {
        String key = type + "_" + color;

        return treeCache.computeIfAbsent(key, k -> {
            System.out.println("Creating a new " + color + " " + type + " tree");
            switch (type) {
                case "Pine":
                    return new PineTree(color);
                case "Oak":
                    return new OakTree(color);
                default:
                    throw new IllegalArgumentException("Unsupported tree type: " + type);
            }
        });
    }

}
