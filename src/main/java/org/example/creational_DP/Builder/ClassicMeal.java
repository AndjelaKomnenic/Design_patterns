package org.example.creational_DP.Builder;

public class ClassicMeal implements MealBuilder{
    private Meal classicMeal = new Meal();
    @Override
    public void buildBurger() {
        classicMeal.setBurger("Classic meal");
    }

    @Override
    public void buildDrink() {
        classicMeal.setDrink("Coca-Cola");
    }

    @Override
    public void buildSide() {
        classicMeal.setSide("Fries");
    }

    @Override
    public Meal getMeal() {
        return classicMeal;
    }
}
