package org.example.behavioral_DP.Memento;

import java.util.ArrayList;
import java.util.List;

public class History {
    private List<EditorMemento> mementos = new ArrayList<>();

    public void save(EditorMemento memento) {
        mementos.add(memento);
    }

    public EditorMemento undo() {
        if (mementos.isEmpty()) {
            return null;
        }
        EditorMemento lastMemento = mementos.remove(mementos.size() - 1);
        return lastMemento;
    }
}
