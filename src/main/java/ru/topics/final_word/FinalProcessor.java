package ru.topics.final_word;

import java.util.Collections;

public class FinalProcessor {

    private final Integer integer = 404;

    public static void main(String[] args) {
        ClassExtendsClassWithFinalMethod classExtendsClassWithFinalMethod = new ClassExtendsClassWithFinalMethod();
        classExtendsClassWithFinalMethod.notFinalMethod();
        classExtendsClassWithFinalMethod.finalMethod();

        FinalProcessor processor = new FinalProcessor();

        /**
         * Компилятор будет ругаться т.к. мы пытаемся переопределить уже инициализированную final переменную
         */
//        processor.integer = 505;

        /**
         * Переменная string1 будет effectively-final т.к. мы инициализировали ее 1 раз и после этого значение
         * не меняли. Переменная string2 effectively-final уже не будет т.к. ее значение меняется дважды.
         */
        String string1 = "string_1";
        String string2 = "string_2";
        string2 = "string_2.1";

    }

}
