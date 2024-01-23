package org.example.creational_DP.FactoryMethod.factory;

import org.example.creational_DP.AbstractFactory.weapons.MagicWand;
import org.example.creational_DP.AbstractFactory.weapons.Weapon;
import org.example.creational_DP.FactoryMethod.characters.Character;
import org.example.creational_DP.FactoryMethod.characters.Wizard;

public class WizardFactory extends CharacterFactory {
    @Override
    public Character createCharacter() {
        return new Wizard("Milkica", 100);
    }

    // for abstract factory
    @Override
    public Weapon createWeapon() {
        return new MagicWand();
    }
}
