package ru.topics.nested_classes.inner_classes.method_local_inner_classes;

import lombok.Getter;
import org.apache.commons.lang3.StringUtils;

import java.util.List;

@Getter
public class OuterClass {

    public String outerPublicStringVar;
    private String outerPrivateIntVar;
    private static int outerStaticIntVar = 1000;

    public OuterClass(String outerPublicStringVar, String outerPrivateIntVar) {
        this.outerPublicStringVar = outerPublicStringVar;
        this.outerPrivateIntVar = outerPrivateIntVar;
    }

    public boolean validateName(final List<String> names) {

        /**
         * Переменная validString является effectively final поэтому мы можем ее использовать во вложенном локальном классе
         */
        String validString = "Lightning McQueen";

        for (String name : names) {

            /**
             * Мы создали вложенный локальный класс внутри метода внутри цикла for, класс проверяет, что среди
             * строк присутствует строка Lightning McQueen. Заметь, что класс написан без модификатора доступа
             */
            class StringValidator {
                private boolean isValid() {
                    return StringUtils.equals(validString, name);
                }

                private Integer tryToGetStaticVar() {
                    return outerStaticIntVar;
                }

                private String tryToGetOuterStaticVar() {
                    return OuterClass.this.outerPrivateIntVar;
                }
            }

            /**
             * Объект вложенного локального класса может быть создан только внутри метода в котором он объявлен
             */
            StringValidator validator = new StringValidator();
            System.out.println("Доступ к приватной переменной внешнего класса: " + validator.tryToGetOuterStaticVar());
            System.out.println("Доступ к статической переменной внешнего класса: " + validator.tryToGetStaticVar());
            if (validator.isValid()) return true;
        }
        return false;
    }
}