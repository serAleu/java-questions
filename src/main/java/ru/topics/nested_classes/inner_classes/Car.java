package ru.topics.nested_classes.inner_classes;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
public class Car {

    public String color;
    private static int weight = 1000;
    private String name;

    public Car(String color, String name) {
        this.color = color;
        this.name = name;
    }

    /**
     * Ниже мы видим, что внутренний класс действительно имеет доступ ко всем переменным и методам внешнего класса
     */
    @AllArgsConstructor
    public class PublicInnerClass {

        public void callCarNameGetMethod() {
            System.out.println("Мы использовали метод внешнего класса: " + Car.this.getName());
        }

        public void printCarName() {
            System.out.println("Мы обратились напрямую к приватной переменной внешнего класса: " + Car.this.name);
        }

        public void printCarWeight() {
            System.out.println("Мы обратились напрямую к приватной статической переменной внешнего класса: "
                    + Car.weight);
        }

        private void printCarColor() {
            System.out.println("Мы обратились напрямую к публичной переменной внешнего класса: " + Car.this.color);
        }
    }

    public void callInnerClassPrivateMethodPrintCatColor(PublicInnerClass innerClass) {
        innerClass.printCarColor();
    }

    /**
     * Мы успешно создали объект внутреннего класса в обычном методе внешнего класса
     */
    private void createInnerClassObject() {
        Car.PublicInnerClass innerClass = new PublicInnerClass();
    }

    /**
     * Мы не можем создать объект внутреннего класса в статическом методе
     */
    private static void createInnerClassObjectInAStaticMethod() {
//        Car.PublicInnerClass innerClass = new PublicInnerClass();
    }
}