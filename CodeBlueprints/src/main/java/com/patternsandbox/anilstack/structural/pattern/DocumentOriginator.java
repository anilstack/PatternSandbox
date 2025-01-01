package com.patternsandbox.anilstack.structural.pattern;

/**
 * @author 𝓐𝓷𝓲𝓵𝓡𝓪𝓳𝓾
 */
public class DocumentOriginator {

    private String content = "";

    public void write(String text) {
        content += text;
    }

    public String getContent() {
        return content;
    }

    public DocumentMemento save() {
        return new DocumentMemento(content);
    }

    public void restore(DocumentMemento memento) {
        this.content = memento.getContent();
    }

}
