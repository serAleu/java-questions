package ru.topics.inheritance.example;

import ru.topics.inheritance.example.animals.Bird;
import ru.topics.inheritance.example.animals.Cat;
import ru.topics.inheritance.example.animals.Dog;

public class InheritanceProcessor {

    /**
     * Демонстрация как работает наследование в java:
     * В качестве родителя выступает абстрактный класс Animal, который имеет один метод doSmth() с реализацией, один
     * абстрактный метод makeSound() и две переменных age (int) и name (string) с геттерами и сеттерами.
     * В качестве наследников выступают три класса Cat, Dog и Bird. Каждый из этих классов реализует makeSound() и
     * обращается к родительскому методу doSmth() в ходе выполнения в методе main(). Так же тут демонстрируется как
     * работает конструктор matching super в каждом из этих классов.
     */
    public static void main(String[] args) {
        Animal cat = new Cat(5, "Кошка Мурка");
        Animal dog = new Dog(7, "Собачка Дружок");
        Animal bird = new Bird(2, "Чык чирык");

        cat.makeSound();
        dog.makeSound();
        bird.makeSound();

        cat.doSmth(cat.getName());
        dog.doSmth(dog.getName());
        bird.doSmth(bird.getName());
    }

}
