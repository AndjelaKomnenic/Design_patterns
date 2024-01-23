package org.example.creational_DP.FactoryMethod.characters;

public class Wizard implements Character {

    private String name;
    private int health;

    public Wizard(String name, int health) {
        this.name = name;
        this.health = health;
    }

    @Override
    public void createCharacter() {
        System.out.println("Wizard: " + name + " \nHealth: " + health);
    }

    @Override
    public String getName() {
        return name;
    }
}
