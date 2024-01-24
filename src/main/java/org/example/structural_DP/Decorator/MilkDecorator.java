package org.example.structural_DP.Decorator;

// Concrete decorators
public class MilkDecorator extends CoffeeDecorator{
    public MilkDecorator(Coffee decoratorCoffee) {
        super(decoratorCoffee);
    }

    @Override
    public double cost() {
        return super.cost() + 0.5;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", with milk";
    }
}
