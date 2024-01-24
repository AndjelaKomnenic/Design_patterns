package org.example.structural_DP.Decorator;

// Concrete decorators
public class SugarDecorator extends CoffeeDecorator{
    public SugarDecorator(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    @Override
    public double cost() {
        return super.cost() + 0.2;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", with Sugar";
    }
}
