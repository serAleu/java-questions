package ru.topics.final_word;

public class ClassWithFinalMethod {

    public final void finalMethod(){
        System.out.println("ClassWithFinalMethod, внутри final метода");
    }

    public void notFinalMethod(){
        System.out.println("ClassWithFinalMethod, я внутри обычного метода");
    }
}