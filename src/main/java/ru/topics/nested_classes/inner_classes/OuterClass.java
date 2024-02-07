package ru.topics.nested_classes.inner_classes;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
public class OuterClass {

    public String outerPublicStringVar;
    private String outerPrivateStringVar;
    private static int outerStaticIntVar = 1000;

    public OuterClass(String outerPublicStringVar, String outerPrivateStringVar) {
        this.outerPublicStringVar = outerPublicStringVar;
        this.outerPrivateStringVar = outerPrivateStringVar;
    }

    /**
     * Ниже мы видим, что внутренний класс действительно имеет доступ ко всем переменным и методам внешнего класса
     */
    @AllArgsConstructor
    public class InnerClass {

        public void callGetMethod() {
            System.out.println("Мы использовали метод внешнего класса: " + OuterClass.this.getOuterPrivateStringVar());
        }

        public void printOuterPrivateVar() {
            System.out.println("Мы обратились напрямую к приватной переменной внешнего класса: " + OuterClass.this.outerPrivateStringVar);
        }

        public void printOuterStaticVar() {
            System.out.println("Мы обратились напрямую к приватной статической переменной внешнего класса: "
                    + OuterClass.outerStaticIntVar);
        }

        private void printOuterPublicVar() {
            System.out.println("Мы обратились напрямую к публичной переменной внешнего класса: " + OuterClass.this.outerPublicStringVar);
        }
    }

    public void callInnerClassPrivateMethodPrintOuterPublicVar(InnerClass innerClass) {
        innerClass.printOuterPublicVar();
    }

    /**
     * Мы успешно создали объект внутреннего класса в обычном методе внешнего класса
     */
    private void createInnerClassObject() {
        InnerClass innerClass = new InnerClass();
    }

    /**
     * Мы не можем создать объект внутреннего класса в статическом методе
     */
    private static void createInnerClassObjectInAStaticMethod() {
//        Car.PublicInnerClass innerClass = new PublicInnerClass();
    }
}