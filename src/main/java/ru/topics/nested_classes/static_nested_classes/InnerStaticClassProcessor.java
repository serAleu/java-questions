package ru.topics.nested_classes.static_nested_classes;

public class InnerStaticClassProcessor {

    public static void main(String[] args) {

        /**
         * Т.к. при создании объекта статического вложенного класса ссылка на внешний класс не передается, использовать
         * конструктор класса OuterClass здесь нет необходимости.
         */
        OuterClass.InnerStaticClass innerStaticClass = new OuterClass.InnerStaticClass();

        /**
         * Получаем статическую переменную класса Car
         */
        innerStaticClass.printOuterStaticVar();
    }
}
