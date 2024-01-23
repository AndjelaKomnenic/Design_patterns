package org.example.creational_DP.Builder;

//director in bulder dp
public class Waiter {
    public void constructMeal(MealBuilder builder){
        builder.buildBurger();
        builder.buildDrink();
        builder.buildSide();
    }
}
