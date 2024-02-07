package ru.topics.inheritance.example.animals;

import ru.topics.inheritance.example.Animal;

public class Cat extends Animal {

    public Cat(Integer age, String name) {
        super(age, name);
    }

    @Override
    public void makeSound() {
        System.out.println("Мур мяу");
    }
}
