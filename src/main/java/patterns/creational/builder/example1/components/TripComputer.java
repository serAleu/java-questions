package patterns.creational.builder.example1.components;

import lombok.Setter;
import patterns.creational.builder.example1.cars.Car;

@Setter
public class TripComputer {
    private Car car;

    public void showFuelLevel() {
        System.out.println("Fuel level: " + car.getFuel());
    }

    public void showStatus() {
        if (this.car.getEngine().isStarted()) {
            System.out.println("Car is started");
        } else {
            System.out.println("Car isn't started");
        }
    }
}
