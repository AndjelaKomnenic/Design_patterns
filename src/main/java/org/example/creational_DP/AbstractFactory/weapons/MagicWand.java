package org.example.creational_DP.AbstractFactory.weapons;

public class MagicWand implements Weapon{
    @Override
    public void createWeapon() {
        System.out.println("Creating a magical wand...");
    }
    @Override
    public String getName() {
        return "Magic Wand";
    }
}
