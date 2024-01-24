package org.example.structural_DP.Decorator;

public class Main {
    public static void main(String[] args) {
        Coffee espresso = new Espresso();
        System.out.println("Cost: $" + espresso.cost());
        System.out.println("Description: " + espresso.getDescription());

        Coffee milkCoffee = new MilkDecorator(espresso);
        System.out.println("Cost: $" + milkCoffee.cost());
        System.out.println("Description: " + milkCoffee.getDescription());

        Coffee sugarMilkCoffee = new SugarDecorator(milkCoffee);
        System.out.println("Cost: $" + sugarMilkCoffee.cost());
        System.out.println("Description: " + sugarMilkCoffee.getDescription());
    }
}

