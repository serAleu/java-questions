package ru.topics.nested_classes.inner_classes.anonymous_inner_classes.step1;

public class AnonymousStep1ClassProcessor {

    public static void main(String[] args) {

        /**
         * Мы создали 3 класса, 1 интерфейс и написали еще 6 строк кода чтобы вызвать 3 метода 1 раз. Слишком много
         * ненужного кода. Иди в папку step2.
         */
        GeneralIndicatorsMonitoringModule generalModule = new GeneralIndicatorsMonitoringModule();
        ErrorMonitoringModule errorModule = new ErrorMonitoringModule();
        SecurityModule securityModule = new SecurityModule();

        generalModule.startMonitoring();
        errorModule.startMonitoring();
        securityModule.startMonitoring();
    }
}