package org.example.creational_DP.Builder;

public interface MealBuilder {
    void buildBurger();
    void buildDrink();
    void buildSide();
    Meal getMeal();
}
