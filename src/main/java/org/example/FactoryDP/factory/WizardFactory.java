package org.example.FactoryDP.factory;

import org.example.FactoryDP.characters.Character;
import org.example.FactoryDP.characters.Wizard;

public class WizardFactory extends CharacterFactory {
    @Override
    public Character createCharacter() {
        return new Wizard("Milkica", 100);
    }
}
