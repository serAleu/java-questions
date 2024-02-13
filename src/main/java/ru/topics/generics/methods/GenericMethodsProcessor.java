package ru.topics.generics.methods;

import ru.topics.generics.utils.BaseCustomClass;
import ru.topics.generics.utils.CustomClass1;

/**
 * Смотрим как работают дженерики с методами
 */
public class GenericMethodsProcessor {
    public static void main(String[] args) {

        /**
         * Мы типизировали как и параметры метода example, так и возвращаемый ими тип. Смотри внимательно на этот пример
         * чаще всего дженерики работают в паре с наследованием.
         * <N extends Number, S extends BaseCustomClass> - объявление дженериков с которыми этот метод будет работать
         * S - тип возвращаемого значения
         * N n, CustomClass1 clazz - переменные на вход
         */
        BaseCustomClass clazz = example(1, new CustomClass1());
        System.out.println(clazz.getClass().getName());
    }

    private static <N extends Number, S extends BaseCustomClass> S example(N n, S clazz) {
        System.out.println("Внутри метода example, переданные параметры n = " + n.getClass().getName() + " clazz = "
                + clazz.getClass().getName());
        return clazz;
    }
}
