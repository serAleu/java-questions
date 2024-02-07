package ru.topics.nested_classes.inner_classes.anonymous_inner_classes.step2;

import ru.topics.nested_classes.inner_classes.anonymous_inner_classes.MonitoringSystem;

public class AnonymousStep2ClassProcessor {

    public static void main(String[] args) {

        /**
         * Здесь и в 2ух примерах ниже выглядит так, словно будто мы создали объект интерфейса, но на самом деле
         * нет. Когда мы запускаем код ниже, внутри JVM происходит следующее:
         *  1) Создается безымянный java-класс имплементирующий интерфейс MonitoringSystem.
         *  2) Компилятор проверяет, что методы этого интерфейса переопределены.
         *  3) Создается объект этого класса.
         * Такой подход занимает меньше места т.к. нам не нужно создавать лишние классы. Далее такая запись была
         * еще более оптимизирована с помощью лямбда выражений, но об этом см. пакет lambda.
         */
        MonitoringSystem generalModule = new MonitoringSystem() {
            @Override
            public void startMonitoring() {
                System.out.println("Мониторинг общих показателей стартовал!");
            }
        };

        MonitoringSystem errorModule = new MonitoringSystem() {
            @Override
            public void startMonitoring() {
                System.out.println("Мониторинг отслеживания ошибок стартовал!");
            }
        };

        MonitoringSystem securityModule = new MonitoringSystem() {
            @Override
            public void startMonitoring() {
                System.out.println("Мониторинг безопасности стартовал!");
            }
        };

        /**
         * Здесь же вызываем необходимые методы у наших анонимных классов при этом помним, что они видны только
         * в пределах метода в котором они были объявлены.
         */
        generalModule.startMonitoring();
        errorModule.startMonitoring();
        securityModule.startMonitoring();
    }

}
