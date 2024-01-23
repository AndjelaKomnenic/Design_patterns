package org.example.creational_DP.Builder;

public class KidsMeal implements MealBuilder{
    private Meal kidsMeal = new Meal();

    @Override
    public void buildBurger() {
        kidsMeal.setBurger("Mini chicken burger");
    }

    @Override
    public void buildDrink() {
        kidsMeal.setDrink("Orange juice");
    }

    @Override
    public void buildSide() {
        kidsMeal.setSide("Mini fries");
    }

    @Override
    public Meal getMeal() {
        return kidsMeal;
    }
}
