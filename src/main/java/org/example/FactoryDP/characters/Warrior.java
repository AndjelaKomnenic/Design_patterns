package org.example.FactoryDP.characters;

public class Warrior implements Character {


    private String name;
    private int health;
    private boolean shield;

    public Warrior(String name, int health, boolean shield) {
        this.name = name;
        this.health = health;
        this.shield = shield;
    }

    @Override
    public void createCharacter() {
        System.out.println("Warrior: " + name + " \nHealth: " + health + " \nShield: " + shield);
    }
}
