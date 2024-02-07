package ru.topics.inheritance.example.animals;

import ru.topics.inheritance.example.Animal;

public class Bird extends Animal {

    public Bird(Integer age, String name) {
        super(age, name);
    }

    @Override
    public void makeSound() {
        System.out.println("Чык чирык");
    }
}
