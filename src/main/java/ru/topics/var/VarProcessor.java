package ru.topics.var;

import java.util.List;

public class VarProcessor {
    public static void main(String[] args) {
        var intVar = 10;
        var stringVar = "string";
        var boolVar = true;
        var integerVar = Integer.valueOf(4);
        final var finalLongVar = 10L;
        var numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        /**
         * Переменную типа var необходимо инициализировать сразу после объявления, в примере ниже получим
         * compile-time error
         */
//        var t;
//        t = 10;

        System.out.println("var intVar = " + intVar);
        System.out.println("var stringVar = " + stringVar);
        System.out.println("var boolVar = " + boolVar);
        System.out.println("var integerVar = " + integerVar);
        System.out.println("var finalLongVar = " + finalLongVar);
        for (var number : numbers){
            System.out.println(number);
        }
    }
}
