package ru.topics.nested_classes.inner_classes.method_local_inner_classes;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class MethodLocalInnerClassProcessor {

    public static void main(String[] args) {
        Car car = new Car("Red", "Any Name");
        boolean nameIsValid = car.validateName(Collections.singletonList(car.getName()));
        System.out.println("Имя валидно? " + nameIsValid);
    }

}
