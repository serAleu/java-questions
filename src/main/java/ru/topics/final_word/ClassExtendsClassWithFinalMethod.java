package ru.topics.final_word;

public class ClassExtendsClassWithFinalMethod extends ClassWithFinalMethod {

    /**
     * Компилятор будет ругаться т.к. мы пытаемся переопределить final класс
     */
//    @Override
//    public void finalMethod() {}

    @Override
    public void notFinalMethod() {
        System.out.println("ClassExtendsClassWithFinalMethod, я внутри переопределенного обычного метода");
    }
}
