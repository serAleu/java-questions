package ru.topics.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * Ниже представлено 5 примеров использования лямбды, каждый из них записан в 2ух вариантах,
 * 1ый - через анонимный класс,
 * 2ой - с помощью лямбды
 */
public class LambdaProcessor {

    public static void main(String[] args) {
        String str = "justString";
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);

        /**
         * 1) Использование лямбды напрямую, без вызова стороннего метода без возвращаемого значения (пустые ())
         */
        FunctionalInterfaceExample1 functionalInterfaceExample1 = new FunctionalInterfaceExample1() {
            @Override
            public void doSomething() {
                System.out.println("Внутри анонимного класса");
            }
        };
        functionalInterfaceExample1.doSomething();
        FunctionalInterfaceExample1 functionalInterfaceExample2 = () -> System.out.println("Внутри лямбды");
        functionalInterfaceExample2.doSomething();

        /**
         * 2) Использование лямбды напрямую, без вызова стороннего метода с возвращаемым значением
         */
        FunctionalInterfaceExample2 example = new FunctionalInterfaceExample2() {
            @Override
            public String doSomething(String justString) {
                return justString;
            }
        };
        example.doSomething(str);
        FunctionalInterfaceExample2 example1 = (string) -> string;
        example1.doSomething(str);

        /**
         * 3) В лямбда-выражении не обязательно указывать интерфейс т.к. компилятор сам понимает что нам необходимо из
         * контекста.
         */
        System.out.println(printString(str, new FunctionalInterfaceExample2() {
            @Override
            public String doSomething(String str) {
                return str + " внутри анонимного класса";
            }
        }));
        System.out.println(printString(str + " внутри лямбды", arg -> arg));

        /**
         * 4) Вывести все числа
         */
        evaluate(" используя анонимный класс", list, new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return true;
            }
        });
        evaluate(" используя лямбду", list, (n) -> true);

        /**
         * 5) Вывести все четные числа
         */
        evaluate(" используя анонимный класс", list, new Predicate<Integer>() {
            @Override
            public boolean test(Integer n) {
                return n %2 == 0;
            }
        });
        evaluate(" используя лямбду", list, (n) -> n%2 == 0 );
    }

    private static String printString(String str, FunctionalInterfaceExample2 functionalInterfaceExample2) {
        return functionalInterfaceExample2.doSomething(str);
    }

    private static void evaluate(String str, List<Integer> list, Predicate<Integer> predicate) {
        for(Integer n: list)  {
            if(predicate.test(n)) {
                System.out.print(n + " ");
            }
        }
        System.out.println(str);
    }
}
