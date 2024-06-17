package ru.topics.stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPIProcessor {

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("one", "two", "three", "four", "five");
        List<Integer> integers = Arrays.asList(5, 5, 51, 2, 3, 4, 5, 5, 5, 5, 5);
        Map<Integer, String> map = Map.of(1, "1", 2, "2", 3, "3", 4, "5");
        String[] stringArray = new String[]{"Winter", "Spring", "Summer", "Autumn"};

        /**
         * Пустой стрим
         */
        Stream.empty();

        /**
         * Стрим из List
         */
        strings.stream();

        /**
         * Стрим из Map
         */
        map.entrySet().stream();

        /**
         * Стрим из массива
         */
        Arrays.stream(stringArray);

        /**
         * Стрим из элементов
         */
        Stream.of(1, 2, 3);

        /**
         * Найти максимальное число в наборе
         */

        Stream.of(5, 3, 4, 55, 2)
                .mapToInt(a -> a)
                .max()
                .getAsInt(); //55

        /**
         * Получить сумму всех чисел в наборе
         */

        Stream.of(5, 3, 4, 55, 2)
                .mapToInt(a -> a)
                .sum(); //69

        /**
         * Получить среднее значение всех чисел
         */

        Stream.of(5, 3, 4, 55, 2)
                .mapToInt(a -> a)
                .average()
                .getAsDouble(); //13.8

        /**
         * Пример использования 2ух промежуточных операторов filter() и map() и терминального collect()
         */
        integers.stream()
                .filter(x -> x > 2)
                .map(String::valueOf)
                .collect(Collectors.joining());

        /**
         * Пример использования 2ух промежуточных операторов distinct() и sorted() и терминального forEach()
         */
        integers.stream()
                .distinct()
                .sorted()
                .forEach(System.out::println);
    }
}
