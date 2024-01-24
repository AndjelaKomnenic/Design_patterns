package org.example.structural_DP.Decorator;

// Decorator
public abstract class CoffeeDecorator implements Coffee {
    protected Coffee decoratorCoffee;

    public CoffeeDecorator(Coffee decoratorCoffee) {
        this.decoratorCoffee = decoratorCoffee;
    }

    @Override
    public double cost() {
        return decoratorCoffee.cost();
    }

    @Override
    public String getDescription() {
        return decoratorCoffee.getDescription();
    }
}
