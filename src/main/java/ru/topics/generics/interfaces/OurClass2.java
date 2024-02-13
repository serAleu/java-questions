package ru.topics.generics.interfaces;

import ru.topics.generics.utils.CustomClass1;
import ru.topics.generics.utils.CustomClass2;

public class OurClass2 implements GenericInterface<CustomClass1, CustomClass2> {

    /**
     * @param i - мы ограничили этот параметр собственным классом CustomClass1
     * @param s - мы ограничили этот параметр собственным классом CustomClass2
     */
    @Override
    public void handle(CustomClass1 customClass1, CustomClass2 customClass2) {
        System.out.println(this.getClass().getName() + " принял на вход " + customClass1.getClass().getName() + " и " +
                customClass2.getClass().getName());
    }
}
