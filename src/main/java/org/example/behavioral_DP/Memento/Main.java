package org.example.behavioral_DP.Memento;

public class Main {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        History history = new History();

        history.save(editor.save());

        editor.write("Hello, ");

        history.save(editor.save());

        editor.write("World!");

        history.save(editor.save());

        System.out.println("Current Content: " + editor.getContent());

        EditorMemento undoMemento = history.undo();
        if (undoMemento != null) {
            editor.restore(undoMemento);
            System.out.println("Undo: " + editor.getContent());
        }

        EditorMemento redoMemento = history.undo();
        if (redoMemento != null) {
            editor.restore(redoMemento);
            System.out.println("Redo: " + editor.getContent());
        }
    }
}
