package ru.topics.polymorphism.impl;

import ru.topics.polymorphism.Creature;
import ru.topics.polymorphism.Running;

public class Robot extends Creature implements Running {
    @Override
    public void run() {
        System.out.println("Робот побежал");
    }

    @Override
    public void makeSound() {
        System.out.println("Осторожно, двери закрываются!");
    }
}
