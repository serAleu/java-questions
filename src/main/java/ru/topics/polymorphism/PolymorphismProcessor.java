package ru.topics.polymorphism;

import ru.topics.polymorphism.impl.Cat;
import ru.topics.polymorphism.impl.Human;
import ru.topics.polymorphism.impl.Robot;

import java.util.Arrays;
import java.util.List;

public class PolymorphismProcessor {

    /**
     * Демонстрация как работает полиморфизм в java:
     * Классы Cat, Human и Robot наследуются от класса Creature и имплементируют интерфейс Running.
     * В каждом из этих классов переопределены методы run() из Интерфейса Running и makeSound() из
     * класса Creature. Переопределение методов - это проявление полиморфизма.
     */
    public static void main(String[] args) {

        /**
         * Компилятор не ругается на несоответствие типов, объявленных слева и справа от знака присваивания,
         * потому что тут работает восходящее преобразование типов — ссылка на объект интерпретируется,
         * как ссылка на базовый класс.
         */
        Creature cat = new Cat();
        Creature human = new Human();
        Creature robot = new Robot();

        List<Creature> creatureList = Arrays.asList(cat, human, robot);

        /**
         * Зная, что лист содержит только наследников от Creature, мы можем вызвать у каждого наследника
         * метод createSmth() т.к. этот метод находится в классе-родителе Creature.
         */
        creatureList.forEach(Creature::createSmth);

        List<Running> runnings = Arrays.asList(new Cat(), new Human(), new Robot());

        runnings.forEach(Running::run);

        process(creatureList);
        process((Creature) new Human());
        process((Running) new Cat());
    }

    /**
     * Метод process() перегружен, это ad-hoc (не истинный) полиморфизм.
     */
    private static void process(List<Creature> creatureList) {

        /**
         * Метод makeSound() должен быть переопределен в каждом наследнике от Creature, поэтом мы
         * можем его здесь вызывать указав только то, что лист содержит элементы класса Creature.
         * Но каким образом java узнает какой именно метод makeSound() нужно вызвать?
         * Дело в позднем (динамическом) связывании (см. Раннее\позднее связывание).
         */
        creatureList.forEach(Creature::makeSound);
    }

    private static void process(Creature creature) {
        creature.makeSound();
    }

    private static void process(Running running) {
        running.run();
    }
}