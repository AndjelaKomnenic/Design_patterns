package org.example.creational_DP.FactoryMethod.factory;

import org.example.creational_DP.AbstractFactory.weapons.Weapon;
import org.example.creational_DP.FactoryMethod.characters.Character;

public abstract class CharacterFactory {

    public abstract Character createCharacter();

    // for abstract factory (createWeapon)
    public abstract Weapon createWeapon();
}
