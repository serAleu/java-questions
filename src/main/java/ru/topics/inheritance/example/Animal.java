package ru.topics.inheritance.example;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public abstract class Animal {

    private Integer age;
    private String name;

    public abstract void makeSound();

    public void doSmth(String name) {
        System.out.println(name + " что то делает");
    }
}
