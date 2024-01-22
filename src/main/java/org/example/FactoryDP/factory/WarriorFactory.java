package org.example.FactoryDP.factory;

import org.example.FactoryDP.characters.Character;
import org.example.FactoryDP.characters.Warrior;

public class WarriorFactory extends CharacterFactory {
    @Override
    public Character createCharacter() {
        return new Warrior("Pera", 80, true);
    }
}
