package org.example.creational_DP.AbstractFactory;

import org.example.creational_DP.AbstractFactory.weapons.Weapon;
import org.example.creational_DP.FactoryMethod.characters.Character;
import org.example.creational_DP.FactoryMethod.factory.CharacterFactory;
import org.example.creational_DP.FactoryMethod.factory.WarriorFactory;
import org.example.creational_DP.FactoryMethod.factory.WizardFactory;

public class Main {
    public static void main(String[] args) {
        CharacterFactory warriorFactory = new WarriorFactory();
        Character warrior = warriorFactory.createCharacter();
        Weapon warriorWeapon = warriorFactory.createWeapon();

        System.out.println("Warrior created: " + warrior.getName());
        System.out.println("Weapon for Warrior: " + warriorWeapon.getName());

        System.out.println();

        CharacterFactory wizardFactory = new WizardFactory();
        Character wizard = wizardFactory.createCharacter();
        Weapon wizardWeapon = wizardFactory.createWeapon();

        System.out.println("Wizard created: " + wizard.getName());
        System.out.println("Weapon for Wizard: " + wizardWeapon.getName());
    }
}
