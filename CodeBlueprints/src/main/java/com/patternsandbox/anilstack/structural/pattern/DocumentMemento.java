package com.patternsandbox.anilstack.structural.pattern;

/**
 * @author 𝓐𝓷𝓲𝓵𝓡𝓪𝓳𝓾
 * Memento pattern is used to capture and restore the state of the object without violatingg its encapsulation.
 * it allows you to save the state of the object and restore at given point of time.
 *
 * Memento: Represents the saved state of the object, contains necessary info. to restore objects.
 *          this class is hidden from other parts of application to maintain encapsulation.
 *
 * Originator: Object whose state is being saved and restored. and creates a Memento that contains a snapshot
 *             of its current state.
 *
 * CareTaker: manage the mementos. request a memento from originator to save its state and provides memento back
 *            to originator when rollback is needed.
 *
 *
 */
public class DocumentMemento {


    private final String content;

    public DocumentMemento(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

}
