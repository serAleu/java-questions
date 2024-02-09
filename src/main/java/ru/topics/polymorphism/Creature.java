package ru.topics.polymorphism;

public abstract class Creature {

    public abstract void makeSound();

    public void createSmth() {
        System.out.println(this.getClass());
    }
}
