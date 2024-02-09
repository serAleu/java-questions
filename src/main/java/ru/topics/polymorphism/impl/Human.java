package ru.topics.polymorphism.impl;

import ru.topics.polymorphism.Creature;
import ru.topics.polymorphism.Running;

public class Human extends Creature implements Running {
    @Override
    public void run() {
        System.out.println("Человек побежал");
    }

    @Override
    public void makeSound() {
        System.out.println("Где я?");
    }
}
