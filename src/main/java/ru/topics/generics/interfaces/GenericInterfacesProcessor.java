package ru.topics.generics.interfaces;

import ru.topics.generics.utils.CustomClass1;
import ru.topics.generics.utils.CustomClass2;

/**
 * Смотрим как работают дженерики с интерфейсами
 */
public class GenericInterfacesProcessor {

    public static void main(String[] args) {

        /**
         * Так как дженерики в интерфейсе неявно ограничены через extends Object, мы можем подставлять любой тип в
         * класс реализующий GenericInterface.
         */
        OurClass1 ourClass1 = new OurClass1();
        ourClass1.handle(5, "string");

        OurClass2 ourClass2 = new OurClass2();
        ourClass2.handle(new CustomClass1(), new CustomClass2());
    }
}