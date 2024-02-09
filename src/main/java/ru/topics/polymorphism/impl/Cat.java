package ru.topics.polymorphism.impl;

import ru.topics.polymorphism.Creature;
import ru.topics.polymorphism.Running;

public class Cat extends Creature implements Running {
    @Override
    public void run() {
        System.out.println("Кошка побежала");
    }

    @Override
    public void makeSound() {
        System.out.println("Мяу!");
    }
}
