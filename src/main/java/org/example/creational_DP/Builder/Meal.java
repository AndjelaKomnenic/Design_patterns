package org.example.creational_DP.Builder;

public class Meal {
    private String burger;
    private String drink;
    private String side;

    public void setBurger(String burger) {
        this.burger = burger;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }

    public void setSide(String side) {
        this.side = side;
    }

    public void display() {
        System.out.println("Burger: " + burger);
        System.out.println("Drink: " + drink);
        System.out.println("Side: " + side);
    }
}
