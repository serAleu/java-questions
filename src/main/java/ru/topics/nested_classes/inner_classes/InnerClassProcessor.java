package ru.topics.nested_classes.inner_classes;

public class InnerClassProcessor {

    public static void main(String[] args) {

        /**
         * Для создания объекта вложенного класса необходим уже созданный объект внешнего класса. При создании объекта
         * вложенного класса в этот объект неявно передается ссылка на объект внешнего класса.
         */
        OuterClass outerClass = new OuterClass("Red", "Lightning McQueen");
        OuterClass.InnerClass innerClass = outerClass.new InnerClass();

        /**
         * Публичные методы вложенного класса вызываются объектом этого вложенного класса - innerClass
         */
        innerClass.printOuterPrivateVar();
        innerClass.callGetMethod();
        innerClass.printOuterStaticVar();

        /**
         * Мы не смогли обратиться к приватному методу класса PublicInnerClass через объект innerClass т.к. приватные
         * методы внутреннего класса доступны только во внешнем классе
         */
//        innerClass.printCarColor();
        outerClass.callInnerClassPrivateMethodPrintOuterPublicVar(innerClass);
    }
}