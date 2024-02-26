package patterns.creational.builder.example1;

import patterns.creational.builder.example1.builders.CarBuilder;
import patterns.creational.builder.example1.builders.CarManualBuilder;
import patterns.creational.builder.example1.cars.Car;
import patterns.creational.builder.example1.cars.Manual;
import patterns.creational.builder.example1.director.Director;

public class BuilderExample1Processor {
    public static void main(String[] args) {
        Director director = new Director();

        // Директор получает объект конкретного строителя от клиента
        // (приложения). Приложение само знает какой строитель использовать,
        // чтобы получить нужный продукт.
        CarBuilder builder = new CarBuilder();
        director.constructSportsCar(builder);

        // Готовый продукт возвращает строитель, так как Директор чаще всего не
        // знает и не зависит от конкретных классов строителей и продуктов.
        Car car = builder.getResult();
        System.out.println("Car built:\n" + car.getCarType());

        // Директор может знать больше одного рецепта строительства.
        CarManualBuilder manualBuilder = new CarManualBuilder();
        director.constructCityCar(manualBuilder);
        Manual carManual = manualBuilder.getResult();
        System.out.println("\nCar manual built:\n" + carManual.print());
    }
}
