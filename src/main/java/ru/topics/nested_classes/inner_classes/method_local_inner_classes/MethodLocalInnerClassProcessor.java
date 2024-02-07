package ru.topics.nested_classes.inner_classes.method_local_inner_classes;

import java.util.Collections;

public class MethodLocalInnerClassProcessor {

    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass("Red", "Any Name");
        boolean nameIsValid = outerClass.validateName(Collections.singletonList(outerClass.getOuterPrivateIntVar()));
        System.out.println("Строка валидна? " + nameIsValid);
    }

}
