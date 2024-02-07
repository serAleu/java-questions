package ru.topics.nested_classes.inner_classes.anonymous_inner_classes.step1;

import ru.topics.nested_classes.inner_classes.anonymous_inner_classes.MonitoringSystem;

public class ErrorMonitoringModule implements MonitoringSystem {

    @Override
    public void startMonitoring() {
        System.out.println("Мониторинг отслеживания ошибок стартовал!");
    }
}
