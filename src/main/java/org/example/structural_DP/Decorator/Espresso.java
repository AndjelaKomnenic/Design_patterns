package org.example.structural_DP.Decorator;

// Concrete component
public class Espresso implements Coffee{
    @Override
    public double cost() {
        return 2.0;
    }

    @Override
    public String getDescription() {
        return "Espresso";
    }
}
