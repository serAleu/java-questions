package patterns.structural.decorator.example1.impl;

import patterns.structural.decorator.example1.DataSource;

/**
 * Базовый декоратор
 */
public class DataSourceDecorator implements DataSource {

    private DataSource wrapper;

    public DataSourceDecorator(DataSource wrapper) {
        this.wrapper = wrapper;
    }

    @Override
    public void writeData(String data) {
        wrapper.writeData(data);
    }

    @Override
    public String readData() {
        return wrapper.readData();
    }
}
