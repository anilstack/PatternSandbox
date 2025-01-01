package com.patternsandbox.anilstack.structural.starter;

import com.patternsandbox.anilstack.structural.pattern.DocumentOriginator;
import com.patternsandbox.anilstack.structural.pattern.EditorHistoryCareTaker;

/**
 * @author 𝓐𝓷𝓲𝓵𝓡𝓪𝓳𝓾
 */
public class MementoPatternDemo {

    public static void main(String[] args) {

        DocumentOriginator documentOriginator = new DocumentOriginator();
        EditorHistoryCareTaker editorHistoryCareTaker = new EditorHistoryCareTaker();

        documentOriginator.write("Hello Welcomme To Design Pattern Course To Enhance Your Software Skills");
        editorHistoryCareTaker.save(documentOriginator);

        System.out.println("Current Content: "+documentOriginator.getContent());

        documentOriginator.write("Here We are going to cover Gang Of four Design Patterns");
        editorHistoryCareTaker.save(documentOriginator);

        System.out.println("Current Content: "+documentOriginator.getContent());

        //undo the last operation
        editorHistoryCareTaker.undo(documentOriginator);
        System.out.println("After Performing Undo: "+documentOriginator.getContent());

        editorHistoryCareTaker.undo(documentOriginator);
        System.out.println("After Performing Undo: "+documentOriginator.getContent());

        editorHistoryCareTaker.undo(documentOriginator);
        System.out.println("After Performing Undo: "+documentOriginator.getContent());

    }


}
