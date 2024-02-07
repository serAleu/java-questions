package ru.topics.nested_classes.inner_classes.method_local_inner_classes;

import lombok.Getter;
import org.apache.commons.lang3.StringUtils;

import java.util.List;

@Getter
public class Car {

    public String color;
    private static int weight = 1000;
    private String name;

    public Car(String color, String name) {
        this.color = color;
        this.name = name;
    }

    public boolean validateName(final List<String> names) {

        /**
         * Переменная carName является effectively final поэтому мы можем ее использовать во вложенном локальном классе
         */
        String carName = "Lightning McQueen";

        for (String name : names) {

            /**
             * Мы создали вложенный локальный класс внутри метода внутри цикла for, класс проверяет, что среди
             * автомобилей присутствует Молний Маккуин. Заметь, что класс написан без модификатора доступа
             */
            class NameValidator {
                private boolean isValid() {
                    return StringUtils.equals(carName, name);
                }

                private Integer tryToGetStaticVar() {
                    return weight;
                }

                private String tryToGetCarName() {
                    return Car.this.name;
                }
            }

            /**
             * Объект вложенного локального класса может быть создан только внутри метода в котором он объявлен
             */
            NameValidator validator = new NameValidator();
            System.out.println("Доступ к приватной переменной внешнего класса: " + validator.tryToGetCarName());
            System.out.println("Доступ к статической переменной внешнего класса: " + validator.tryToGetStaticVar());
            if (validator.isValid()) return true;
        }
        return false;
    }
}