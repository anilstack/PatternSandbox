package com.patternsandbox.anilstack.structural.pattern;

import java.util.Stack;

/**
 * @author 𝓐𝓷𝓲𝓵𝓡𝓪𝓳𝓾
 *
 * CareTaker: manage the mementos. request a memento from originator to save its state and provides memento back
 *            to originator when rollback is needed.
 *
 */
public class EditorHistoryCareTaker {

    private final Stack<DocumentMemento> history = new Stack<>();

    public void save(DocumentOriginator originator) {
        history.push(originator.save());
    }

    public void undo(DocumentOriginator originator) {
        if (!history.isEmpty()) {
            originator.restore(history.pop());
        } else {
            System.out.println("No State to undo!");
        }
    }

}
