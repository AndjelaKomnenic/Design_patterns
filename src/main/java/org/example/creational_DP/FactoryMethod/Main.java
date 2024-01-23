package org.example.creational_DP.FactoryMethod;

import org.example.creational_DP.FactoryMethod.characters.Character;
import org.example.creational_DP.FactoryMethod.factory.CharacterFactory;
import org.example.creational_DP.FactoryMethod.factory.WarriorFactory;
import org.example.creational_DP.FactoryMethod.factory.WizardFactory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose a character type to create (1 for Warrior, 2 for Wizard):");
        int choice = scanner.nextInt();

        CharacterFactory characterFactory = null;

        if (choice == 1) {
            characterFactory = new WarriorFactory();
        } else if (choice == 2) {
            characterFactory = new WizardFactory();
        } else {
            System.out.println("Invalid choice. Exiting program.");
            System.exit(1);
        }

        Character character = characterFactory.createCharacter();
        character.createCharacter();

        scanner.close();
    }
}