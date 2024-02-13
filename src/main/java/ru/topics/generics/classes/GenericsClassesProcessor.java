package ru.topics.generics.classes;

import ru.topics.generics.classes.Box;
import ru.topics.generics.classes.actions.Action;
import ru.topics.generics.classes.actions.Burn;
import ru.topics.generics.classes.actions.Shake;
import ru.topics.generics.classes.items.Item;
import ru.topics.generics.classes.items.Pen;
import ru.topics.generics.classes.items.Toy;

import java.util.Arrays;
import java.util.List;

/**
 * Смотрим как работают дженерики с классами
 */
public class GenericsClassesProcessor {

    public static void main(String[] args) {
        Toy toy = new Toy();
        Pen pen = new Pen();
        Burn burn = new Burn();
        Shake shake = new Shake();

        /**
         * Ниже представлено два примера как java работает с дженериками в классе. В обоих примерах объекты
         * имеют одного и того же родителя как это было указано в классе Box.
         */
        Box<Toy, Burn> toyBurnBox = new Box<>();
        toyBurnBox.setItem(toy);
        toyBurnBox.setAction(burn);
        toyBurnBox.getItem().introduceItself();
        toyBurnBox.getAction().doAction();

        Box<Pen, Shake> penShakeBox = new Box<>();
        penShakeBox.setItem(pen);
        penShakeBox.setAction(shake);
        penShakeBox.getItem().introduceItself();
        penShakeBox.getAction().doAction();

        /**
         * В этих примерах соблюдается принцип подстановки Барбары Лисков. Т.е. код, использующий объект родителя
         * должен работать корректно и с объектом потомка
         */
        Box<Item, Action> itemActionBox = new Box<>();
        itemActionBox.setItem(toy);
        itemActionBox.setAction(shake);
        itemActionBox.getItem().introduceItself();
        itemActionBox.getAction().doAction();

        variances();
    }

    private static void variances() {
        List<Integer> integerList = Arrays.asList(1,2,3);
        List<Number> numList = Arrays.asList(1,2,3);

        /**
         * Массивы в java ковариантны (см. Readme.txt), поэтому, так писать можно
         */
        Integer[] integers = new Integer[]{1,2,3};
        Number[] numbers = integers;

        /**
         * Дженерики в java инварианты (см. Readme.txt), поэтому, так написать не получится
         */
//        List<Number> numberList = integerList;

        /**
         * Wildcards в java могут быть как ковариантны, так и контрвариантны (см. Readme.txt), зависит от
         * ограничения заданного в wildcard
         */
        /**
         * Ковариантная wildcard:
         */
        List<? extends Number> covarianceWildcard = integerList;

        /**
         * Контрвариантная wildcard:
         */
        List<? super Integer> contravarianceWildcard = numList;
    }
}
