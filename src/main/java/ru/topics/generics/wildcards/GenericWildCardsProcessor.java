package ru.topics.generics.wildcards;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Смотрим как работают дженерики с wildcards.
 * Wildcards в java могут быть как ковариантны, так и контрвариантны (см. Readme.txt), зависит от ограничения
 * заданного в wildcard
 */
public class GenericWildCardsProcessor {

    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1,2,3);

        /**
         * Такая коллекция с wildcard вида <? extends ...> может содержать объекты класс которых является Number или
         * наследуется от Number. Указанная ниже wildcard является Producer - это значит что эта коллекция может
         * предоставлять элементы, но получать элементы из этой коллекции нельзя.
         * Ковариантная wildcard:
         */
        List<? extends Number> numbersExtends = integerList;
//        numbersExtends.add(5);
        for(int i = 0; i < numbersExtends.size(); i++) {
            System.out.println(numbersExtends.get(i));
        }

        /**
         * Такая коллекция может содержать объекты, класс которых является Integer, или у которых Integer
         * является наследником. Указанная ниже wildcard вида <? super ...> является Consumer - из такой коллекции
         * можно получать элементы только класса Object, при попытке получить другой тип получим compile-time error.
         * Добавлять элементы в такую коллекцию можно без проблем.
         * Контрвариантная wildcard:
         */
        List<? super Integer> numbersSuper = new ArrayList<>();
        numbersSuper.add(5);
//        Integer integer = numbersSuper.get(0);
        for(int i = 0; i < numbersSuper.size(); i++) {
            System.out.println(numbersSuper.get(i));
        }
    }
}
