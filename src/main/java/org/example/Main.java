package org.example;

import org.example.FactoryDP.characters.Character;
import org.example.FactoryDP.factory.CharacterFactory;
import org.example.FactoryDP.factory.WarriorFactory;
import org.example.FactoryDP.factory.WizardFactory;

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