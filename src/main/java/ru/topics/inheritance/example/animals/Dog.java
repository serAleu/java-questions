package ru.topics.inheritance.example.animals;

import ru.topics.inheritance.example.Animal;

public class Dog extends Animal {

    public Dog(Integer age, String name) {
        super(age, name);
    }

    @Override
    public void makeSound() {
        System.out.println("Тяв гав");
    }
}
