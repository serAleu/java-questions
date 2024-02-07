package ru.topics.nested_classes.static_nested_classes;

public class OuterClass {

    public String outerPublicStringVar;
    private String outerPrivateStringVar;
    private static int outerStaticIntVar = 1000;
    public OuterClass(String outerPublicStringVar, String outerPrivateStringVar) {
        this.outerPublicStringVar = outerPublicStringVar;
        this.outerPrivateStringVar = outerPrivateStringVar;
    }

    public static class InnerStaticClass {

        /**
         * У статического вложенного класса есть доступ только к статической переменной weight, к остальным переменным
         * мы обращаться здесь не можем
         */
        public void printOuterStaticVar() {
            System.out.println("Мы обратились напрямую к приватной статической переменной внешнего класса: "
                    + OuterClass.outerStaticIntVar);
        }
    }
}