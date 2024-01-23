package org.example.creational_DP.Builder;

public class Main {
    public static void main(String[] args) {
        Waiter waiter = new Waiter();

        MealBuilder classicMealBuilder = new ClassicMeal();
        waiter.constructMeal(classicMealBuilder);
        Meal classM = classicMealBuilder.getMeal();
        classM.display();

        System.out.println();

        MealBuilder kidsMealBuilder = new KidsMeal();
        waiter.constructMeal(kidsMealBuilder);
        Meal kidsM = kidsMealBuilder.getMeal();
        kidsM.display();
    }
}
