package ru.topics.generics.interfaces;

public interface GenericInterface <T, S> {
    /**
     * @param t - любой класс который захотим
     * @param s - любой класс который захотим
     */
    void handle(T t, S s);
}
