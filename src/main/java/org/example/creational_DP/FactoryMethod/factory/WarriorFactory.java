package org.example.creational_DP.FactoryMethod.factory;

import org.example.creational_DP.AbstractFactory.weapons.PowerfulSword;
import org.example.creational_DP.AbstractFactory.weapons.Weapon;
import org.example.creational_DP.FactoryMethod.characters.Character;
import org.example.creational_DP.FactoryMethod.characters.Warrior;

public class WarriorFactory extends CharacterFactory {
    @Override
    public Character createCharacter() {
        return new Warrior("Pera", 80, true);
    }

    // for abstract factory
    @Override
    public Weapon createWeapon() {
        return new PowerfulSword();
    }
}
