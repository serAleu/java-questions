package ru.topics.generics.interfaces;

public class OurClass1 implements GenericInterface<Integer, String> {

    /**
     * @param i - мы ограничили этот параметр классом Integer
     * @param s - мы ограничили этот параметр классом String
     */
    @Override
    public void handle(Integer i, String s) {
        System.out.println(this.getClass().getName() + " принял на вход " + i.getClass().getName() + " и " +
                s.getClass().getName());
    }
}
