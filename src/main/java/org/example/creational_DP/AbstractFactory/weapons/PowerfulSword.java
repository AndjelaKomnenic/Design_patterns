package org.example.creational_DP.AbstractFactory.weapons;

public class PowerfulSword implements Weapon{
    @Override
    public void createWeapon() {
        System.out.println("Creating a mighty sword...");
    }
    @Override
    public String getName() {
        return "Powerful Sword";
    }
}
