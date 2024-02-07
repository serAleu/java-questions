package ru.topics.nested_classes.inner_classes;

public class InnerClassProcessor {

    public static void main(String[] args) {

        /**
         * Для создания объекта вложенного класса необходим уже созданный объект внешнего класса. При создании объекта
         * вложенного класса в этот объект неявно передается ссылка на объект внешнего класса.
         */
        Car car = new Car("Red", "Lightning McQueen");
        Car.PublicInnerClass innerClass = car.new PublicInnerClass();

        /**
         * Публичные методы вложенного класса вызываются объектом этого вложенного класса - innerClass
         */
        innerClass.printCarName();
        innerClass.callCarNameGetMethod();
        innerClass.printCarWeight();

        /**
         * Мы не смогли обратиться к приватному методу класса PublicInnerClass через объект innerClass т.к. приватные
         * методы внутреннего класса доступны только во внешнем классе
         */
//        innerClass.printCarColor();
        car.callInnerClassPrivateMethodPrintCatColor(innerClass);
    }
}